package br.sigacarros.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import br.sigacarros.dao.ModelosDao;
import br.sigacarros.data.ModelosData;
import br.sigacarros.service.ModelosService;

public class ModelosRest implements IModelosRest {

	@Inject
	private ModelosService modelosService;

	@Inject
	private ModelosDao modelosDao;
	
	@Override
	public Response salvar(ModelosData modelosData) {
		try {
			modelosService.gravarModelo(modelosData);
			
			return Response.status(200).entity("Modelo cadastrado com sucesso!").build();
		} catch (Exception ex) {
			throw new WebApplicationException(500);
		}
	}
	
	@Override
	public List<ModelosData> listar() {
		return modelosService.listarTodos();
	}
	
}
