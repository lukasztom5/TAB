package dao;

import encje.Dane;

public interface DaneDao {
	public abstract void save(Dane dane);
	public abstract Dane findById(int id);	
	public abstract boolean DaneExists(Dane dane);	
	public abstract Integer NewIdDane();

}
