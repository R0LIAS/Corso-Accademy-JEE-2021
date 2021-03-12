package figuregeometriche;

public class Test {

	public static void main(String[] args) {
		
		FigureGeometriche2D rettangolo = new Rettangolo(5, 10, new Point2D(20,50));
		FigureGeometriche2D quadrato = new Quadrato(4, new Point2D(10,30));
		
		rettangolo.draw();
		System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
		System.out.println("Area: " + rettangolo.calcolaArea());
		
		System.out.println("--------------------");
		quadrato.draw();
		System.out.println("Perimetro: " + quadrato.calcolaPerimetro());
		System.out.println("Area: " + quadrato.calcolaArea());
	}
}