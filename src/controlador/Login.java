package controlador;

import java.io.IOException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static javax.swing.JOptionPane.showMessageDialog;

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


		// request.getSession().setAttribute("usuario", usu);
		usu = (Usuario) request.getSession().getAttribute("usuario");

		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String nombre = request.getParameter("nombre");

		int autoIncrement = 0;


		switch (request.getParameter("option")) {

		case "validar":


			Pattern pattern = Pattern.compile(
					"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
			Matcher mather = pattern.matcher(email);

if (udao.findByEmail(email) != null) {

			if (mather.find() == true && pwd.length() >= 5) {

				if (udao.findLogin(email, pwd) == null) {

					request.setAttribute("estado", "combinaci�n de usuario y contrase�a incorrecta");
					request.getRequestDispatcher("logear.jsp").forward(request, response);	
				
					
				} else {
					
					usu = udao.findLogin(email, pwd);
					
					request.getSession().setAttribute("usuario", usu);
					request.getRequestDispatcher("indexUsu.jsp").forward(request, response);
				}


			}
} else {
				request.getRequestDispatcher("registro.jsp").forward(request, response);

}


			break;
        
		case "registrar":

			usu = (Usuario) request.getSession().getAttribute("usuario");

			System.out.println(usu);

			if (usu == null) {
				request.getRequestDispatcher("registro.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("logear.jsp").forward(request, response);
			}

			break;

		case "registro":

			Pattern patt = Pattern.compile(
					"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
			Matcher math = patt.matcher(email);

			if (math.find() == true && pwd.length() >= 5) {


				if (udao.findByEmail(email) != null) {

					if (udao.findLogin(email, pwd) != null) {

						request.setAttribute("estado", "ya estas registrado, haz login!");

						request.getRequestDispatcher("logear.jsp").forward(request, response);

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

					// showMessageDialog(null, "Usuario registrado :)");
					request.getRequestDispatcher("indexUsu.jsp").forward(request, response);
				}
			} else {
				
				request.setAttribute("estado", "El email es invalido o la contrase�a muy corta");
				request.getRequestDispatcher("registro.jsp").forward(request, response);

			}

			break;

		case "logout":

			request.getSession().removeAttribute("usuario");
			request.getSession().removeAttribute("idEneag");
			request.getSession().removeAttribute("id");
			request.getSession().removeAttribute("mapa");

			request.getSession().invalidate();

			request.getRequestDispatcher("index.jsp").forward(request, response);
			
			break;

		case "cerrar-test":

			request.getSession().removeAttribute("idEneag");
			request.getSession().removeAttribute("id");
			request.getSession().removeAttribute("mapa");



			request.getRequestDispatcher("indexUsu.jsp").forward(request, response);

			break;

		case "usuario":

			if (usu == null) {
				
				request.getRequestDispatcher("registro.jsp").forward(request, response);
				
					} else {
				request.getRequestDispatcher("indexUsu.jsp").forward(request, response);
			}
			break;

		}

	}

}