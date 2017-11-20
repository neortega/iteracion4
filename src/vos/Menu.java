package vos;

public class Menu {

	private Producto[] productos;
	
	private double costo;
	
	private double precio;

	public Menu(double costo, double precio) {
		super();
		this.productos = new Producto[5];
		this.costo = costo;
		this.precio = precio;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
