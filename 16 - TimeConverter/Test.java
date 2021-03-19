
public class Test {

	public static void main(String[] args) {

		Tempo tempo = new Tempo(2, 5, 10, 35);
		
		System.out.println("Giorni: " + tempo.getGiorno() + " in secondi");
		System.out.println("Ore: " + tempo.getOra() + " in secondi");
		System.out.println("Minuti: " + tempo.getMinuto() + " in secondi");
		System.out.println("Secondi: " + tempo.getSecondi() + " in secondi");
		
		System.out.println(tempo.toString());
	}
}