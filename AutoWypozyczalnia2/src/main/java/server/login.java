package server;
import dao.DaneDaoImpl;
import encje.Dane;

public class login {
public boolean login(int iddane, String login, String haslo){
	DaneDaoImpl kdi= new DaneDaoImpl();
	Dane dane=kdi.findById(iddane);
	if(dane!=null && dane.getId()==iddane && dane.getLogin().equals(login) && dane.getHaslo().equals(haslo))
		return true;
	else
		
	return false;
	
}
}
