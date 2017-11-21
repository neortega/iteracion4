
package vos;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Clase que representa un producto
 */
public class Producto {

	/**
	 * Identificador del producto
	 */
	@JsonProperty(value="id")
	private Long id;
	
	/**
	 * Nombre del producto
	 */
	@JsonProperty(value="nombre")
	private String nombre;
	
	/**
	 * Descripción del producto
	 */
	@JsonProperty(value="descripcion")
	private String descripcion;
	
	/**
	 * Traducción de la descripción del producto
	 */
	@JsonProperty(value="traduccion")
	private String traduccion;
	
	/**
	 * Tiempo de preparación del producto
	 */
	@JsonProperty(value="tiempo")
	private Integer tiempo;
	
	/**
	 * Lista de ingredientes del producto
	 */
	@JsonProperty(value="ingredientes")
	private List<Ingrediente> ingredientes;
	
	/**
	 * Costo de producción del producto
	 */
	@JsonProperty(value="costo")
	private double costo;
	
	/**
	 * Categoría del producto
	 */
	@JsonProperty(value="categoria")
	private String categoria;
	
	/**
	 * Tipo del producto
	 */
	@JsonProperty(value="tipo")
	private String tipo;

	/**
	 * Precio de venta del producto
	 */
	@JsonProperty(value="precio")
	private double precio;

	public Producto(@JsonProperty(value="id")Long id, @JsonProperty(value="nombre")String nombre, @JsonProperty(value="descripcion")String descripcion, @JsonProperty(value="traduccion")String traduccion, @JsonProperty(value="tiempo")Integer tiempo, @JsonProperty(value="costo")double costo,
			@JsonProperty(value="precio")double precio, @JsonProperty(value="ingredientes")List<Ingrediente> ingredientes, @JsonProperty(value="categoria")String categoria, @JsonProperty(value="tipo")String tipo) {
		
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
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
