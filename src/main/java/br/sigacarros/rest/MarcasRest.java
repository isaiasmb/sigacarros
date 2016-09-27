package br.sigacarros.rest;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.sigacarros.dao.MarcasDao;

public class MarcasRest implements IMarcasRest {

	@Inject
	private MarcasDao marcasDao;
	
	@Transactional
	public void salvar() {
		marcasDao.save();
	}
}
