package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vos.Menu;
import vos.Producto;

public class DAOTablaMenu {
	
	/**
	 * Arraylits de recursos que se usan para la ejecuci�n de sentencias SQL
	 */
	private ArrayList<Object> recursos;

	/**
	 * Atributo que genera la conexi�n a la base de datos
	 */
	private Connection conn;

	/**
	 * Metodo constructor que crea DAOTablaRestaurante
	 * <b>post: </b> Crea la instancia del DAO e inicializa el Arraylist de recursos
	 */
	public DAOTablaMenu() {
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
	 * Metodo que inicializa la connection del DAO a la base de datos con la conexi�n que entra como parametro.
	 * @param con  - connection a la base de datos
	 */
	public void setConn(Connection con){
		this.conn = con;
	}


	public ArrayList<Menu> darMenus() throws SQLException, Exception {
		ArrayList<Menu> menus = new ArrayList<>();

		String sql = "SELECT * FROM MENU";

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		ResultSet rs = prepStmt.executeQuery();

		while (rs.next()) {
			Long id = rs.getLong("IDMENU");
			double costo = rs.getDouble("COSTO");
			menus.add(new Menu(id, new Producto[5], costo));
		}
		return menus;
	}
	
	public Menu buscarMenuPorId(Long id) throws SQLException, Exception 
	{
		Menu menu = null;

		String sql = "SELECT * FROM MENU WHERE IDMENU =" + id;

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		ResultSet rs = prepStmt.executeQuery();

		if(rs.next()) {
			double costo = rs.getDouble("COSTO");
			menu = new Menu(id, new Producto[5], costo);
		}

		return menu;
	}


	public void addMenu(Menu menu) throws SQLException, Exception {

		String sql = "INSERT INTO MENU VALUES (";
		sql += menu.getId() + ",";
		sql += menu.getCosto() +  ")";

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		prepStmt.executeQuery();

	}
	

	public void updateMenu(Menu menu) throws SQLException, Exception {

		String sql = "UPDATE MENU SET ";
		sql += "COSTO=" + menu.getCosto() + ",";
		sql += " WHERE IDMENU= " + menu.getId();


		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		prepStmt.executeQuery();
	}

	
	public void deleteMenu(Menu menu) throws SQLException, Exception {

		String sql = "DELETE FROM MENU";
		sql += " WHERE IDMENU= " + menu.getId();

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		prepStmt.executeQuery();
	}
}
