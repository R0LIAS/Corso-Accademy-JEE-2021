package contratto;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		Random generatoreRandom = new Random();
		
		ContrattoFisso utente1 = new ContrattoFisso("01", "Mario", "Roma");
		ContrattoMobile utente2 = new ContrattoMobile("02", "Luca");
		
		//Simulazione chiamate
		for(int i = 1; i <= 5; i++) {
			int tempoSecondi = generatoreRandom.nextInt(100) + 1;
			utente1.calcolaCostoTelefonata(tempoSecondi);
			utente2.calcolaCostoTelefonata(tempoSecondi);
		}
		
		System.out.println("* Bollette telefoniche *");
		System.out.println(utente1.datiUtenza());
		System.out.println(utente1.stampaCostoTelefonata());
		System.out.println("--------------------");
		System.out.println("(Contratto mobile)");
		System.out.println(utente2.datiUtenza());
		System.out.println(utente2.stampaCostoTelefonata());
	}
}