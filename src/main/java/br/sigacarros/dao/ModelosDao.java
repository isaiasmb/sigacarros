package br.sigacarros.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import br.sigacarros.data.MarcasData;
import br.sigacarros.data.ModelosData;

@Stateless
public class ModelosDao extends GenericDao<ModelosData> {
	
	public ModelosDao() {
		super(ModelosData.class);
	}
	
	@Inject
	private ModelosData modelosData;
	
	
	public void salvar(ModelosData modelosData) {
		
		
			//modelosData.setNome("208");
			//MarcasData marcasData = new MarcasData();
			//marcasData.setIdMarca(1);
			//modelosData.setMarcasData(marcasData);
			super.save(modelosData);
			
	}
	
	public void excluir(Integer id) {
		 super.delete(id, ModelosData.class);
	}
	
	public ModelosData buscar(int codigo) {
		return super.find(codigo);
	}
	
	public List<ModelosData> listar() {
		return super.findAll("select * from modelos", ModelosData.class);
	}
	
	public List<ModelosData> listarPorMarca(Integer idMarca) {
		return super.findByMarca(idMarca);
	}
}
