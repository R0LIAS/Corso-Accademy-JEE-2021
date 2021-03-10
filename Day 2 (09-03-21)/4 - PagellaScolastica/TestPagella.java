package pagellascolastica;

public class TestPagella {

	public static void main(String[] args) {
		
		Voto[] voti1 = {new Voto("Italiano", 1, "Schifo"), 
				new Voto("Matematica", 2, "Meno schifo"),
				new Voto("Informatica", 10, "Fenomeno")}; 
		
		Voto[] voti2 = {new Voto("Italiano", 10, "Secchione"), 
				new Voto("Matematica", 10, "Nerd"),
				new Voto("Informatica", 1, "Fai pena")}; 
		
		Studente[] studenti = {new Studente("Mario", "Bianchi", "5G", voti1), 
				new Studente("Luca", "Verdi", "1G", voti2)};
		
		Stampa listaVotiStudente = new Stampa();
		
		for(int i = 0; i < studenti.length; i++) {
			listaVotiStudente.stampaVotiStudente(studenti[i]);
		}	
	}
}