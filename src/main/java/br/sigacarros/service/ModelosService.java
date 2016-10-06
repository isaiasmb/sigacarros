package br.sigacarros.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import br.sigacarros.dao.ModelosDao;
import br.sigacarros.data.ModelosData;

@Stateless
public class ModelosService {
	
	@Inject
	ModelosDao modelosDao;
	
	public void gravarModelo(ModelosData modelosData) {
		//apenas teste
		if (modelosDao.buscar(modelosData.getIdModelo()) != null) {
			System.out.println("Ja existe!");
		} else {
			System.out.println("Nao existe!");
		}
		modelosDao.salvar(modelosData);
	}
	
	public List<ModelosData> listarTodos() {
		return modelosDao.listar();
	}
	
	
}
