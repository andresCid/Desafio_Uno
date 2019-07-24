package cl.desafio_1.beans;

import java.util.List;

/**
 * Bean Utilizado para setear el response JSON, que muestra las fechas faltantes del WS periodos/resultado
 * @author AndresCidBenitez
*/
public class FechaResponse {
	public int id;
	public String fechaCreacion;
	public String fechaFin;
	public List<String> fechas;
	public List<String> fechasFaltantes;

	public FechaResponse() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public List<String> getFechas() {
		return fechas;
	}

	public void setFechas(List<String> fechas) {
		this.fechas = fechas;
	}

	public List<String> getFechasFaltantes() {
		return fechasFaltantes;
	}

	public void setFechasFaltantes(List<String> fechasFaltantes) {
		this.fechasFaltantes = fechasFaltantes;
	}

	@Override
	public String toString() {
		return "FechaResponse [id=" + id + ", fechaCreacion=" + fechaCreacion + ", fechaFin=" + fechaFin + ", fechas="
				+ fechas + ", fechasFaltantes=" + fechasFaltantes + "]";
	}

}
