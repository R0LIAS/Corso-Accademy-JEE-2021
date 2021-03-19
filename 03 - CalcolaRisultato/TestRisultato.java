package risultato;

public class TestRisultato {

	public static void main(String[] args) {
		
		Risultato risultato = new Risultato(5.0f);
		
		risultato.stampa();
		
		CambiaRisultato cambiaRisultato = new CambiaRisultato();
		
		cambiaRisultato.newRisultato(risultato);
		
		risultato.stampa();

	}
}
