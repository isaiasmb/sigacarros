package br.sigacarros.dao;

import javax.inject.Inject;

import br.sigacarros.data.MarcasData;

public class MarcasDao extends GenericDao<MarcasData> {
	
	@Inject
	private MarcasData marcasData;
	
	public MarcasDao() {
		super(MarcasData.class);
	}
	
	public void save() {
		
		marcasData.setNome("Chevrolet");
		super.save(marcasData);
		
	}
}
