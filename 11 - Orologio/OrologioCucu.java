package orologio;

public class OrologioCucu extends Orologio{

	public OrologioCucu(int ore, int minuti, int secondi) {
		super(ore, minuti, secondi);
		
	}
	
	@Override
	public String stampaOra() {
		return "* Orologio a Cucu * " + super.stampaOra();
	}
}