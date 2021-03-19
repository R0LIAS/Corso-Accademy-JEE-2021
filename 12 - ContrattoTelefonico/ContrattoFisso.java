package contratto;

public class ContrattoFisso extends ContrattoTelefonico{

	private String indirizzo;

	public ContrattoFisso(String numero, String nomeAbbonato, String indirizzo) {
		super(numero, nomeAbbonato);
		this.indirizzo = indirizzo;
	}	
	
	@Override
	public String datiUtenza() {
		return "(Contratto fisso)" + "\n" + super.datiUtenza() + "\n" + "Indirizzo = " + indirizzo;
	}
}