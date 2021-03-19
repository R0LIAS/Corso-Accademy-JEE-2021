package pagellascolastica;

public class Studente {
	
	private String nome;
	private String cognome;
	private String classe;
	private Voto[] listaVoti;
	
	public Studente(String nome, String cognome, String classe, Voto[] voto) {
		this.nome = nome;
		this.cognome = cognome;
		this.classe = classe;
		this.listaVoti = voto;
	}

	public Voto[] getListaVoti() {
		return listaVoti;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\n" + "Cognome: " + cognome + "\n" + "Classe: " + classe;
	}
}