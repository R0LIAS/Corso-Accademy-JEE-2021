package impiegati;

public class TestImpiegato {

	public static void main(String[] args) {

		Technician tecnico = new Technician("Giuseppe", "Verdi");
		
		tecnico.setGiorniDiLavoro(28);
		tecnico.setOreDiStraordinario(10);		
		
		System.out.println(tecnico.toString());
		System.out.println(tecnico.calcolaGuadagno() + " €");
		
		Laborer laborer = new Laborer("Mario", "Rossi");
		
		laborer.setOreDiLavoro(80);
		laborer.setPezziLavorati(20);
		
		System.out.println("--------------------");
		System.out.println(laborer.toString());
		System.out.println(laborer.calcolaGuadagno() + " €");
		
		Engineer engineer = new Engineer("Luca", "Bianchi");
		
		engineer.setGiorniDiLavoro(30);
		engineer.setValoreFisso(250);
		engineer.setPercentuale(20);
		
		System.out.println("--------------------");
		System.out.println(engineer.toString());
		System.out.println(engineer.calcolaGuadagno() + " €");
	}
}