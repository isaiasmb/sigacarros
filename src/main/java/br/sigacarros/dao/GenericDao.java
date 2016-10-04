package br.sigacarros.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class GenericDao<T> {
	private final static String UNIT_NAME = "sigacarrosbase-unit";
	
	@PersistenceContext(unitName = UNIT_NAME)
    private EntityManager em;
	private Class<T> classeEntidade;
	
	public GenericDao(Class<T> classeEntidade) {
        this.classeEntidade = classeEntidade;
    }
	
	public void save(T entity) {
        em.persist(entity);
    }
 
    protected void delete(Object id, Class<T> classe) {
        T removida = em.getReference(classe, id);
 
        em.remove(removida);
    }
 
    public T update(T entidade) {
        return em.merge(entidade);
    }
    
    public T find(int entidadeID) {
        return em.find(classeEntidade, entidadeID);
    }
    
    @SuppressWarnings("unchecked")
	public List<T> findAll(String sql, Class type) {
    	return this.em.createNativeQuery(sql, type).getResultList();
    }
    
 
}
