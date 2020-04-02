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
			
			
			//el login lo mantenemos a traves del mail?
			if (udao.findByEmail(email) != null) {
				
				//El usuario existe
				System.out.println("Usuario con este email exist");

				if (udao.findLogin(email, pwd) != null) {
					
					//Usuario existe y contraseña es correcta
					System.out.println("El usuario y contraseña ok!");
					request.getSession().setAttribute("usuario", usu);
					request.getRequestDispatcher("indexUsu.jsp").forward(request,response);
					
				} 
				
				else {						
					//Combinación de usuario y contraseña incorrecta
					request.setAttribute("estado", "Combinación de usuario y contraseña incorrecta");
					request.getRequestDispatcher("registro.jsp").forward(request, response);				
				}  
				
				}else {
				
					//No existe usuario con ese email
					System.out.println("No existe asi que lo creamos bb");
					usu = new Usuario(autoIncrement, email, new Date(), request.getParameter("nombre"), pwd, 0, null, null);
					request.getSession().setAttribute("usuario", usu);
					request.getRequestDispatcher("indexUsu.jsp").forward(request, response);
					udao.insert(usu);
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
