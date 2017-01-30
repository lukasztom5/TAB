package server;
import dao.DaneDaoImpl;
import encje.Dane;
import dao.UzytkownikDaoImpl;
import encje.Uzytkownik;

public class server {
public boolean rejestracja (Uzytkownik klient){
	UzytkownikDaoImpl wdi = new UzytkownikDaoImpl();
	if(wdi.UzytExists(klient)){
	    return false;
	}
	try{
		wdi.save(klient);
	}catch(Exception e){
		e.printStackTrace();
	}
	return true;
	
}
public boolean rejestracja1 (Dane klient){
	DaneDaoImpl kdi = new DaneDaoImpl();
	if(kdi.DaneExists(klient)){
	    return false;
	}
	try{
		kdi.save(klient);
	}catch(Exception e){
		e.printStackTrace();
	}
	return true;
	
}
}
