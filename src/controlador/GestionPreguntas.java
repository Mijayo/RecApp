package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.DAOS.EneagramaDAOImpl;
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

		EneagramaDAOImpl edao = new EneagramaDAOImpl();

		PreguntaDAOImpl pdao = new PreguntaDAOImpl();

		HttpSession sesionQuestion = request.getSession();
		Integer tipoEneagrama = (Integer) sesionQuestion.getAttribute("id");

		HttpSession sesionEneagrama = request.getSession();
		Integer idEneagrama = (Integer) sesionEneagrama.getAttribute("idEneag");

		List<Integer> arrayResultadoPreguntas = null;

		
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
				int arrayNum[] = new int[1]; // new int[9]

				for (Integer l : arrayResultadoPreguntas) {
					num += l;

					for (int i = 0; i < arrayNum.length; i++) {
						arrayNum[i] = num;
					}

				}

				System.out.println("valores del array " + num);
				/*
				 * System.out.println("suma del array " + arrayNum[0] + " " + arrayNum[1] + " "
				 * + arrayNum[2] + " " + arrayNum[3] + " " + arrayNum[4] + " " + arrayNum[5] +
				 * " " + arrayNum[6] + " " + arrayNum[7] + " " + arrayNum[8] + " " );
				 */

			}

			request.setAttribute("tipoEne", edao.findEneagrama(idEneagrama));

			List<Pregunta> lista = pdao.findByTipoEneg(tipoEneagrama);

			request.setAttribute("preguntas", lista);

			sesionEneagrama.setAttribute("idEneag", idEneagrama);

			sesionQuestion.setAttribute("id", tipoEneagrama);

			if (tipoEneagrama > 9) {

				sesionQuestion.invalidate();
				sesionEneagrama.invalidate();

				request.getRequestDispatcher("resultado.jsp").forward(request, response);

			} else {
				request.getRequestDispatcher("question.jsp").forward(request, response);
			}

			break;

		}
	}
}
