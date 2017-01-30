package dao;

import encje.Uzytkownik;

public interface UzytkownikDao {
	public abstract void save(Uzytkownik uzytkownik);
	public abstract Uzytkownik findById(int id);	
	public abstract boolean UzytExists(Uzytkownik uzytkownik);	
	public abstract Integer NewIdUzytkownik();
}
