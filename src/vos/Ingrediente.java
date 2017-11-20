package vos;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class Ingrediente {

	// Atributos
	
	/**
	 * Identificador del ingrediente
	 */
	@JsonProperty(value="id")
	private Long id;
	
	/**
	 * Nombre del ingrediente
	 */
	@JsonProperty(value="nombre")
	private String nombre;
	
	/**
	 * Descripcion del ingrediente
	 */
	@JsonProperty(value="descripcion")
	private String descripcion;
	
	/**
	 * Traducción de la descripción del ingrediente
	 */
	@JsonProperty(value="traduccion")
	private String traduccion;
	
	/**
	 * Lista de ingredientes equivalentes a este ingrediente
	 */
	@JsonProperty(value="ingredientesEquivalentes")
	private List<Ingrediente> ingredientesEquivalentes;

	
	// Constructor
	
	
	public Ingrediente(@JsonProperty(value="id")Long id, @JsonProperty(value="nombre")String nombre, 
			@JsonProperty(value="descripcion")String descripcion, @JsonProperty(value="traduccion")String traduccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.traduccion = traduccion;
		this.ingredientesEquivalentes = new ArrayList<>();
	}

	
	// Métodos
	
	/**
	 * Método getter del identificador
	 * @return id - Identificador del ingrediente
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Método getter del nombre
	 * @return nombre - Nombre del ingrediente
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método getter de la descripción del ingrediente
	 * @return descripcion - Descripción del ingrediente
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Método setter de la descripción
	 * @param descripcion - Nueva descripción del ingrediente
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Método getter de la traducción de la descripción del ingrediente
	 * @return traduccion - Traduccion del ingrediente
	 */
	public String getTraduccion() {
		return traduccion;
	}

	/**
	 * Método setter de la traducción
	 * @param Traducción - Nueva traduccción del ingrediente
	 */
	public void setTraduccion(String traduccion) {
		this.traduccion = traduccion;
	}

	/**
	 * Método getter de la lista de ingredientes equivalentes
	 * @return ingredientesEquivalentes - Ingredientes equivalentes a este ingrediente
	 */
	public List<Ingrediente> getIngredientesEquivalentes() {
		return ingredientesEquivalentes;
	}

	/**
	 * Método setter de la lista de ingredientes equivalentes
	 * @param ingredientesEquivalente - Nueva lista de ingredientes equivalentes del ingrediente
	 */
	public void setIngredientesEquivalentes(List<Ingrediente> ingredientesEquivalentes) {
		this.ingredientesEquivalentes = ingredientesEquivalentes;
	}
}
