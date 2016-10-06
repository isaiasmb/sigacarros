package br.sigacarros.rest;

import br.sigacarros.data.ModelosData;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/ModelosService")
public interface IModelosRest {
	@POST
	@Path("/modelo")
	@Consumes("application/json")
	public Response salvar(ModelosData modelosData);
	
	@GET
	@Path("/modelo")
	@Produces("application/json")
	public List<ModelosData> listar();
}
