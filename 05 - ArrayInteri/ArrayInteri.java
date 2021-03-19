
public class ArrayInteri {

	public static void main(String[] args) {
		
		int array1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int array2[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		System.out.println("Primo Array[array1]:");
		cicloFor(array1);
		
		System.out.println("\n" + "Secondo Array[array2]:");
		cicloFor(array2);
		
		//In questa maniera verrà modificato l'intero array
		System.out.println("\n" + "Incremento di 1 il secondo Array[array2]:");
		cicloForIncrementato(array2);
		
		//Infatti la modifica rimane
		System.out.println("\n" + "Secondo Array[array2]:");
		cicloFor(array2);

	}
	
	public static void cicloFor(int[] array) {
		for(int i = 0; i < array.length; i = i + 1) {
			
			int risultato = array[i];
			
			System.out.println("Il numero in posizione [" + i + "] = " + risultato);
		}
	}
	
	public static void cicloForIncrementato(int[] array) {
		for(int i = 0; i < array.length; i = i + 1) {
			
			array[i] = array[i] + 1;
			
			int risultato = array[i];
			
			System.out.println("Il numero in posizione [" + i + "] = " + risultato);
		}
	}
}
