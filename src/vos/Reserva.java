package vos;

import java.util.Date;

public class Reserva {

	private Zona sitio;
	
	private Date fecha;
	
	private int numeroComensales;
	
	private Zona sitioPreferido;
	
	private Menu menuEvento;

	public Reserva(Zona sitio, Date fecha, int numeroComensales, Zona sitioPreferido, Menu menuEvento) {
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
