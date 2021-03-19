package figure;

public class TestQuadrato {
	
	public static void main (String[] args) {
		
		Quadrato quadrato = new Quadrato();
		
		quadrato.lato = 20;
			
		System.out.println("Risutlato perimetro: " + quadrato.perimetro()); //80
		
		System.out.println("Risutlato area: " + quadrato.area()); //400
	}
}