/**-------------------------------------------------------------------
 * $Id$
 * Universidad de los Andes (Bogot√° - Colombia)
 * Departamento de Ingenier√≠a de Sistemas y Computaci√≥n
 *
 * Materia: Sistemas Transaccionales
 * Ejercicio: VideoAndes
 * Autor: Juan Felipe Garc√≠a - jf.garcia268@uniandes.edu.co
 * -------------------------------------------------------------------
 */
package vos;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.*;

/**
 * Clase que representa un Restaurante
 */
public class Restaurante {

	//// Atributos

	/**
	 * Id del video
	 */
	@JsonProperty(value="id")
	private Long id;

	/**
	 * Nombre del video
	 */
	@JsonProperty(value="nombre")
	private String nombre;

	/**
	 * Nombre del representante del restaurante
	 */
	@JsonProperty(value="representante")
	private String representante;
	
	/**
	 * Tipo de comida que sirve el restaurante
	 */
	@JsonProperty(value="tipoComida")
	private String tipoComida;
	
	/**
	 * P·gina web del restaurante
	 */
	private String paginaWeb;
	
	/**
	 * Productos ofrecidos por el restaurante
	 */
	@JsonProperty(value="productos")
	private List<Producto> productos;

	/**
	 * Metodo constructor de la clase Restaurante
	 * <b>post: </b> Crea el restaurante con los valores que entran como parametro
	 * @param id - Id del restaurante.
	 * @param nombre - Nombre del restaurante. name != null
	 * @param representante - Nombre del representante del restaurante
	 * @param tipoComida - Tipo de comida que sirve el restaurante.
	 * @param paginaWeb - P·gina web del restaurante (si tiene)
	 */
	public Restaurante(@JsonProperty(value="id")Long id, @JsonProperty(value="nombre")String nombre,@JsonProperty(value="duration")String representante, @JsonProperty(value="tipoComida")String tipoComida, @JsonProperty(value="paginaWeb")String paginaWeb) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.representante = representante;
		this.tipoComida = tipoComida;
		this.paginaWeb = paginaWeb;
		this.productos = new ArrayList<>();
	}

	/**
	 * MÈtodo getter del id del restaurante
	 * @return id - Id del restaurante
	 */
	public Long getId() {
		return id;
	}

	/**
	 * MÈtodo getter del nombre del restaurante
	 * @return nombre - Nombre del restaurante
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * MÈtodo setter del nombre del restaurante
	 * @param nombre - Nuevo nombre del restaurante
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * MÈtodo getter del nombre del representante del restaurante
	 * @return representante - Nombre del representante del restaurante
	 */
	public String getRepresentante() {
		return representante;
	}

	/**
	 * MÈtodo setter del nombre del representante del restaurante
	 * @param representante - Nuevo nombre del representante
	 */
	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	/**
	 * MÈtodo getter del tipo de comida que sirve el restaurante
	 * @return tipoComida - Tipo de comida que sirve el restaurante
	 */
	public String getTipoComida() {
		return tipoComida;
	}

	/**
	 * MÈtodo setter del tipo de comida que sirve el restaurante
	 * @param tipoComida - Nuevo tipo de comida que sirve el restaurante
	 */
	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	/**
	 * MÈtodo getter de la p·gina web del restaurante
	 * @return paginaWeb
	 */
	public String getPaginaWeb() {
		return paginaWeb;
	}

	/**
	 * MÈtodo setter de la p·gina web del restaurante
	 * @param paginaWeb - Nueva p·gina web del restaurante
	 */
	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	/**
	 * MÈtodo getter de las  listas de productos que sirve el restaurante
	 * @return productos - Lista de productos que sirve el restaurante
	 */
	public List<Producto> getProductos() {
		return productos;
	}

	/**
	 * MÈtodo setter de la lista de productos que sirve el restaurante
	 * @param productos - Nueva lista de productos que sirve el restaurante
	 */
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
}
