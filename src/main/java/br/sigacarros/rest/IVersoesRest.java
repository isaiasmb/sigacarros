package br.sigacarros.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/VersoesService")
public interface IVersoesRest {
	@POST
	@Path("/versao")
	public void salvar();
}
