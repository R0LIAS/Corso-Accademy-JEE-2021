package sommaparidispari;

public class SommaPariDispari {

	public static void main(String[] args) {
		
		int[] valori = {4, 2, 9, 3, 8, 12, 5, 8};
		
		System.out.println("Questo array contiene: " + valori.length + " elementi");
		
		int sommaPari = 0;
		
		int sommaDispari = 0;

		for(int i = 0; i < valori.length - 1; i += 2) {
			
			sommaPari = sommaPari + valori[i]; //4, 9, 8, 5 = 26
			
			sommaDispari = sommaDispari + valori[i + 1]; //2, 3, 12, 8 = 25
			
		}
		
		System.out.println("Somma Pari: " + sommaPari);
		System.out.println("Somma Dispari: " + sommaDispari);
		
		int risultato = sommaPari + sommaDispari;
		System.out.println("Somma totale: " + risultato); // 51
		
		if(sommaPari == sommaDispari) {
			
			System.out.println("Pari e Dispari sono uguali");
			
		}else {
			
			System.out.println("Pari e Dispari non sono uguali");
			
		}
	}
}
