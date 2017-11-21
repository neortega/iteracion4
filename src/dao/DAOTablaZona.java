package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vos.Zona;

public class DAOTablaZona {

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
	public DAOTablaZona() {
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


	public ArrayList<Zona> darZonas() throws SQLException, Exception {
		ArrayList<Zona> zonas = new ArrayList<Zona>();

		String sql = "SELECT * FROM ZONA";

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		ResultSet rs = prepStmt.executeQuery();

		while (rs.next()) {
			Long id = rs.getLong("IDZONA");
			int capacidad = rs.getInt("CAPACIDAD");
			boolean discapacidad = rs.getBoolean("DISCAPACIDAD");
			String condTec = rs.getString("ACONDICIONESPECIAL");
			zonas.add(new Zona(id, capacidad, discapacidad, condTec));
		}
		return zonas;
	}
	
	public Zona buscarZonaPorId(Long id) throws SQLException, Exception 
	{
		Zona zona = null;

		String sql = "SELECT * FROM ZONA WHERE IDZONA =" + id;

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		ResultSet rs = prepStmt.executeQuery();

		if(rs.next()) {
			Long id2 = rs.getLong("IDZONA");
			int capacidad = rs.getInt("CAPACIDAD");
			boolean discapacidad = rs.getBoolean("DISCAPACIDAD");
			String condTec = rs.getString("ACONDICIONESPECIAL");
			zona = new Zona(id, capacidad, discapacidad, condTec);
		}

		return zona;
	}


	public void addZona(Zona zona) throws SQLException, Exception {

		String sql = "INSERT INTO Zona VALUES (";
		sql += zona.getId() + ",";
		sql += zona.getCapacidad() + ",'";
		sql += zona.isPermiteDisc() + "','";
		sql += zona.getCondTec() + "')";

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		prepStmt.executeQuery();
	}
	

	public void updateZona(Zona zona) throws SQLException, Exception {

		String sql = "UPDATE ZONA SET ";
		sql += "CAPACIDAD=" + zona.getCapacidad() + ",";
		sql += "DISCAPACIDAD='" + zona.isPermiteDisc() + "',";
		sql += "ACONDICIONESPECIAL='" + zona.getCondTec() + "'";
		sql += " WHERE IDZONA = " + zona.getId();


		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		prepStmt.executeQuery();
	}

	
	public void deleteZona(Zona zona) throws SQLException, Exception {

		String sql = "DELETE FROM ZONA";
		sql += " WHERE IDZONA = " + zona.getId();

		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		prepStmt.executeQuery();
	}
	
}
