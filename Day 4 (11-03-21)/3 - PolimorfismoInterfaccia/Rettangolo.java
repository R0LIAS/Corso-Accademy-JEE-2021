package figuregeometriche;

public class Rettangolo implements FigureGeometriche2D {
	
	private double base, altezza;
	private Point2D[] punto = new Point2D[4];

	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public Rettangolo(double base, double altezza, Point2D puntiXY) {
		this.base = base;
		this.altezza = altezza;
		punto[0] = puntiXY;
		punto[1] = new Point2D(punto[0].getX() + base, punto[0].getY());
		punto[2] = new Point2D(punto[0].getX() + base, punto[0].getY() + altezza);
		punto[3] = new Point2D(punto[0].getX(), punto[0].getY() + altezza);
	}
	
	@Override
	public double calcolaPerimetro() {
		return 2 * (altezza + base);
	}
	
	@Override
	public double calcolaArea() {
		return base * altezza;
	}

	@Override
	public void draw() {
		System.out.println("* Rettangolo *");
		System.out.println("Punto A - X: " + punto[0].getX() + " - Punto A - Y: " + punto[0].getY());
		System.out.println("Punto B - X: " + punto[1].getX() + " - Punto B - Y: " + punto[1].getY());
		System.out.println("Punto C - X: " + punto[2].getX() + " - Punto C - Y: " + punto[2].getY());
		System.out.println("Punto D - X: " + punto[3].getX() + " - Punto D - Y: " + punto[3].getY());		
	}
}