package p2.e2;

import p1.e6.geometria.FiguraGeometrica;
import p1.e6.geometria.Paint;
import p1.e6.geometria.Circulo;
import java.util.Arrays;

public class PaintTest {
	public static void main(String[] args) {
		Paint paint = new Paint();
		paint.init();
		
		FiguraGeometrica[] arreglo = paint.getPaleta();
		
		// ordenar arreglo
		Arrays.sort(arreglo, FiguraGeometrica::comparar);
		
		System.out.println("Figuras en el arreglo:");
		for (int i=0;i<arreglo.length;i++) {
			System.out.print(" - Figura con area ");
			System.out.print(arreglo[i].area());
			if (arreglo[i] instanceof Circulo) {
			    System.out.print(" approx. Su radio es ");
				System.out.print(((Circulo) arreglo[i]).getRadio());
			}
			System.out.println(".");
		}
	}
}
