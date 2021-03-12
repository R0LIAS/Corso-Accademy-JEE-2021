package impiegati;

public class Laborer extends Employee{
	
	private final static double GUADAGNO_ORE_GIORNALIERO = 10;
	private final static double GUADAGNO_PER_PEZZO_LAVORATO = 10;
	private int oreDiLavoro;
	private int pezziLavorati;
	
	public Laborer(String nome, String cognome) {
		super(nome, cognome);
	}

	public void setOreDiLavoro(int oreDiLavoro) {
		this.oreDiLavoro = oreDiLavoro;
	}

	public void setPezziLavorati(int pezziLavorati) {
		this.pezziLavorati = pezziLavorati;
	}

	@Override
	public double calcolaGuadagno() {
		System.out.print("Guadagno: ");
		return (GUADAGNO_ORE_GIORNALIERO * oreDiLavoro) + (GUADAGNO_PER_PEZZO_LAVORATO * pezziLavorati);
	}

	@Override
	public String toString() {
		return "Lavorer " + super.toString() + "Ore di lavoro: " 
				+ oreDiLavoro  + "\nGuadagno per ora: " + GUADAGNO_ORE_GIORNALIERO + "\nPezzi lavorati: " 
				+ pezziLavorati + "\nCosto pezzo: " + GUADAGNO_PER_PEZZO_LAVORATO + " €";
	}
}