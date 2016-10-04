package br.sigacarros.rest;

import java.util.List;

import javax.inject.Inject;
import br.sigacarros.dao.ModelosDao;
import br.sigacarros.data.ModelosData;

public class ModelosRest implements IModelosRest {

	@Inject
	private ModelosDao modelosDao;
	
	@Override
	public void salvar() {
		modelosDao.salvar();
	}
	
	@Override
	public List<ModelosData> listar() {
		return modelosDao.findAll("select * from modelos", ModelosData.class);
	}
	
}
