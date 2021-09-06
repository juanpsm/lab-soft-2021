package p1.e6.geometria;

public class Rectangulo extends FiguraGeometrica {
	public Rectangulo(int alto, int ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}
	public Rectangulo() {
		super();
	}
	int alto;
	int ancho;

	@Override
	public void dibujar() {
		System.out.println("se dibuja un rectángulo de alto "+alto+", ancho "+ancho+" y color "+ this.getColor());
		
	}
	@Override
	public Integer area() {
		return this.alto * this.ancho;
	}

}
