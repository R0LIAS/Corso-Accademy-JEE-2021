package figuregeometriche;

public class Quadrato implements FigureGeometriche2D{

	private double lato;
	private Point2D[] punto = new Point2D[4];

	public Quadrato(double lato) {
		this.lato = lato;
	}
	
	public Quadrato(double lato, Point2D puntiXY) {
		this.lato = lato;
		punto[0] = puntiXY;
		punto[1] = new Point2D(punto[0].getX() + lato, punto[0].getY());
		punto[2] = new Point2D(punto[0].getX() + lato, punto[0].getY() + lato);
		punto[3] = new Point2D(punto[0].getX(), punto[0].getY() + lato);
	}

	@Override
	public double calcolaPerimetro() {
		return 4 * lato;
	}
	
	@Override
	public double calcolaArea() {
		return lato * lato;
	}

	@Override
	public void draw() {
		System.out.println("* Quadrato *");
		System.out.println("Punto A - X: " + punto[0].getX() + " - Punto A - Y: " + punto[0].getY());
		System.out.println("Punto B - X: " + punto[1].getX() + " - Punto B - Y: " + punto[1].getY());
		System.out.println("Punto C - X: " + punto[2].getX() + " - Punto C - Y: " + punto[2].getY());
		System.out.println("Punto D - X: " + punto[3].getX() + " - Punto D - Y: " + punto[3].getY());	
	}
}