package cl.desafio_1.beans;

import java.util.List;

/**
 * Bean Utilizado para setear el response JSON del WS /periodos/api
 * @author AndresCidBenitez
*/
public class GrupoFecha {
	public int id;
	public String fechaCreacion;
	public String fechaFin;
	public List<String> fechas;

	public GrupoFecha() {
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

	@Override
	public String toString() {
		return "GrupoFecha id=" + id + ", fechaCreacion=" + fechaCreacion + ", fechaFin=" + fechaFin + ", fechas="
				+ fechas;
	}

}
