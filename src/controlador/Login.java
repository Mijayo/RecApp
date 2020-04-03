package controlador;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAOS.UsuarioDAOImpl;
//import modelo.DAOS.UsuarioDAOImpl;
import modelo.beans.Eneagrama;
import modelo.beans.Usuario;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Usuario usu = null;
		UsuarioDAOImpl udao = new UsuarioDAOImpl();

		// request.getSession().setAttribute("usuario", usu);

		int autoIncrement = 0;

		switch (request.getParameter("option")) {

		case "validar":

			usu = (Usuario) request.getSession().getAttribute("usuario");

			if (usu == null) {
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("indexUsu.jsp").forward(request, response);
			}

			break;

		case "registrar":

			usu = (Usuario) request.getSession().getAttribute("usuario");

			if (usu == null) {
				request.getRequestDispatcher("registro.jsp").forward(request, response);
			}

			break;

		case "registro":

			String email = request.getParameter("email");
			String pwd = request.getParameter("pwd");
			String nombre = request.getParameter("nombre");

			if (udao.findByEmail(email) != null) {

				if (udao.findLogin(email, pwd) != null) {

					// Usuario existe y contrasena es correcta
					System.out.println("El usuario y contrasena ok!");
					usu = new Usuario(autoIncrement, email, new Date(), nombre, pwd, 0, null, null);
					request.getSession().setAttribute("usuario", usu);
					request.getRequestDispatcher("indexUsu.jsp").forward(request, response);

				} else {
					request.getRequestDispatcher("registro.jsp").forward(request, response);
				}

			} else {

				usu = new Usuario(autoIncrement, email, new Date(), nombre, pwd, 0, null, null);
				
				udao.insert(usu);

				System.out.println("Objeto usuario " + usu);

				Usuario usuPrueba = null;
				request.getSession().setAttribute("usuario", usu);
				usuPrueba = (Usuario) request.getSession().getAttribute("usuario");
				System.out.println(usuPrueba.getEmail());

				System.out.println("obj sesion: " + request.getSession().getAttribute("usuario"));
				System.out.println();

				request.getRequestDispatcher("indexUsu.jsp").forward(request, response);
			}

			break;

		case "logout":

			// request.getSession().removeAttribute("usuario");
			request.getSession().removeAttribute("idEneag");
			request.getSession().removeAttribute("id");
			request.getSession().removeAttribute("mapa");

			request.getSession().invalidate();

			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;

		case "cerrar-test":

			// request.getSession().removeAttribute("usuario");
			request.getSession().removeAttribute("idEneag");
			request.getSession().removeAttribute("id");
			request.getSession().removeAttribute("mapa");

			request.getSession().invalidate();

			request.getRequestDispatcher("indexUsu.jsp").forward(request, response);

			break;

		case "usuario":

			usu = (Usuario) request.getSession().getAttribute("usuario");

			if (usu == null) {
				request.getRequestDispatcher("registro.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("indexUsu.jsp").forward(request, response);
			}

			break;
		}

	}

}
