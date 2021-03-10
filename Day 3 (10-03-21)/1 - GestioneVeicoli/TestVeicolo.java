package veicoli;

public class TestVeicolo {

	public static void main(String[] args) {
		
		Autocarro autocarro1 = new Autocarro("FIAT", "Doblo", "ABCDEF", 4, 100);
		
		Autoveicolo autoveicolo1 = new Autoveicolo("Alfa Romeo", "Giulia", "MAGARI", 5, 5);
		
		System.out.println("Autocarro: ");
		System.out.println(autocarro1.toString());
		System.out.println("--------------------");
		System.out.println("Autoveicolo: ");
		System.out.println(autoveicolo1.toString());	
	}
}