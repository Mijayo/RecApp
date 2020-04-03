package modelo.DAOS;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.beans.Pregunta;

public class PreguntaDAOImpl implements PreguntaDAO {

	Pregunta p = new Pregunta();
	private EntityManagerFactory emf;
	private EntityManager em;
	private EntityTransaction tx;
	private String sql;
	private Query query;

	public PreguntaDAOImpl() {
		emf = Persistence.createEntityManagerFactory("RecApp");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}

	@Override
	public List<Pregunta> findAll() {

		query = em.createNamedQuery("Pregunta.findAll");

		return query.getResultList();
	}

	@Override
	public List<Pregunta> findByTipoEneg(int tipoEneg) {

		System.out.println("Aqui tipoEneag " + tipoEneg);

		sql = "select p from Pregunta p where p.idPregunta = :num";

		try {
			query = em.createQuery(sql);
			query.setParameter("num", tipoEneg);
			return query.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	@Override
	public List<Pregunta>  findByID(int tipoID) {

		System.out.println("Aqui tipoID " + tipoID);

		sql = "select p from Pregunta p where p.idPregunta = :nid and p.numPregunta = 1";

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