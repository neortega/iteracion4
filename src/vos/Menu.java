package vos;

import org.codehaus.jackson.annotate.JsonProperty;

public class Menu {

	@JsonProperty(value="id")
	private Long id;
	
	@JsonProperty(value="productos")
	private Producto[] productos;
	
	@JsonProperty(value="costo")
	private double costo;
	
	public Menu(@JsonProperty(value="id")Long id, @JsonProperty(value="productos")Producto[] productos, @JsonProperty(value="costo")double costo) {
		super();
		this.id = id;
		this.productos = productos;
		this.costo = costo;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
}
