package modelo.DAOS;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.beans.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {

	private EntityManagerFactory emf;
	private EntityManager em;
	private EntityTransaction tx;
	private String sql;
	private Query query;

	public UsuarioDAOImpl() {
		emf = Persistence.createEntityManagerFactory("RecApp");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}

	@Override
	public int insert(Usuario usuario) {

		System.out.println(usuario);

		Usuario usu = null;

		try {

			usu = em.find(Usuario.class, usuario.getIdUsuario());

			System.out.println(usu);

			if (usu != null) {

				tx.begin();
				em.merge(usuario);
				tx.commit();

				return 1;
				
			} else if (usu == null) {

				tx.begin();
				em.persist(usuario);
				tx.commit();

				return 1;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return 0;

	}

	@Override
	public int update(Usuario usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String idUsuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Usuario findById(String idUsuario) {
		return em.find(Usuario.class, idUsuario);
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override


	public Usuario findByEmail(String email) {

		sql = "select u from Usuario u where u.email = :email";

		try {
			query = em.createQuery(sql);
			query.setParameter("email", email);
			return (Usuario) query.getSingleResult();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;

	}

	public Usuario findLogin(String email, String pwd) {


		sql = "select u from Usuario u where u.email = :email and u.password = :pwd";

		try {
			query = em.createQuery(sql);
			query.setParameter("email", email);
			query.setParameter("pwd", pwd);
			return (Usuario) query.getSingleResult();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;

	}
	
	
	

}