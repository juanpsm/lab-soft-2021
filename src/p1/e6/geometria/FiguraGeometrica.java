package p1.e6.geometria;

public abstract class FiguraGeometrica {
	public FiguraGeometrica() {
		super();
	}

	private String Color;
	
	abstract void dibujar();
	abstract int area();
	
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
}
