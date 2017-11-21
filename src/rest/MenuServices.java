package rest;

import java.util.List;

import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import tm.RotondAndesTM;
import vos.Menu;

public class MenuServices {

	/**
	 * Atributo que usa la anotacion @Context para tener el ServletContext de la conexion actual.
	 */
	@Context
	private ServletContext context;

	/**
	 * Metodo que retorna el path de la carpeta WEB-INF/ConnectionData en el deploy actual dentro del servidor.
	 * @return path de la carpeta WEB-INF/ConnectionData en el deploy actual.
	 */
	private String getPath() {
		return context.getRealPath("WEB-INF/ConnectionData");
	}
	
	
	private String doErrorMessage(Exception e){
		return "{ \"ERROR\": \""+ e.getMessage() + "\"}" ;
	}
	
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getMenus() {
		RotondAndesTM tm = new RotondAndesTM(getPath());
		List<Menu> menus;
		try {
			menus = tm.darMenus();
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(menus).build();
	}
	
	@GET
	@Path( "{id: \\d+}" )
	@Produces( { MediaType.APPLICATION_JSON } )
	public Response getMenu( @PathParam( "id" ) Long id )
	{
		RotondAndesTM tm = new RotondAndesTM( getPath( ) );
		try
		{
			Menu v = tm.buscarMenuPorId( id );
			return Response.status( 200 ).entity( v ).build( );			
		}
		catch( Exception e )
		{
			return Response.status( 500 ).entity( doErrorMessage( e ) ).build( );
		}
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addMenu(Menu menu) {
		RotondAndesTM tm = new RotondAndesTM(getPath());
		try {
			tm.addMenu(menu);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(menu).build();
	}
	
	@POST
	@Path("/varios")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addMenus(List<Menu> menus) {
		RotondAndesTM tm = new RotondAndesTM(getPath());
		try {
			tm.addMenus(menus);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(menus).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateMenu(Menu menu) {
		RotondAndesTM tm = new RotondAndesTM(getPath());
		try {
			tm.updateMenu(menu);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(menu).build();
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteMenu(Menu menu) {
		RotondAndesTM tm = new RotondAndesTM(getPath());
		try {
			tm.deleteMenu(menu);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(menu).build();
	}
}
