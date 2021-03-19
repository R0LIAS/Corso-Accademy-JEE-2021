package arraylist;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> mioArray = new ArrayList<>();
		
		mioArray.add("Aldo"); //Aggiungi elementi in un Array
		mioArray.add("Giovanni");
		mioArray.add("Giacomo");
		
		System.out.println(mioArray.size()); //Visualizza la grandezza dell'Array
		System.out.println(mioArray.get(0));
		
		//Legge tutti gli elementi dell'Array
		for(int i = 0; i < mioArray.size(); i++) {
			System.out.println("Elemento " + i + ": " + mioArray.get(i));
		}
				
		mioArray.set(0, "Hello");
		System.out.println(mioArray.get(0));
		
		mioArray.remove(1); //Rimuovi l'elemento alla posizione 0 dell'Array
		System.out.println(mioArray.size());
		
		mioArray.clear(); //Elimina tutti gli elementi dell'Array
		System.out.println(mioArray.size());
		
		ArrayList<Dipendente> mioArrayDip = new ArrayList<>();
		
		Dipendente d1 = new Dipendente("Mario", "Rossi");
		Dipendente d2 = new Dipendente("Luca", "Verdi");
		
		mioArrayDip.add(d1);
		mioArrayDip.add(d2);
		
		for(int i = 0; i < mioArrayDip.size(); i++) {
			System.out.println("Elemento " + i + ": " + mioArrayDip.get(i));
		}	
	}
}