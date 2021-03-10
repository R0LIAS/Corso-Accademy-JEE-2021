package personale;

public class Volontario extends Personale{

	public Volontario(String nome, String cognome, String indirizzo, String telefono, int matricola, double stipendio) {
		super(nome, cognome, indirizzo, telefono, matricola, stipendio);
	}

	@Override
	public double calcolaStipendio() {
		return 0;
	}

	@Override
	public String toString() {
		return "Volontario: " + super.toString();
	}
}