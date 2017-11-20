package vos;

public class Usuario {

	public final static String ORGANIZADOR = "Organizador";
	
	public final static String CLIENTE = "Cliente";
	
	public final static String ADMINISTRADOR = "Administrador";
	
	public final static String GERENTE = "Gerente";
	
	private Long id;
	
	private String name;
	
	private String rol;
	
	private boolean estaRegistrado;

	public Usuario(Long id, String name, String rol, boolean estaRegistrado) {
		this.id = id;
		this.name = name;
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
}
