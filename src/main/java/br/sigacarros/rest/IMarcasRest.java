package br.sigacarros.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/MarcasService")
public interface IMarcasRest {
	@POST
	@Path("/marca")
	public void salvar();
}
