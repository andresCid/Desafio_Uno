package cl.desafio_1.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Cliente para consumir el WS periodos/api
 * @author AndresCidBenitez
*/

@Service
public class WSGetService {
	
	/**
     * Metodo para obtener el response del WS periodos/api    
     */
	public String PeriodosWSClient() {
		RestTemplate wsPeriodos = new RestTemplate();
		String responseJSON = wsPeriodos.getForObject("http://127.0.0.1:8080/periodos/api", String.class);
		
		return responseJSON;
	}
}
