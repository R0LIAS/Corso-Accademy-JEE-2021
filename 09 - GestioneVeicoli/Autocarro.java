package veicoli;

public class Autocarro extends Veicolo{
	
	private int capacita;
	
	public Autocarro(String marca, String modello, String targa, int numeroPosti, int capacita) {
		super(marca, modello, targa, numeroPosti);
		this.capacita = capacita;
	}

	public int getCapacita() {
		return capacita;
	}

	public void setCapacita(int capacita) {
		this.capacita = capacita;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + "Capacità = " + capacita;
	}
}