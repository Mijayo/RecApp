package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAOS.AnuncioDAOImpl;
import modelo.DAOS.UsuarioDAOImpl;
import modelo.beans.Anuncio;
import modelo.beans.Eneagrama;
import modelo.beans.Usuario;

/**
 * Servlet implementation class GestionAnuncios
 */
@WebServlet("/GestionAnuncios")
public class GestionAnuncios extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GestionAnuncios() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Usuario usu = null;
		usu = (Usuario) request.getSession().getAttribute("usuario");
		UsuarioDAOImpl udao = new UsuarioDAOImpl();		
		Eneagrama userValues = usu.getEneagrama();
			
		Anuncio anuncio = null;
		AnuncioDAOImpl anundao = new AnuncioDAOImpl();
			
		switch (request.getParameter("option")) {
		
			case "anuncios":
	
				if (usu.getTipoEneagrama() == null) {
					request.getRequestDispatcher("test.jsp").forward(request, response);
				} else if (usu.getEneagrama() != null) {
					request.getSession().setAttribute("anuncio", anundao.findByID(userValues.getIdEneagrama()));
					request.getRequestDispatcher("anuncios.jsp").forward(request, response);
				} else {
					request.getRequestDispatcher("indexUsu.jsp").forward(request, response);
				}
				
			break;
		}

	}

}

