package vos;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class Zona {

	@JsonProperty(value="id")
	private Long id;
	
	@JsonProperty(value="capacidad")
	private int capacidad;
	
	@JsonProperty(value="permiteDisc")
	private boolean permiteDisc;
	
	@JsonProperty(value="condTec")
	private String condTec;

	public Zona(@JsonProperty(value="id")Long id, @JsonProperty(value="capacidad")int capacidad, @JsonProperty(value="permiteDisc")boolean permiteDisc, @JsonProperty(value="condTec")String condTec) {
		this.id = id;
		this.capacidad = capacidad;
		this.permiteDisc = permiteDisc;
		this.condTec = condTec;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
