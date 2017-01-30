package encje;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the uzytkownik database table.
 * 
 */
@Entity
@Table(name="uzytkownik")
@NamedQuery(name="Uzytkownik.findAll", query="SELECT u FROM Uzytkownik u")
public class Uzytkownik implements Serializable {
	private static final long serialVersionUID = 1L;
	public Uzytkownik(int id, String imie, String nazwisko){
		this.id = id;
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", unique=true, nullable=false)
	private int id;

	@Column(name="Imie", nullable=false, length=50)
	private String imie;

	@Column(name="Nazwisko", nullable=false, length=50)
	private String nazwisko;

	//bi-directional one-to-one association to Dane
	@OneToOne
	@JoinColumn(name="ID", nullable=false, insertable=false, updatable=false)
	private Dane dane;

	public Uzytkownik() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImie() {
		return this.imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public Dane getDane() {
		return this.dane;
	}

	public void setDane(Dane dane) {
		this.dane = dane;
	}

}