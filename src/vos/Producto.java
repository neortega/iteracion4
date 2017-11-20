
package vos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un producto
 */
public class Producto {

	/**
	 * Identificador del producto
	 */
	private Long id;
	
	/**
	 * Nombre del producto
	 */
	private String nombre;
	
	/**
	 * Descripción del producto
	 */
	private String descripcion;
	
	/**
	 * Traducción de la descripción del producto
	 */
	private String traduccion;
	
	/**
	 * Tiempo de preparación del producto
	 */
	private Integer tiempo;
	
	/**
	 * Lista de ingredientes del producto
	 */
	private List<Ingrediente> ingredientes;
	
	/**
	 * Costo de producción del producto
	 */
	private double costo;
	
	/**
	 * Categoría del producto
	 */
	private String categoria;
	
	/**
	 * Tipo del producto
	 */
	private String tipo;
	
	/**
	 * Precio de venta del producto
	 */
	private double precio;

	public Producto(Long id, String nombre, String descripcion, String traduccion, Integer tiempo, double costo,
			double precio, List<Ingrediente> ingredientes, String categoria, String tipo) {
		
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.traduccion = traduccion;
		this.tiempo = tiempo;
		this.costo = costo;
		this.precio = precio;
		this.ingredientes = ingredientes;
		this.categoria = categoria;
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTraduccion() {
		return traduccion;
	}

	public void setTraduccion(String traduccion) {
		this.traduccion = traduccion;
	}

	public Integer getTiempo() {
		return tiempo;
	}

	public void setTiempo(Integer tiempo) {
		this.tiempo = tiempo;
	}

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
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
