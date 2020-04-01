package controlador;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAOS.UsuarioDAOImpl;
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
		
		
		request.getSession().setAttribute("usuario", usu);
		
		int autoIncrement = 0;
		//Se usará en más de un caso, asi que la he sacado a global


		switch (request.getParameter("option")) {

		case "validar":

			usu = (Usuario) request.getSession().getAttribute("usuario");

			if (usu == null) {
				request.getRequestDispatcher("index.jsp").forward(request, response);
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
			
			
			String email = request.getParameter("email");
			String pwd = request.getParameter("pwd");
			
			
//el login lo mantenemos a traves del mail?
//if (udao.findById(email) != null) {
//				
////El usuario existe
//				

				if (udao.findLogin(email, pwd) != null) {
					
					//Usuario existe y contraseña es correcta
					System.out.println("El usuario y contraseña ok!");
					request.getSession().setAttribute("usuario", usu);
					request.getRequestDispatcher("indexUsu.jsp").forward(request,response);
					
				} 
				
//else {						
////Combinación de usuario y contraseña incorrecta
//request.setAttribute("estado", "Comnbinación de usuario y contraseña incorrecta");
//request.getRequestDispatcher("registro.jsp");				
//}    /////////CHECK
				
					else {
				
					//No existe usuario con ese email
					System.out.println("No existe asi que lo creamos bbb");
					usu = new Usuario(autoIncrement, email, new Date(), request.getParameter("nombre"), pwd, null, null);
					request.getSession().setAttribute("usuario", usu);
					request.getRequestDispatcher("indexUsu.jsp").forward(request, response);
				}

				break;

		case "logout":
			
			request.getSession().getAttribute("usuario");
			request.getSession().removeAttribute("usuario");

			request.getRequestDispatcher("index.jsp").forward(request, response);
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
