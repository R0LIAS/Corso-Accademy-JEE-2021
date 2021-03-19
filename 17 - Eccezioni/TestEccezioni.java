
public class TestEccezioni {

	public static void main(String[] args) {
		
		MiaEccezionePersonalizzata mep = new MiaEccezionePersonalizzata();
		
		int arrayInteri[] = new int [3];
		
		try{
			arrayInteri[0] = 3;
			
			try {
				int risultato = arrayInteri[0] / 0;	
			}catch(Exception e) {
				throw mep;
				//System.out.println("Si è verificato un errore.");
			}finally {
				System.out.println("Terminato primo finally.");
			}
			
			int risultato = arrayInteri[0] / 0;
			System.out.println(risultato);
			
		}catch(NullPointerException npe) {
			System.out.println("Impostare la dimenzione dell'array.");
		}catch(ArithmeticException ad) {
			System.out.println("Divisione per zero.");
			ad.printStackTrace();
		}catch(MiaEccezionePersonalizzata mep1) {
			System.out.println("Ho gestito la mia Eccezione Personalizzata.");
		}catch(Exception e) {
			System.out.println("Errore generico.");
		}finally {
			System.out.println("Terminato secondo finally");
		}
	}
}