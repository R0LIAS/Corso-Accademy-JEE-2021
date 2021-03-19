package personale;

public class Giornaliero extends Dipendente{

	private int nGiornate;

	public Giornaliero(String nome, String cognome, String indirizzo, String telefono, int matricola, double stipendio,
			String codiceFiscale, double retribuzioneBase) {
		super(nome, cognome, indirizzo, telefono, matricola, stipendio, codiceFiscale, retribuzioneBase);
	}

	public void setnGiornate(int nGiornate) {
		this.nGiornate = nGiornate;
	}
	
	public double calcolaStipendio() {
		
		double risultato = retribuzioneBase * nGiornate;
		return risultato;
	}
	
	public void setNGiornate(int giorni) {
		nGiornate += giorni;
	}
}