package vos;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {

	private String preferencia;
	
	private List<Producto> pedidos;
	
	public Cliente(Long id, String name, String rol, boolean estaRegistrado, String preferencia) {
		super(id, name, CLIENTE, estaRegistrado);
		this.preferencia = preferencia;
		pedidos = new ArrayList<>();
	}

	public String getPreferencia() {
		return preferencia;
	}

	public void setPreferencia(String preferencia) {
		this.preferencia = preferencia;
	}

	public List<Producto> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Producto> pedidos) {
		this.pedidos = pedidos;
	}
}
