package br.sigacarros.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/ModelosService")
public interface IModelosRest {
	@POST
	@Path("/modelo")
	public void salvar();
}
