package pagellascolastica;

public class Stampa {
	
	public void stampaVotiStudente(Studente studente) {
		
		System.out.println("----- Studente -----");
		System.out.println(studente.toString());
		System.out.println("----- Pagella -----");
		
		for(int i = 0; i < studente.getListaVoti().length; i++) {
			System.out.println(studente.getListaVoti()[i]);
		}
	}
}