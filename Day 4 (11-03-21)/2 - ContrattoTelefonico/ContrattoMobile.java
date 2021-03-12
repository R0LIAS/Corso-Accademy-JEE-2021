package contratto;

public class ContrattoMobile extends ContrattoTelefonico {
	
	private static final double COSTO_RISPOSTA = 0.50;

	public ContrattoMobile(String numero, String nomeAbbonato) {
		super(numero, nomeAbbonato);	
	}
	
	@Override
	public void calcolaCostoTelefonata(int numeroSecondi) {
		super.calcolaCostoTelefonata(numeroSecondi);
		super.aggiungiCosto(COSTO_RISPOSTA);
	}	
}