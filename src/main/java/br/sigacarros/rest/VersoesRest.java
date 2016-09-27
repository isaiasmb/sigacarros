package br.sigacarros.rest;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.sigacarros.dao.VersoesDao;

public class VersoesRest implements IVersoesRest {
	@Inject
	private VersoesDao versoesDao;
	
	@Transactional
	public void salvar() {
		versoesDao.save();
	}
}
