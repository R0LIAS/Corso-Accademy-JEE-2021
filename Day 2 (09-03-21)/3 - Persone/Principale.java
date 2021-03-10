package persone;

public class Principale {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Mario", "Bianchi", 20);
		Persona p2 = new Persona("Giovanni", "Rossi", 25);
		
		Persona p3;
		
		p3 = p1;
		
		System.out.println("La persona in p1 è: " + "\n" + p1);
		System.out.println("La persona in p2 è: " + "\n" + p2);
		
		System.out.println("La persona in p1 aggiunta in p3 è: " + "\n" + p3);
	}
}