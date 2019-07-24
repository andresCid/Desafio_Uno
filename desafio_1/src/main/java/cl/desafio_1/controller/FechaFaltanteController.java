package cl.desafio_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.desafio_1.beans.FechaResponse;
import cl.desafio_1.beans.GrupoFecha;
import cl.desafio_1.service.GrupoFechaService;
import cl.desafio_1.service.WSGetService;

/**
 * Clase que expone la API REST /periodos/resultado
 * @author AndresCidBenitez
*/

@RestController
public class FechaFaltanteController {
	@Autowired
	public GrupoFechaService fechaService;

	@Autowired
	public WSGetService wsGetService;

	@RequestMapping("/periodos/resultado")
	public FechaResponse resultado() throws Exception {
		//Se obtiene el response del WS periodo/api		
		String responseJSON = wsGetService.PeriodosWSClient();

		//Se parsea el request obtenido
		GrupoFecha grupoFecha = fechaService.parseJson(responseJSON);
		int id = grupoFecha.getId();
		String creation = grupoFecha.getFechaCreacion();
		String end = grupoFecha.getFechaFin();
		List<String> inputList = grupoFecha.getFechas();
		
		//Se obtienen las fechas intermedias entre la fecha de creacion y fecha de fin
		List<String> missingDateList = fechaService.dateList(creation, end);

		//Se eliminan las fechas obtenidas por el WS, dejando las fechas faltantes
		missingDateList.removeAll(inputList);

		//Se inicializa y setea el response de la API REST
		FechaResponse response = new FechaResponse();
		response.setId(id);
		response.setFechaCreacion(creation);
		response.setFechaFin(end);
		response.setFechas(inputList);
		response.setFechasFaltantes(missingDateList);

		return response;
	}

}
