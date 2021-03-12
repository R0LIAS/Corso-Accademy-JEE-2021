package impiegati;

public class Engineer extends Employee{

	private final static double GUADAGNO_GIORNALIERO = 35;
	private int valoreFisso;
	private int giorniDiLavoro;
	private int percentuale;
	
	public Engineer(String nome, String cognome) {
		super(nome, cognome);
	}

	public void setValoreFisso(int valoreFisso) {
		this.valoreFisso = valoreFisso;
	}

	public void setGiorniDiLavoro(int giorniDiLavoro) {
		this.giorniDiLavoro = giorniDiLavoro;
	}

	public void setPercentuale(int percentuale) {
		this.percentuale = percentuale;
	}
	
	private double calcolaPercentuale() {
		return (valoreFisso * percentuale) / 100;
	}

	@Override
	public double calcolaGuadagno() {
		System.out.print("Guadagno: ");
		return (GUADAGNO_GIORNALIERO * giorniDiLavoro) + calcolaPercentuale();
	}

	@Override
	public String toString() {
		return "Engineer " + super.toString() + "Giorni di lavoro: " + giorniDiLavoro 
				+ "\nValore fisso: " + valoreFisso + "\nPercentuale: "+ percentuale + " %";
	}
}