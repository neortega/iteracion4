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

import org.codehaus.jackson.map.ObjectMapper;

import tm.RotondAndesTM;
import tm.VideoAndesTM;
import vos.Restaurante;
import vos.Usuario;
import vos.Video;

@Path("usuarios")
public class UsuarioServices {

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
	public Response getUsuarios() {
		RotondAndesTM tm = new RotondAndesTM(getPath());
		List<Usuario> usuarios;
		try {
			usuarios = tm.darUsuarios();
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(usuarios).build();
	}
	
	@GET
	@Path( "{id: \\d+}" )
	@Produces( { MediaType.APPLICATION_JSON } )
	public Response getUsuario( @PathParam( "id" ) Long id )
	{
		RotondAndesTM tm = new RotondAndesTM( getPath( ) );
		try
		{
			Usuario v = tm.buscarUsuarioPorId( id );
			return Response.status( 200 ).entity( v ).build( );			
		}
		catch( Exception e )
		{
			return Response.status( 500 ).entity( doErrorMessage( e ) ).build( );
		}
	}
	
	@GET
	@Path( "{nombre}" )
	@Produces( { MediaType.APPLICATION_JSON } )
	public Response getUsuarioPorName( @QueryParam("nombre") String name) {
		RotondAndesTM tm = new RotondAndesTM(getPath());
		List<Usuario> usuarios;
		try {
			if (name == null || name.length() == 0)
				throw new Exception("Nombre del restaurante no valido");
			usuarios = tm.buscarUsuarioPorName(name);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(usuarios).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addUsuario(Usuario usuario) {
		RotondAndesTM tm = new RotondAndesTM(getPath());
		try {
			tm.addUsuario(usuario);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(usuario).build();
	}
	
	@POST
	@Path("/varios")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addUsuarios(List<Usuario> usuarios) {
		RotondAndesTM tm = new RotondAndesTM(getPath());
		try {
			tm.addUsuarios(usuarios);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(usuarios).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateUsuario(Usuario usuario) {
		RotondAndesTM tm = new RotondAndesTM(getPath());
		try {
			tm.updateUsuario(usuario);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(usuario).build();
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteUsuario(Usuario usuario) {
		RotondAndesTM tm = new RotondAndesTM(getPath());
		try {
			tm.deleteUsuario(usuario);
		} catch (Exception e) {
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(usuario).build();
	}
}
