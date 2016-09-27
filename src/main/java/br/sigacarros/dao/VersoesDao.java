package br.sigacarros.dao;

import javax.inject.Inject;

import br.sigacarros.data.ModelosData;
import br.sigacarros.data.VersoesData;

public class VersoesDao  extends GenericDao<VersoesData>  {

	public VersoesDao() {
		super(VersoesData.class);
	}

	@Inject
	private VersoesData versoesData;
	@Inject
	private ModelosData modelosData;
	
	public void save() {
		
		modelosData.setIdModelo(1);
		versoesData.setNome("ACTIVE 1.4");
		versoesData.setModelosData(modelosData);
		super.save(versoesData);
		
	}
}
