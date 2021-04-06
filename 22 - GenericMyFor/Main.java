package myFor;

public class Main {

	public static void main(String[] args) {
		
		for(Integer i: new MyFor(0, 10, 2)) {
			System.out.println("Ciclo MyFor: " + i);
		}
		
		for(int i = 0; i < 10; i += 2) {
			System.out.println("Ciclo for: " + i);
		}
		
	}
}