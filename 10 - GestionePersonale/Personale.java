package personale;

public abstract class Personale {
	
	private String nome;
	private String cognome;
	private String indirizzo;
	private String telefono;
	private int matricola;
	private double stipendio;
	
	public Personale(String nome, String cognome, String indirizzo, String telefono, int matricola, double stipendio) {
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
		this.matricola = matricola;
		this.stipendio = stipendio;
	}

	public abstract double calcolaStipendio();
	
	@Override
	public String toString() {
		return "Nome = " + nome + "\n" + "Cognome = " + cognome + "\n" + "Indirizzo=" + indirizzo + "\n" + "Telefono = "
				+ telefono + "\n" + "Matricola = " + matricola + "\n" + "Stipendio = " + stipendio;
	}
}