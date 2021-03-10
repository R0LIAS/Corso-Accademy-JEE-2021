package pagellascolastica;

public class Voto {
	
	private String materia;
	private int voto;
	private String giudizio;
	
	public Voto(String materia, int voto, String giudizio) {
		this.materia = materia;
		this.voto = voto;
		this.giudizio = giudizio;
	}

	@Override
	public String toString() {
		return "Materia: " + materia + "\n" + "Voto: " + voto + "\n" + "Giudizio: " + giudizio + "\n--------------------";
	}
}