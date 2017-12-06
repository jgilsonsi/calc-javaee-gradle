package br.inatel.pos.mobile.calculadora.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.inatel.pos.mobile.calculadora.entities.JClient;

@Stateless
public class JClientDAO {

	@PersistenceContext(unitName = "calculator")
	private EntityManager em;

	public void insert(JClient client) {
		em.persist(client);
	}

	public List<JClient> findAll() {
		return em.createQuery("from JClient c", JClient.class).getResultList();
	}

}
