package p1.e6.geometria;

public class PaintTest {
	public static void main(String[] args) {
		Paint paint = new Paint();
		paint.init();
		
		FiguraGeometrica[] arreglo = paint.getPaleta();
		
		
		// Correccion:
		// Se podría haber usado "arreglo[i] instanceof Circulo" para detectar una instancia de Circulo
		
		// Circulo testCirculo = new Circulo();
		
		System.out.println("Figuras en el arreglo:");
		for (int i=0;i<arreglo.length;i++) {
			// arreglo[i].dibujar();
			System.out.print(" - Figura con area ");
			System.out.print(arreglo[i].area());
			// if (arreglo[i].getClass().equals(testCirculo.getClass()) ) {
			if (arreglo[i] instanceof Circulo) {
			    System.out.print(" approx. Su radio es ");
				System.out.print(((Circulo) arreglo[i]).getRadio());
			}
			System.out.println(".");
		}
	}
}
