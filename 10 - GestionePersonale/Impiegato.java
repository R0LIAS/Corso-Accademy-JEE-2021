package personale;

public class Impiegato extends Dipendente {
	
	private double bonus;

	public Impiegato(String nome, String cognome, String indirizzo, String telefono, int matricola, double stipendio,
			String codiceFiscale, double retribuzioneBase) {
		super(nome, cognome, indirizzo, telefono, matricola, stipendio, codiceFiscale, retribuzioneBase);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double calcolaStipendio() {
		//super.calcolaStipendio() invoca il mentodo calcolaStipendio della classe base Dipendente
		double stipendio = bonus +  super.calcolaStipendio();
		return stipendio;
	}

	@Override
	public String toString() {
		return super.toString() + "Bonus = " + bonus;
	}
}