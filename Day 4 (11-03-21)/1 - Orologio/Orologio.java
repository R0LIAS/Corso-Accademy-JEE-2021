package orologio;

public class Orologio {
	
	private int ore;
	private int minuti;
	private int secondi;
	
	public Orologio(int ore, int minuti, int secondi) {
		
		this.ore = ore;
		this.minuti = minuti;
		this.secondi = secondi;
		
	}
	
	public void incrementaSecondi() {
		
		secondi++;
		if(secondi == 60) {
			secondi = 0;
			minuti++;
			if(minuti == 60) {
				minuti = 0;
				ore++;
				if(ore == 24) {
					ore = 0;
				}		
			}
		}			
	}

	public String stampaOra() {
		return "Ora: " + ore + " - Min: " + minuti + " - Sec: " + secondi;
	}
}