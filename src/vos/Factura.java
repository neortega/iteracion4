package vos;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public class Factura {

	
	@JsonProperty(value="paga")
	private boolean paga;
	
	@JsonProperty(value="precio")
	private int precio;
	
	@JsonProperty(value="cliente")
	private Usuario cliente;
	
	@JsonProperty(value="fecha")
	private Date fecha;

	public Factura(@JsonProperty(value="paga")boolean paga, @JsonProperty(value="precio")int precio, @JsonProperty(value="cliente")Usuario cliente, @JsonProperty(value="fecha")Date fecha) {
		super();
		this.paga = paga;
		this.precio = precio;
		this.cliente = cliente;
		this.fecha = fecha;
	}

	public boolean isPaga() {
		return paga;
	}

	public void setPaga(boolean paga) {
		this.paga = paga;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Usuario getCliente() {
		return cliente;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
