package model;

import java.util.ArrayList;

public class Book implements Comparable<Book>, Cloneable {
	
	private String titolo;
	private ArrayList<Capitolo> capitoli = new ArrayList<>();
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public void addCapitolo(Capitolo cap) {
		this.capitoli.add(cap);
	}
	
	public void addCapitoloAttributo(String titolo, String contenuto) {
		this.capitoli.add(new Capitolo(titolo, contenuto));
	}
	
	public int getNumCapitoli() {
		return this.capitoli.size();
	}

	public String getTitoloCapitolo(int x) {
		
		String titolo = null;
		
		try {
			titolo = this.capitoli.get(x-1).getTitolo();	
		}catch(Exception e){
			titolo = "Capitolo " + x + " non trovato.";
		}
		return titolo;		
	}
	
	public String getContenutoCapitolo(int x) {
		
		String titolo = null;
		
		try {
			titolo = this.capitoli.get(x-1).getContenuto();	
		}catch(Exception e){
			titolo = "Contenuto del capitolo " + x + " non trovato.";
		}
		return titolo;	
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	@Override
	public int compareTo(Book o) {
		return this.getNumCapitoli() - o.getNumCapitoli();
	}
}