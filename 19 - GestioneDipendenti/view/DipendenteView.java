package view;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import model.Dipendente;

public class DipendenteView {

	Dipendente dip;
	Scanner input = new Scanner(System.in);
	String nome, cognome, telefono;
	int choice;
	int temp;
	boolean flag = true;
	
	public Integer mainMenu(int min, int max) {
		
		flag = true;

		System.out.println("------------------------------------");
		System.out.println("* MENU' *");
		System.out.println("1: Inserire nuovo dipendente.");
		System.out.println("2: Modificare un dipendente.");
		System.out.println("3: Eliminare un dipendente.");
		System.out.println("4: Visualizzare un dipendente.");
		System.out.println("5: Visualizzare tutti i dipendenti.");
		System.out.println("6: Salve ed esci.");
		System.out.println("------------------------------------");

		do {
			temp = leggiInputIntero("Inserire un numero da " + (min + 1) + " a " + (max - 1) + ": ");
			if (temp > min & temp < max) {
				flag = false;
			}
		} while (flag);

		return temp;
	}

	public String leggiInputStringa(String msg, int min, int max) {
		
		System.out.println(msg);
		
		flag = true;	
		
		String tempString = null;
		
		do {
			String tempIndex = input.nextLine();
				if(Pattern.matches("[a-zA-Z]{"+min+","+max+"}", tempIndex)){
					tempString = tempIndex;
					flag = false;	
				}else {
					System.out.println("ERRORE: Inserire solo lettere (min " + min + " max " + max + " caratteri)");
				}	
		}while(flag);
		return tempString;
	}
	
	public int leggiInputIntero(String msg) {
		
		flag = true;
		System.out.println(msg);
		
		do {
			String tempIndex = input.nextLine();
			try {
				temp = Integer.parseInt(tempIndex);
				flag = false;
			} catch (Exception e) {
				System.out.println("ERRORE: Inserire solo numeri.");
			}
		} while (flag);
		return temp;
	}
	
	public String numeroTelefono() {
		
		flag = true;	
		String tempString = null;
		
		do {
			String tempIndex = input.nextLine();
				if(Pattern.matches("[0-9]+", tempIndex)){
					tempString = tempIndex;
					flag = false;	
				}else {
					System.out.println("ERRORE: Inserire solo numeri da 0 a 9.");
				}	
		}while(flag);	
		return tempString;
	}
	
	public boolean controlloTelefono(ArrayList<Dipendente> listaDipendenti, String telefono, int indice) {
		
		for(int i = 0; i < listaDipendenti.size(); i++) {
			if(indice == -1 || indice != i) {
				if(listaDipendenti.get(i).getTelefono().equals(telefono)) {
					System.out.println("Il numero già esiste, riprova.");
					return true;
				}
			}
		}
		return false;
	}

	public void messaggio(String msg) {
		System.out.println(msg);
	}

	public Dipendente inserimentoDatiDipendente(ArrayList<Dipendente> listaDipendenti) {
		
		dip = new Dipendente();
		nome = leggiInputStringa("Inserisci nome: ",3,20);
		cognome = leggiInputStringa("Inserisci cognome: ",3,20);
		do {
			System.out.println("Inserisci telefono: ");
			telefono = numeroTelefono();
			flag = true;
			if(controlloTelefono(listaDipendenti, telefono, -1) == false) {
				flag = false;
				dip.setTelefono(telefono);
			}
		}while(flag);

		dip.setNome(nome);
		dip.setCognome(cognome);

		return dip;
	}

	public Integer trovaDipendente() {
		
		do {
			temp = leggiInputIntero("Inserisci l'indice del dipendente: ");
			if (temp < 0 ) {
				System.out.println("Inserire un indice maggiore di 0.");
			} else {
				flag = false;
			}
		} while (flag);
		return temp;
	}

	public Dipendente modificaDatiDipendente(ArrayList<Dipendente> listaDipendenti, Dipendente dip, int indice) {

		dip = new Dipendente();
		nome = leggiInputStringa("Inserisci nome: ",3,20);
		cognome = leggiInputStringa("Inserisci cognome: ",3,20);
		do {
			System.out.println("Inserisci telefono: ");
			telefono = numeroTelefono();
			flag = true;
			if(controlloTelefono(listaDipendenti, telefono, indice) == false) {
				flag = false;
				dip.setTelefono(telefono);
			}
		}while(flag);
		dip.setNome(nome);
		dip.setCognome(cognome);
		return dip;
	}

	public void visualizzaDatiDipendente(Dipendente dip) {
		System.out.println("Nome: " + dip.getNome() 
		+ " | Cognome: " + dip.getCognome()
		+ " | Telefono: " + dip.getTelefono());
			
	}

	public void visualizzaTuttiDatiDipendente(ArrayList<Dipendente> listaDipendenti) {
		System.out.println("- Visualizza tutti i dipendenti -");
		if (listaDipendenti.size() == 0) {
			System.out.println("Lista vuota.");
		} else {
			for (int i = 0; i < listaDipendenti.size(); i++) {
				System.out.println((i+1) + ") "
			+ "Nome: " + listaDipendenti.get(i).getNome()
			+ " | Cognome: " + listaDipendenti.get(i).getCognome()
			+ " | Telefono: " + listaDipendenti.get(i).getTelefono());
			}
		}
	}
}