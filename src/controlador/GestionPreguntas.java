package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.DAOS.PreguntaDAOImpl;
import modelo.beans.Pregunta;

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
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PreguntaDAOImpl pdao = new PreguntaDAOImpl();

		HttpSession sesionQuestion = request.getSession();
		HttpSession idQuestion = request.getSession();

		Integer tipoEneagrama = (Integer) sesionQuestion.getAttribute("id");
		Integer idEneag =  (Integer) idQuestion.getAttribute("tipoEne");

		switch (request.getParameter("option")) {

		case "question":

			System.out.println(tipoEneagrama);

			if (tipoEneagrama == null) {

				tipoEneagrama = 1;
				idEneag = 1;
			
				System.out.println("Tipo eneagrama = 1 " + request.getParameter("valor"));

			} else {

				tipoEneagrama++;
				idEneag++;
				
				System.out.println("Tipo eneagrama ++ " + request.getParameter("valor"));

			}

			List<Pregunta> lista = pdao.findByTipoEneg(tipoEneagrama);
			
			

			System.out.println(lista);
			System.out.println(tipoEneagrama);
			request.setAttribute("preguntas", lista);
			idQuestion.setAttribute("tipoEne", pdao.findByID(idEneag));
			System.out.println("aquiiiiiii " + idQuestion.getAttribute("tipoEne"));
			sesionQuestion.setAttribute("id", tipoEneagrama);

			if (tipoEneagrama > 9) {
				sesionQuestion.invalidate();
				request.getRequestDispatcher("resultado.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("question.jsp").forward(request, response);
			}

			break;

		}
	}
}
