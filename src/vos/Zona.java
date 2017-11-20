package vos;

import java.util.List;

public class Zona {

	private List<Restaurante> restaurantes;
	
	private int capacidad;
	
	private boolean permiteDisc;
	
	private String condTec;

	public Zona(List<Restaurante> restaurantes, int capacidad, boolean permiteDisc, String condTec) {
		this.restaurantes = restaurantes;
		this.capacidad = capacidad;
		this.permiteDisc = permiteDisc;
		this.condTec = condTec;
	}

	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isPermiteDisc() {
		return permiteDisc;
	}

	public void setPermiteDisc(boolean permiteDisc) {
		this.permiteDisc = permiteDisc;
	}

	public String getCondTec() {
		return condTec;
	}

	public void setCondTec(String condTec) {
		this.condTec = condTec;
	}
}
