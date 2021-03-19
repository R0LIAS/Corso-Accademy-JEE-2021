package impiegati;

public class Technician extends Employee {
	
	private final static double GUADAGNO_GIORNALIERO = 30;
	private final static double GUADAGNO_ORE_BONUS = 6;
	private int giorniDiLavoro;
	private int oreDiStraordinario;
	
	public Technician(String nome, String cognome) {
		super(nome, cognome);
	}

	public void setGiorniDiLavoro(int giorniDiLavoro) {
		this.giorniDiLavoro = giorniDiLavoro;
	}

	public void setOreDiStraordinario(int oreDiStraordinario) {
		this.oreDiStraordinario = oreDiStraordinario;
	}

	@Override
	public double calcolaGuadagno() {
		System.out.print("Guadagno: ");
		return (GUADAGNO_GIORNALIERO * giorniDiLavoro) + (GUADAGNO_ORE_BONUS * oreDiStraordinario);
	}

	@Override
	public String toString() {
		return "Technician " + super.toString() + "Giorni di lavoro: " + giorniDiLavoro + "\nOre di straordinario: " +  oreDiStraordinario;
	}
}