package vos;

import org.codehaus.jackson.annotate.JsonProperty;

public class Usuario {

	public final static String ORGANIZADOR = "Organizador";
	
	public final static String CLIENTE = "Cliente";
	
	public final static String ADMINISTRADOR = "Administrador";
	
	public final static String GERENTE = "Gerente";
	
	@JsonProperty(value="id")
	private Long id;
	
	@JsonProperty(value="identificacion")
	private int identificacion;
	
	@JsonProperty(value="name")
	private String name;
	
	@JsonProperty(value="correo")
	private String correo;
	
	@JsonProperty(value="rol")
	private String rol;
	
	@JsonProperty(value="estaRegistrado")
	private boolean estaRegistrado;

	public Usuario(@JsonProperty(value="id")Long id, @JsonProperty(value="name")String name, @JsonProperty(value="identificacion")int identificacion, @JsonProperty(value="rol")String rol, @JsonProperty(value="correo")String correo, @JsonProperty(value="estaRegistrado")boolean estaRegistrado) {
		this.id = id;
		this.name = name;
		this.identificacion = identificacion;
		this.correo = correo;
		this.rol = rol;
		this.estaRegistrado = estaRegistrado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public boolean isEstaRegistrado() {
		return estaRegistrado;
	}

	public void setEstaRegistrado(boolean estaRegistrado) {
		this.estaRegistrado = estaRegistrado;
	}
	
	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
}
