package cl.desafio_1.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import cl.desafio_1.beans.GrupoFecha;

/**
 * Servicio que contiene la logica para calcular las fechas intermedias y parsear la respuesta del WS periodos/api
 * @author AndresCidBenitez
*/

@Service
public class GrupoFechaService {
	
	/**
     * Metodo para parsear el response del WS periodos/api
     * @param inputJSON El parámetro inputJSON define el response obtenido del WS periodos/api
     */
	public GrupoFecha parseJson(String inputJSON) {
        GrupoFecha fecha = new Gson().fromJson(inputJSON, GrupoFecha.class);
        return fecha;
    }	
	
	//
	
	/**
     * Metodo para calcular la lista de fechas intermedias, entre la fecha de creacion y fin
     * @param creation El parámetro creation define la fecha de creacion
     * @param end El parámetro end define la fecha de fin
     */
	public List<String> dateList(String creation, String end) {
		//Se transforman las fechas de String a LocalDate
        LocalDate creationDate = LocalDate.parse(creation);
        LocalDate endDate = LocalDate.parse(end);
        
        //Se define el formato de salida de las fechas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        //Se define la estructura de datos que contendrá las fechas intermedias
        List<String> list = new ArrayList<>();

        //Si el dia del mes es igual a 1, le resto 1 dia a la fecha de creacion, para mantener la fecha de inicio
        //en la lista de fechas intermedias
        if (creationDate.getDayOfMonth() == 1) {
            creationDate = creationDate.minusDays(1);
        }

        //Mientras la fecha de creacion sea anterior a la fecha de fin, se suma 1 mes a la fecha de creacion
        // y se agrega a la lista de fechas intermedias
        while (creationDate.isBefore(endDate)) {
            creationDate = creationDate.plusMonths(1).withDayOfMonth(1);
            list.add(creationDate.format(formatter));
        }
        return list;
    }
}
