package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.internal.reflect.ReflectionFactory.GetReflectionFactoryAction;
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

		// UsuarioDAOImpl udao = new UsuarioDAOImpl();

		Usuario usu = null;
		// Eneagrama ene = new Eneagrama();
		// Eneagrama ene2 = new Eneagrama();

		request.getSession().setAttribute("usuario", usu);

		switch (request.getParameter("option")) {

		case "validar":

			usu = (Usuario) request.getSession().getAttribute("usuario");

			if (usu != null) {
				request.getRequestDispatcher("indexUsu.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("indexUsu.jsp").forward(request, response);
			}

			// usu = udao.findLogin(request.getParameter("email"),
			// request.getParameter("pwd"));

			// request.getRequestDispatcher("indexUsu.jsp").forward(request, response);

			break;

		case "registrar":

			usu = (Usuario) request.getSession().getAttribute("usuario");

			if (usu == null) {
				request.getRequestDispatcher("registro.jsp").forward(request, response);
			}

			// request.getRequestDispatcher("indexUsu.jsp").forward(request, response);

			/*
			 * int autoIncrement = 0;
			 * 
			 * int eneagramaComun = 99;
			 * 
			 * usu = new Usuario(autoIncrement, request.getParameter("email"), new Date(),
			 * request.getParameter("nombre"), request.getParameter("pwd"), null, null);
			 * 
			 * 
			 * request.getRequestDispatcher("indexUsu.jsp").forward(request, response);
			 */

			/*
			 * System.out.println(request.getParameter("email"));
			 * System.out.println(request.getParameter("nombre"));
			 * System.out.println(request.getParameter("pwd"));
			 * 
			 * int autoIncrement = 0;
			 * 
			 * int eneagramaComun = 99;
			 * 
			 * usu = new Usuario(autoIncrement, request.getParameter("email"), new Date(),
			 * request.getParameter("nombre"), request.getParameter("pwd"), null, null);
			 * 
			 * request.getSession().setAttribute("usuario", usu);
			 * request.setAttribute("mensaje_registro", "Usuario registrado con exito");
			 * request.getRequestDispatcher("indexUsu.jsp").forward(request, response);
			 */

			/*
			 * if (udao.insert(usu) != 0) {
			 * 
			 * request.getSession().setAttribute("usuario", usu);
			 * request.setAttribute("mensaje_registro", "Usuario registrado con exito");
			 * request.getRequestDispatcher("indexUsu.jsp").forward(request, response);
			 * 
			 * } else { request.setAttribute("mensaje_error", "ya existe ese usuario");
			 * request.getRequestDispatcher("index.jsp").forward(request, response); }
			 */

			break;

		case "registro":

			int autoIncrement = 0;

			int eneagramaComun = 99;

			usu = new Usuario(autoIncrement, request.getParameter("email"), new Date(), request.getParameter("nombre"),
					request.getParameter("pwd"), null, null);

			request.getSession().setAttribute("usuario", usu);
			request.getRequestDispatcher("indexUsu.jsp").forward(request, response);

			break;

		case "logout":

			request.getSession().getAttribute("usuario");
			request.getSession().removeAttribute("usuario");

			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;

		case "login":
			String email;
			String pwd;

			UsuarioDAOImpl udaoimpl = new UsuarioDAOImpl();
			email = request.getParameter("email");
			pwd = request.getParameter("pwd");
			Usuario usuario = udaoimpl.findEmail(email, pwd);

			// System.out.println(email);
			// System.out.println(pwd);

			if (usuario == null) {
				request.getRequestDispatcher("registro.jsp").forward(request, response);

			} else {

				request.getSession().setAttribute("email", email);
				request.getSession().setAttribute("pwd", pwd);
				request.getRequestDispatcher("indexUsu.jsp").forward(request, response);
			}

			break;
		}

	}

}
