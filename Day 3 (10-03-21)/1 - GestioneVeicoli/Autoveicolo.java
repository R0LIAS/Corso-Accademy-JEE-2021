package veicoli;

public class Autoveicolo extends Veicolo{
	
	private int numeroPorte;
	
	public Autoveicolo(String marca, String modello, String targa, int numeroPosti, int numeroPorte) {
		super(marca, modello, targa, numeroPosti);	
		this.numeroPorte = numeroPorte;
		
	}

	public int getNumeroPorte() {
		return numeroPorte;
	}

	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}

	@Override
	public String toString() {
		return super.toString() + "Numero porte = " + numeroPorte;
	}
}