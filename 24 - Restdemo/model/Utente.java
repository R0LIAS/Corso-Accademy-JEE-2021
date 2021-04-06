package springtest.restdemo.model;

import javax.persistence.*;

@Entity
@Table (name = "utenti")
public class Utente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(nullable = false, unique = true)
	private String cf;

	public Utente() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	@Override
	public String toString() {
		return "Id: " + id + "\nNome: " + nome + "\nCognome: " + cognome + "\nCodice fiscale: " + cf;
	}
}