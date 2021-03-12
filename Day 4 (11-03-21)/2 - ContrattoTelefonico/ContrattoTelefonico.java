package contratto;

public class ContrattoTelefonico {
	
	private String numero;
	private String nomeAbbonato;
	private double costoTelefonate;
	private int numeroTelefonate;
	private static final double COSTO_AL_SECONDO = 0.10;
	
	public ContrattoTelefonico(String numero, String nomeAbbonato) {
		this.numero = numero;
		this.nomeAbbonato = nomeAbbonato;
		costoTelefonate = 0;
	}

	public String datiUtenza() {
		return "Numero = " + numero + "\n" + "Nome abbonato = " + nomeAbbonato;
	}
	
	public void calcolaCostoTelefonata(int numeroSecondi) {
		costoTelefonate += COSTO_AL_SECONDO * numeroSecondi;
		numeroTelefonate++;
	}
	
	public double getCostoTelefonate() {
		return costoTelefonate;
	}

	public int getNumeroTelefonate() {
		return numeroTelefonate;
	}
	
	public void aggiungiCosto(double aggiunta) {
		costoTelefonate += aggiunta;
	}

	public String stampaCostoTelefonata() {
		return "Costo telefonata = " + costoTelefonate + "\n" + "Numero telefonate = " + numeroTelefonate;
	}
}