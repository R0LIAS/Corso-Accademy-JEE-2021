package controller;

import java.util.ArrayList;

import model.CRUDDipendente;
import model.Dipendente;
import view.DipendenteView;

public class TestDipendente {

	public static void main(String[] args) {

		DipendenteView dipendenteView = new DipendenteView();
		CRUDDipendente crudd = new CRUDDipendente();
		Dipendente dip;
		int indice;
		boolean flag = true;
		ArrayList<Dipendente> dipe;
		
		crudd.carica();

		do {
			switch (dipendenteView.mainMenu(0, 7)) {
			case 1:
				dip = new Dipendente();
				dipe = crudd.visualizzaTuttiDatiCRUDDipendente();
				dip = dipendenteView.inserimentoDatiDipendente(dipe);
				if (dipendenteView.leggiInputStringa("Sei sicuro di voler continuare? (s/n)",1,1).equalsIgnoreCase("s")) {
					crudd.inserimentoDatiCRUDDip(dip);
				} else {
					dipendenteView.messaggio("Operazione annullata");
				}
				break;
			case 2:
				dip = new Dipendente();
				dipe = crudd.visualizzaTuttiDatiCRUDDipendente();
				indice = dipendenteView.trovaDipendente();
				dip = crudd.leggiDatiCRUDDip(indice - 1);
				if (dip != null) {
					dip = dipendenteView.modificaDatiDipendente(dipe, dip, indice - 1);
					if (dipendenteView.leggiInputStringa("Sei sicuro di voler continuare? (s/n)",1,1).equalsIgnoreCase("s")) {
						crudd.modificaDatiCRUDDip(dip, indice - 1);
					} else {
						dipendenteView.messaggio("ERRORE: Operazione annullata!");
					}
				}
				break;
			case 3:
				dip = new Dipendente();
				indice = dipendenteView.trovaDipendente();
				dip = crudd.leggiDatiCRUDDip(indice - 1);
				if (dip != null) {
					dipendenteView.visualizzaDatiDipendente(dip);
					if (dipendenteView.leggiInputStringa("Sei sicuro di voler continuare? (s/n)",1,1).equalsIgnoreCase("s")) {
						crudd.eliminaDatiCRUDDip(indice - 1);
					} else {
						dipendenteView.messaggio("ERRORE: Operazione annullata!");
					}
				}
				break;
			case 4:
				dip = new Dipendente();
				indice = dipendenteView.trovaDipendente();
				dip = crudd.leggiDatiCRUDDip(indice - 1);
				if (dip != null) {
					dipendenteView.visualizzaDatiDipendente(dip);
				} else {
					dipendenteView.messaggio("ERRORE: Operazione annullata!");
				}
				break;
			case 5:
				dipendenteView.visualizzaTuttiDatiDipendente(crudd.visualizzaTuttiDatiCRUDDipendente());
				break;
			case 6:
				crudd.salva();
				System.out.println("Arrivederci.");
				flag = false;
				break;
			default:
				System.out.println("ERRORE: Inserire un numero da 1 a 6!");
			}
		} while (flag);
	}
}