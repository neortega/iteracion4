package vos;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public class Reserva {

	@JsonProperty(value="sitio")
	private Zona sitio;
	
	@JsonProperty(value="fecha")
	private Date fecha;
	
	@JsonProperty(value="numeroComensales")
	private int numeroComensales;
	
	@JsonProperty(value="sitioPreferido")
	private Zona sitioPreferido;
	
	@JsonProperty(value="menuEvento")
	private Menu menuEvento;

	public Reserva(@JsonProperty(value="sitio")Zona sitio, @JsonProperty(value="fecha")Date fecha, @JsonProperty(value="numeroComensales")int numeroComensales, @JsonProperty(value="sitioPreferido")Zona sitioPreferido, @JsonProperty(value="menuEvento")Menu menuEvento) {
		this.sitio = sitio;
		this.fecha = fecha;
		this.numeroComensales = numeroComensales;
		this.sitioPreferido = sitioPreferido;
		this.menuEvento = menuEvento;
	}

	public Zona getSitio() {
		return sitio;
	}

	public void setSitio(Zona sitio) {
		this.sitio = sitio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getNumeroComensales() {
		return numeroComensales;
	}

	public void setNumeroComensales(int numeroComensales) {
		this.numeroComensales = numeroComensales;
	}

	public Zona getSitioPreferido() {
		return sitioPreferido;
	}

	public void setSitioPreferido(Zona sitioPreferido) {
		this.sitioPreferido = sitioPreferido;
	}

	public Menu getMenuEvento() {
		return menuEvento;
	}

	public void setMenuEvento(Menu menuEvento) {
		this.menuEvento = menuEvento;
	}
}
