package br.sigacarros.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import br.sigacarros.data.MarcasData;
import br.sigacarros.data.ModelosData;

public class ModelosDao {
	@PersistenceContext(unitName = "sigacarrosbase-unit")
	private EntityManager em;
	
	@Inject
	private ModelosData modelosData;
	
	@Transactional
	public void salvar() {
		
		modelosData.setNome("208");
		MarcasData marcasData = new MarcasData();
		marcasData.setIdMarca(1);
		modelosData.setMarcasData(marcasData);
		em.persist(modelosData);
	}
}
