package persone;

public class Persona {
	
	private String nome;
	private String cognome;
	private int eta;
	
	
	public Persona(String nome, String cognome, int eta) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	public String dettagli() {
		return this.nome + this.cognome + this.eta;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\n" + "Cognome: " + cognome + "\n" + "Classe: " + eta + "\n--------------------";
	}
}