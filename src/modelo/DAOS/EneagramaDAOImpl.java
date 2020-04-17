package modelo.DAOS;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.beans.Eneagrama;
import modelo.beans.Usuario;

public class EneagramaDAOImpl implements EneagramaDAO {

	private EntityManagerFactory emf;
	private EntityManager em;
	private EntityTransaction tx;
	private String sql;
	private Query query;

	public EneagramaDAOImpl() {
		emf = Persistence.createEntityManagerFactory("RecApp");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}

	@Override
	public Eneagrama findEneagrama(int id) {
		
		System.out.println("segundo id " + id);

		sql = "select e from Eneagrama e where e.idEneagrama = :usu";

		try {
			query = em.createQuery(sql);
			query.setParameter("usu", id);
			return (Eneagrama) query.getSingleResult();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}

