package kontroler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaneDaoImpl;
import dao.UzytkownikDaoImpl;
import encje.Dane;
import encje.Uzytkownik;
import server.server;

@WebServlet(name = "kontroler1", urlPatterns = { "/kontroler1" })
public class kontroler1 extends HttpServlet{

	private static final long serialVersionUID = -5554371485391595568L;

	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw=response.getWriter();
		String imie=request.getParameter("imie");
		String nazwisko=request.getParameter("nazwisko");
		String login=request.getParameter("login");
		String haslo=request.getParameter("haslo");
		String lp=request.getParameter("liczba_prob");
		
		UzytkownikDaoImpl r=new UzytkownikDaoImpl();
		Integer id=r.NewIdUzytkownik();
		
		
		lp=Integer.toString(0);
		Uzytkownik klient= new Uzytkownik(id, imie, nazwisko);
		Dane kl=new Dane(klient.getId(), login, haslo,lp);
		
		try{
			server krs=new server();
			boolean rs=krs.rejestracja(klient);
			boolean rs1=krs.rejestracja1(kl);
			if(rs && rs1){
				request.getSession().setAttribute("id", id.toString());
				response.sendRedirect("reg-ok.jsp");
			}
			else{
				request.getSession().setAttribute("id", null);
				response.sendRedirect("reg-fail.jsp");
			}
		}finally{
			pw.close();
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
