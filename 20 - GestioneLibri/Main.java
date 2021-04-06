package model;

public class Main {

	public static void main(String[] args) {

		Book libroA = new Book();
		
		libroA.addCapitoloAttributo("Introduzione", "Intro");
		libroA.addCapitoloAttributo("Tipi dati primitivi e non", "I tipi primitivi...");
		libroA.addCapitoloAttributo("Generics type", "I tipi generici...");
		
		Capitolo capitolo = new Capitolo();
		capitolo.setTitolo("Iterazioni e condizioni");
		capitolo.setContenuto("Le iterazioni sono for, while, do-while e foreach, le condizioni sono le if.");	
		libroA.addCapitolo(capitolo);
		
		for(int i = 1; i <= libroA.getNumCapitoli(); i++) {
			System.out.println("Capitolo "+ i +  ". " + libroA.getTitoloCapitolo(i));
			System.out.println(libroA.getContenutoCapitolo(i)+"\n");
		}
		
		Book libroB = new Book();
		
		libroB.addCapitoloAttributo("A", "B");
		libroB.addCapitoloAttributo("C", "D");
		libroB.addCapitoloAttributo("E", "F");
		//libroB.addCapitoloAttributo("G", "H");
		
		//confronta il numero di capitolo del libroA con il libroB. = 0
		System.out.println(libroA.compareTo(libroB)+"\n");
		
		//Copia il titolo del libroA in libroCopia con clone()
		try {
			Book libroCopia = (Book)libroA.clone();
			System.out.println(libroCopia.getTitoloCapitolo(1));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}