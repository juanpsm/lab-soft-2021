package p1.e6.geometria;

public class Circulo extends FiguraGeometrica {

	public Circulo(int radio) {
		super();
		this.setRadio(radio);
	}

	public Circulo() {
		super();
	}
	
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	private int radio;

	@Override
	public void dibujar() {
		System.out.println("se dibuja un circulo de radio "+radio+" y color "+ this.getColor());
		
	}

	@Override
	public int area() {
		return (int) (Math.PI * (this.radio * this.radio));
	}
}
