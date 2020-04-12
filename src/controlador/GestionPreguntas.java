package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import modelo.DAOS.EneagramaDAOImpl;
import modelo.DAOS.PreguntaDAOImpl;
import modelo.DAOS.UsuarioDAOImpl;
import modelo.beans.Eneagrama;
import modelo.beans.Pregunta;
import modelo.beans.Usuario;

/**
 * Servlet implementation class GestionPreguntas
 */
@WebServlet("/GestionPreguntas")
public class GestionPreguntas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GestionPreguntas() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		EneagramaDAOImpl edao = new EneagramaDAOImpl();
		PreguntaDAOImpl pdao = new PreguntaDAOImpl();

		Usuario usu = null;
		UsuarioDAOImpl udao = new UsuarioDAOImpl();
		
		usu = (Usuario) request.getSession().getAttribute("usuario");
		
		// udao.insert(usu)
		
		System.out.println(request.getSession().getAttribute("usuario"));

		HttpSession sesionQuestion = request.getSession();
		Integer tipoEneagrama = (Integer) sesionQuestion.getAttribute("id");

		Integer idEneagrama = (Integer) sesionQuestion.getAttribute("idEneag");

		List<Integer> arrayResultadoPreguntas = null;

		HashMap<Integer, Integer> cantidadPreguntas = (HashMap<Integer, Integer>) sesionQuestion.getAttribute("mapa");
		HashMap<Integer, Integer> maxPreguntas = (HashMap<Integer, Integer>) sesionQuestion.getAttribute("max");
		if (cantidadPreguntas == null) {
			cantidadPreguntas = new HashMap<Integer, Integer>();
		}

		switch (request.getParameter("option")) {

		case "question":

			System.out.println(tipoEneagrama);

			if (tipoEneagrama == null || idEneagrama == null) {

				tipoEneagrama = 1;

				idEneagrama = 1;

				System.out.println("dentro del nulo");

				if (request.getParameterValues("isbn") != null) {

					System.out.println("dentro del nulo 2");

					if (arrayResultadoPreguntas == null) {
						arrayResultadoPreguntas = new ArrayList<Integer>();
					}

					for (String ele : request.getParameterValues("isbn")) {
						arrayResultadoPreguntas.add(Integer.valueOf(request.getParameter("cantidad" + ele)));
					}

					System.out.println("cosas dentro del array pregunta 1: " + arrayResultadoPreguntas);
				}

			} else {

				tipoEneagrama++;

				idEneagrama++;

				System.out.println("fuera del nulo");

				System.out.println("fuera del nulo 2");

				if (arrayResultadoPreguntas == null) {
					arrayResultadoPreguntas = new ArrayList<Integer>();
				}

				for (String ele : request.getParameterValues("isbn")) {
					arrayResultadoPreguntas.add(Integer.valueOf(request.getParameter("cantidad" + ele)));
				}

				System.out.println("cosas dentro del array preguntas: " + arrayResultadoPreguntas);

				int num = 0;

				for (Integer l : arrayResultadoPreguntas) {
					num += l;
				}

				cantidadPreguntas.put(idEneagrama, num);

				sesionQuestion.setAttribute("mapa", cantidadPreguntas);

				System.out.println("valores del array " + num);

			}

			request.setAttribute("tipoEne", edao.findEneagrama(idEneagrama));

			List<Pregunta> lista = pdao.findByTipoEneg(tipoEneagrama);

			request.setAttribute("preguntas", lista);

			sesionQuestion.setAttribute("idEneag", idEneagrama);

			sesionQuestion.setAttribute("id", tipoEneagrama);

			if (tipoEneagrama > 9) {

				// sesionQuestion.invalidate();

				boolean mayor20 = false;
				Integer numID = null;
				int max = 19;
				
				List<Integer> t = new ArrayList<>();
				List<Integer> z = new ArrayList<>();

				
				for (Integer en : cantidadPreguntas.keySet()) {
					
					t.add(cantidadPreguntas.get(en));
				}
				
					for (int i = 0; i < t.size(); i++) {
						if (t.get(i) > max) {
							
							max = t.get(i);
							numID = (i + 1);
							mayor20 = true;
							
							//Como max empieza en 19, ya estas controlando que sea mayor/igual a 20
					}
					}
					
					for (int i = 0; i < t.size(); i++) {
						if (t.get(i) == max) {
							
							numID = (i + 1);
							z.add(numID);
							
							//volvemos a recorrer para ver si hay más de uno con esa cantidad
					}
						}
					
					if(z.size() > 1) {
						System.out.println("Patata recontra intergaláctica maldita");
						//Hay que decidir bien que haremos xd
						
						for (int i = 0 ; i < z.size(); i++) {
						System.out.println(z.get(i));
//						edao.findEneagrama(z.get(i));
						
//						
//						Si hay mas de una opción, que haremos, 
//						separamos? si hay dos, X, si hay 3, Y, 
//						Si hay mas, pues Incorrecto?
						
//						Decidir
						
						
//						
//						Also, seguro esta logica es super resumible
//						pero ahora mismo no lo veo, no tengo cerebro ya
//						Mañana lo vemos
						}
						
						request.getRequestDispatcher("resultaDos.jsp").forward(request, response);
					}
					

					if (mayor20) {

					System.out.println("este es el primer id: " + numID);

					sesionQuestion.setAttribute("descTipo", edao.findEneagrama(numID));
					
					System.out.println(sesionQuestion.getAttribute("descTipo"));

					Eneagrama userValues = (Eneagrama) sesionQuestion.getAttribute("descTipo");
					
					usu.setEneagrama(userValues);
					usu.setTipoEneagrama(userValues.getTipo());
					usu.setResultadoTest(max);

					udao.insert(usu);

					request.getRequestDispatcher("resultado.jsp").forward(request, response);

				} else {

					sesionQuestion.removeAttribute("idEneag");
					sesionQuestion.removeAttribute("id");
					sesionQuestion.removeAttribute("mapa");
					sesionQuestion.removeAttribute("descTipo");
//					sesionQuestion.invalidate();
					usu = (Usuario) request.getSession().getAttribute("usuario");
					
					request.getRequestDispatcher("testIncorrecto.jsp").forward(request, response);
				}

			} else {

				request.getRequestDispatcher("question.jsp").forward(request, response);
			}

			break;

		}
	}
}