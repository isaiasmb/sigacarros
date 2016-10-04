package br.sigacarros.rest;

import br.sigacarros.data.ModelosData;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/ModelosService")
public interface IModelosRest {
	@POST
	@Path("/modelo")
	public void salvar();
	
	@GET
	@Path("/modelo")
	@Produces("application/json")
	public List<ModelosData> listar();
}
