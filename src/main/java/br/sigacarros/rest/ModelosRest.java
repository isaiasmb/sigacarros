package br.sigacarros.rest;

import javax.inject.Inject;
import br.sigacarros.dao.ModelosDao;

public class ModelosRest implements IModelosRest {

	@Inject
	private ModelosDao modelosDao;
	
	@Override
	public void salvar() {
		modelosDao.salvar();
	}
	
}
