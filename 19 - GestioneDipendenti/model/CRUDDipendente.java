package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class CRUDDipendente {

	ArrayList<Dipendente> listaDipendenti = new ArrayList<>();

	public boolean inserimentoDatiCRUDDip(Dipendente dip) {
		if (dip != null) {
			listaDipendenti.add(dip);
			return true;
		} 
		System.out.println("Indice non trovato!");
		return false;
	}

	public boolean modificaDatiCRUDDip(Dipendente dip, int indice) {
		if (dip != null && indice >= 0) {
			listaDipendenti.set(indice, dip);
			return true;
		}
		System.out.println("Indice non trovato!");
		return false;
	}

	public boolean eliminaDatiCRUDDip(int indice) {
		if (indice >= 0 && indice < listaDipendenti.size()) {
			listaDipendenti.remove(indice);
			return true;
		}
		System.out.println("Indice non trovato!");
		return false;
	}
	
	public Dipendente leggiDatiCRUDDip(int indice) {
		if(indice >= 0 && indice < listaDipendenti.size()) {
			return listaDipendenti.get(indice);
		}
		System.out.println("Indice non trovato!");
		return null;
	}

	public ArrayList<Dipendente> visualizzaTuttiDatiCRUDDipendente() {
		return listaDipendenti;
	}
	
	public boolean carica() {
		//Utilizzo le classi  BufferedReader e FileReader per leggere il contenuto di un file da disco
		//Creare la cartella ..\dati
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Corsi\\Accademy JEE (2021)\\Esercizi\\19 - GestioneDipendenti\\dipendenti.txt"))) {
			String linea = bufferedReader.readLine();
			while (linea != null) {
				String[] attributi = linea.split(",");
				if (attributi.length == 3) {
					Dipendente d = new Dipendente();
					d.setNome(attributi[0]);
					d.setCognome(attributi[1]);
					d.setTelefono(attributi[2]);
					listaDipendenti.add(d);
				}
				linea = bufferedReader.readLine();
			}
			System.out.println("File caricato!");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean salva() {
		//Utilizzo la classe FileWriter per salvare i dati in un file su disco
		// Creare la cartella ..\dati
		try(FileWriter fileWriter = new FileWriter("D:\\Corsi\\Accademy JEE (2021)\\Esercizi\\19 - GestioneDipendenti\\dipendenti.txt")) {
		
			for(int i = 0; i < listaDipendenti.size(); i++) {
				fileWriter.write(listaDipendenti.get(i).toString()+"\n");
			}
			System.out.println("File salvato!");
		} catch (IOException e) {
			return false;
		}
		return true;
	}
}