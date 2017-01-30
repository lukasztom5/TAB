package encje;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dane database table.
 * 
 */
@Entity
@Table(name="dane")
@NamedQuery(name="Dane.findAll", query="SELECT d FROM Dane d")
public class Dane implements Serializable {
	private static final long serialVersionUID = 1L;

	public Dane(int id, String login, String haslo, String liczbaProb){
		this.id = id;
		this.login = login;
		this.haslo = haslo;
		this.liczbaProb = liczbaProb;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=50)
	private String haslo;

	@Column(name="liczba_prob", nullable=false, length=50)
	private String liczbaProb;

	@Column(nullable=false, length=50)
	private String login;

	//bi-directional one-to-one association to Uzytkownik
	@OneToOne(mappedBy="dane")
	private Uzytkownik uzytkownik;

	public Dane() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHaslo() {
		return this.haslo;
	}

	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}

	public String getLiczbaProb() {
		return this.liczbaProb;
	}

	public void setLiczbaProb(String liczbaProb) {
		this.liczbaProb = liczbaProb;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Uzytkownik getUzytkownik() {
		return this.uzytkownik;
	}

	public void setUzytkownik(Uzytkownik uzytkownik) {
		this.uzytkownik = uzytkownik;
	}

}