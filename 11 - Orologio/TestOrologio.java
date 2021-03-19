package orologio;

public class TestOrologio {

	public static void main(String[] args) throws InterruptedException {
		
		Orologio orologio = new Orologio(23, 59, 50);	
		
		for(int i = 0; i < 10; i++) {
			orologio.incrementaSecondi();
			System.out.println(orologio.stampaOra());
		}
		
		OrologioCucu orologioCucu = new OrologioCucu(17, 59, 50);
		
		for(int i = 0; i < 10; i++) {
			orologioCucu.incrementaSecondi();
			System.out.println(orologioCucu.stampaOra());
		}
		
//		while(true) {
//			Thread.sleep(1000);
//			orologio.incrementaSecondi();
//			System.out.println(orologio.stampaOra());
//		}
	}
}