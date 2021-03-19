package veicoli;

public class Veicolo {
	
	private String marca;
	private String modello;
	private String targa;
	private int numeroPosti;
	
	public Veicolo(String marca, String modello, String targa, int numeroPosti) {
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		this.numeroPosti = numeroPosti;
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	@Override
	public String toString() {
		return "Marca = " + marca + "\n" + "Modello = " + modello + "\n" + "Targa = " + targa + "\n" + "Numero posti = " + numeroPosti;
	}
}