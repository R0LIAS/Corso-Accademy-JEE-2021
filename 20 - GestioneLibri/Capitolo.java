package model;

public class Capitolo {
	
	private String titolo;
	private String contenuto;
	
	public Capitolo() {
		
	}
	
	public Capitolo(String t, String c) {
		this.setContenuto(c);
		this.setTitolo(t);
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getContenuto() {
		return contenuto;
	}

	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}
}