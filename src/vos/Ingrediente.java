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
	 * Traducci�n de la descripci�n del ingrediente
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

	
	// M�todos
	
	/**
	 * M�todo getter del identificador
	 * @return id - Identificador del ingrediente
	 */
	public Long getId() {
		return id;
	}

	/**
	 * M�todo getter del nombre
	 * @return nombre - Nombre del ingrediente
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo getter de la descripci�n del ingrediente
	 * @return descripcion - Descripci�n del ingrediente
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * M�todo setter de la descripci�n
	 * @param descripcion - Nueva descripci�n del ingrediente
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * M�todo getter de la traducci�n de la descripci�n del ingrediente
	 * @return traduccion - Traduccion del ingrediente
	 */
	public String getTraduccion() {
		return traduccion;
	}

	/**
	 * M�todo setter de la traducci�n
	 * @param Traducci�n - Nueva traduccci�n del ingrediente
	 */
	public void setTraduccion(String traduccion) {
		this.traduccion = traduccion;
	}

	/**
	 * M�todo getter de la lista de ingredientes equivalentes
	 * @return ingredientesEquivalentes - Ingredientes equivalentes a este ingrediente
	 */
	public List<Ingrediente> getIngredientesEquivalentes() {
		return ingredientesEquivalentes;
	}

	/**
	 * M�todo setter de la lista de ingredientes equivalentes
	 * @param ingredientesEquivalente - Nueva lista de ingredientes equivalentes del ingrediente
	 */
	public void setIngredientesEquivalentes(List<Ingrediente> ingredientesEquivalentes) {
		this.ingredientesEquivalentes = ingredientesEquivalentes;
	}
}
