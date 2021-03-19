
public class Tempo {
	
	private int giorno;
	private int ora;
	private int minuto;
	private int secondi;
	
	public Tempo(int giorno, int ora, int minuto, int secondi) {
		this.giorno = giorno;
		this.ora = ora;
		this.minuto = minuto;
		this.secondi = secondi;
	}

	public int getGiorno() {
		return giorno * 86400;
	}

	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}

	public int getOra() {
		return ora * 3600;
	}

	public void setOra(int ora) {
		this.ora = ora;
	}

	public int getMinuto() {
		return minuto * 60;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSecondi() {
		return secondi;
	}

	public void setSecondi(int secondi) {
		this.secondi = secondi;
	}

	public int calcolaSecondi() {
		return getGiorno() + getMinuto() + getOra() + getSecondi();
	}
	
	@Override
	public String toString() {
		return "Tempo totale in secondi è: " + calcolaSecondi();
	}
}