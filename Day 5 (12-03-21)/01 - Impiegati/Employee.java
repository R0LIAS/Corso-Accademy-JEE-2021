package impiegati;

public abstract class Employee {
	
	private String nome;
	private String cognome;
	
	public Employee() {	
	}
	
	public Employee(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public abstract double calcolaGuadagno();
	
	@Override
	public String toString() {
		return "\nNome: " + nome + "\nCognome: " + cognome + "\n";
	}
}