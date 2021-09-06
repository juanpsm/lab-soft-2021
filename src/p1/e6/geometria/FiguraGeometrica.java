package p1.e6.geometria;

public abstract class FiguraGeometrica {
	public FiguraGeometrica() {
		super();
	}

	private String Color;
	
	abstract void dibujar();
	public abstract Integer area();
	
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
	public static int comparar(FiguraGeometrica a, FiguraGeometrica b) {
	    return a.area().compareTo(b.area());
	}
	
}
