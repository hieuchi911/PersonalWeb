package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Store
 */
@WebServlet("/Store")
public class Store extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Store() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String pw = request.getParameter("password");
		String cfpw = request.getParameter("cfpw");
		
		if(pw.equals(cfpw)) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"\r\n" + 
					"	pageEncoding=\"ISO-8859-1\"%>\r\n" + 
					"<!DOCTYPE html>\r\n" + 
					"<html>\r\n" + 
					"<head>\r\n" + 
					"<meta charset=\"ISO-8859-1\">\r\n" + 
					"<title>Login</title>\r\n" + 
					"<link rel=\"stylesheet\" type=\"text/css\" href=\"mainDeco.css\">\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					"	<div style=\"background-color: gray; background-size: cover; background-attachment: fixed; height: 100%; width: 100%; position: absolute; z-index: -1;\">\r\n" + 
					"		<div style=\"text-align: center; width: 50%; height: inherit; display: flex; float: left; justify-content: center; align-items: center;\">\r\n" + 
					"			<h1 style=\"color: white; letter-spacing: 3px\">| Registration</h1>\r\n" + 
					"		</div>\r\n" + 
					"		<div style=\"text-align: center; width: 10%; height: inherit; display: flex; float: left; justify-content: center; align-items: center;\">\r\n" + 
					"			<form method=\"post\" action=\"Store\">\r\n" + 
					"				<table style=\"background-color: rgba(255,255,255,0.5); width: 500px; height: 150px\">\r\n" + 
					"					<tr><td colspan=\"2\" style=\"width: 450px;\"><h2>Member Registration</h2></td></tr>\r\n" + 
					"					\r\n" + 
					"					<tr>\r\n" + 
					"						<td style=\"width: 200px\">Full name:</td><td> "+ fullname +"</td>\r\n"+
					"					</tr>\r\n" + 
					"					\r\n" + 
					"					<tr>\r\n" + 
					"						<td style=\"width: 200px\">Email:</td><td> "+ email + "</td>\r\n" +
					"					</tr>\r\n" + 
					"					\r\n" + 
					"					<tr>\r\n" + 
					"						<td style=\"width: 200px\">User name:</td><td> "+ username + "</td>\r\n"+
					"					</tr>\r\n" + 
					"				</table>\r\n" + 
					"			</form>\r\n" + 
					"		</div>\r\n" + 
					"	</div>\r\n" + 
					"\r\n" + 
					"</body>\r\n" + 
					"</html>");

		}
		else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("RegistrationAgain.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}
