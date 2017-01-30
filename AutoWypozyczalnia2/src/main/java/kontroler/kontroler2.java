package kontroler;
import encje.Dane;
import server.login;
import dao.DaneDaoImpl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "kontroler2", urlPatterns = { "/kontroler2" })
public class kontroler2 extends HttpServlet {
	private static final long serialVersionUID = -9058829356528043636L;

	protected void processRequest(HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
	
	String id = request.getParameter("ID");
	String login = request.getParameter("login");
	String haslo = request.getParameter("haslo");
	login kls= new login();
	boolean result=kls.login(Integer.parseInt(id), login, haslo);
	DaneDaoImpl kdi=new DaneDaoImpl();
	Dane klient=kdi.findById(Integer.parseInt(id));
	if (result == true) {
		request.getSession().setAttribute("klient", klient);
		response.sendRedirect("success.jsp");
	} else { 
		request.getSession().setAttribute("klient", null);
		response.sendRedirect("fail.jsp");
	}
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	public String getServletInfo() {
		return "Short description";
	}
}
