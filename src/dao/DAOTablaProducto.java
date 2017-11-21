package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vos.Ingrediente;
import vos.Producto;

public class DAOTablaProducto {

	/**
	 * Arraylits de recursos que se usan para la ejecución de sentencias SQL
	 */
	private ArrayList<Object> recursos;

	/**
	 * Atributo que genera la conexión a la base de datos
	 */
	private Connection conn;

	/**
	 * Metodo constructor que crea DAOTablaRestaurante
	 * <b>post: </b> Crea la instancia del DAO e inicializa el Arraylist de recursos
	 */
	public DAOTablaProducto() {
		recursos = new ArrayList<Object>();
	}

	/**
	 * Metodo que cierra todos los recursos que estan enel arreglo de recursos
	 * <b>post: </b> Todos los recurso del arreglo de recursos han sido cerrados
	 */
	public void cerrarRecursos() {
		for(Object ob : recursos){
			if(ob instanceof PreparedStatement)
				try {
					((PreparedStatement) ob).close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
		}
	}

	/**
	 * Metodo que inicializa la connection del DAO a la base de datos con la conexión que entra como parametro.
	 * @param con  - connection a la base de datos
	 */
	public void setConn(Connection con){
		this.conn = con;
	}


	public ArrayList<Producto> darProductos() throws SQLException, Exception {
		ArrayList<Producto> productos = new ArrayList<Producto>();

		String sql = "SELECT * FROM PRODUCTO";

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		ResultSet rs = prepStmt.executeQuery();

		while (rs.next()) {
			Long id = rs.getLong("IDPRODUCTO");
			String name = rs.getString("NOMBRE");
			String descripcion = rs.getString("DESCRIPCION");
			String traduccion = rs.getString("TRADUCCION");
			int tiempo = rs.getInt("TIEMPOPREP");
			double costo = rs.getDouble("COSTOPRODUCCION");
			double precio = rs.getDouble("COSTOVENTA");			
			ArrayList<Ingrediente> ingredientes = new ArrayList<>();
			String categoria = "";
			String tipo = "";		
			productos.add(new Producto(id, name, descripcion, traduccion, tiempo, costo, precio, ingredientes, categoria, tipo));
		}
		return productos;
	}
//	
//	public ArrayList<Usuario> buscarUsuarioPorName(String name) throws SQLException, Exception {
//		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
//
//		String sql = "SELECT * FROM USUARIO WHERE NAME ='" + name + "'";
//
//		PreparedStatement prepStmt = conn.prepareStatement(sql);
//		recursos.add(prepStmt);
//		ResultSet rs = prepStmt.executeQuery();
//
//		while (rs.next()) {
//			Long id = rs.getLong("ID");
//			String correo = rs.getString("CORREO");
//			int identificacion = rs.getInt("IDNETIFICACION");
//			String rol = rs.getString("ROL");
//			boolean estaRegistrado = rs.getBoolean("REGISTRADO");
//			usuarios.add(new Usuario(id, name, identificacion, rol, correo, estaRegistrado));
//		}
//		return usuarios;
//	}
//	
//	
//	public Usuario buscarUsuarioPorId(Long id) throws SQLException, Exception 
//	{
//		Usuario usuario = null;
//
//		String sql = "SELECT * FROM USUARIO WHERE ID =" + id;
//
//		PreparedStatement prepStmt = conn.prepareStatement(sql);
//		recursos.add(prepStmt);
//		ResultSet rs = prepStmt.executeQuery();
//
//		if(rs.next()) {
//			String name = rs.getString("NAME");
//			String correo = rs.getString("CORREO");
//			int identificacion = rs.getInt("IDNETIFICACION");
//			String rol = rs.getString("ROL");
//			boolean estaRegistrado = rs.getBoolean("REGISTRADO");
//			usuario = new Usuario(id, name, identificacion, rol, correo, estaRegistrado);
//		}
//
//		return usuario;
//	}
//
//
//	public void addUsuario(Usuario usuario) throws SQLException, Exception {
//
//		String sql = "INSERT INTO USUARIO VALUES (";
//		sql += usuario.getId() + ",'";
//		sql += usuario.getName() + "',";
//		sql += usuario.getIdentificacion() + ",'";
//		sql += usuario.getCorreo() + "','";
//		sql += usuario.getRol() + "',";
//		sql += usuario.isEstaRegistrado() + ")";
//
//		PreparedStatement prepStmt = conn.prepareStatement(sql);
//		recursos.add(prepStmt);
//		prepStmt.executeQuery();
//
//	}
//	
//
//	public void updateUsuario(Usuario usuario) throws SQLException, Exception {
//
//		String sql = "UPDATE USUARIO SET ";
//		sql += "NOMBRE='" + usuario.getName() + "',";
//		sql += "IDNETIFICACION=" + usuario.getIdentificacion() + ",";
//		sql += "CORREO='" + usuario.getCorreo() + "',";
//		sql += "ROL='" + usuario.getRol() + "'";
//		sql += " WHERE ID = " + usuario.getId();
//
//
//		PreparedStatement prepStmt = conn.prepareStatement(sql);
//		recursos.add(prepStmt);
//		prepStmt.executeQuery();
//	}
//
//	
//	public void deleteUsuario(Usuario usuario) throws SQLException, Exception {
//
//		String sql = "DELETE FROM USUARIO";
//		sql += " WHERE ID = " + usuario.getId();
//
//		PreparedStatement prepStmt = conn.prepareStatement(sql);
//		recursos.add(prepStmt);
//		prepStmt.executeQuery();
//	}
//	
}
