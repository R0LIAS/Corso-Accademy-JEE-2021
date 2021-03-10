package personale;

public class Dipendente extends Personale {
	
	private String codiceFiscale;
	protected double retribuzioneBase;
	
	public Dipendente(String nome, String cognome, String indirizzo, String telefono, int matricola, double stipendio,
			String codiceFiscale, double retribuzioneBase) {
		super(nome, cognome, indirizzo, telefono, matricola, stipendio);
		this.codiceFiscale = codiceFiscale;
		this.retribuzioneBase = retribuzioneBase;
	}
	
	@Override
	public double calcolaStipendio() {
		return retribuzioneBase;
	}

	@Override
	public String toString() {
		return super.toString() + "Ccodice Fiscale = " + codiceFiscale + "\n" + "RetribuzioneBase = " + retribuzioneBase;
	}
}