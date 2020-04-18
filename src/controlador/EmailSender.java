package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.beans.Email;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

/**
 * Servlet implementation class EmailSender
 */
@WebServlet("/EmailSender")
public class EmailSender extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailSender() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//el parametro que buscamos
		String opcion = request.getParameter("validar");

		
		switch(opcion) {
		
		case "send":
			
				Email Email = new Email();
				Email.setMailServerProperties();
				String emailBody = "";
				String emailSubject = "Un nuevo mensaje desde la web RecApp";
				
				
				
				if (request.getParameter("name") != null) {
					emailBody = "Nombre del usuario: " + request.getParameter("name")
							+ "<br>";
				
				if (request.getParameter("email") != null) {
					emailBody = emailBody + "Contacto: "
							+ request.getParameter("email") + "<br>";
				}
				
				if (request.getParameter("subject") != "") {
					emailBody = emailBody + "Asunto: " + request.getParameter("subject") + "<br>";
					emailSubject = request.getParameter("subject");
				}
				
				if (request.getParameter("message") != null) {
					emailBody = emailBody + "Mensaje: " + request.getParameter("message")
							+ "<br>";
				}
				
				try {
					Email.createEmailMessage(emailSubject, emailBody);
				} catch (AddressException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				request.getRequestDispatcher("contacto.jsp").forward(request, response);

				
				try {
					Email.sendEmail();
				} catch (AddressException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			}}}}
	
