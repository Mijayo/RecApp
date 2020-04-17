package modelo.DAOS;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.beans.Anuncio;
import modelo.beans.Pregunta;

public class AnuncioDAOImpl implements AnuncioDAO {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	private EntityTransaction tx;
	private String sql;
	private Query query;
	
	public AnuncioDAOImpl() {
		emf = Persistence.createEntityManagerFactory("RecApp");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}

	@Override
	public Anuncio findBy(int id) {
		
		return em.find(Anuncio.class, id);
	}
	
	@Override
	public List<Anuncio> findByID(int tipoID) {

		System.out.println("Aqui tipoID " + tipoID);

		sql = "select a from Anuncio a where a.eneagrama = :nid";

		try {
			query = em.createQuery(sql);
			query.setParameter("nid", tipoID);
			return  query.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}