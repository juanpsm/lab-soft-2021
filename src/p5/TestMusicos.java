package p5;

import java.util.ArrayList;

public class TestMusicos {

	public static void main(String[] args) {
		System.out.println(Musicos.FLACO);
		
		ArrayList<NotasTemporizadas> arregloNotas = new ArrayList<NotasTemporizadas>();
		arregloNotas.add(new NotasTemporizadas(Notas.SI, 5));
		arregloNotas.add(new NotasTemporizadas(Notas.MI, 10));
		arregloNotas.add(new NotasTemporizadas(Notas.FA, 12.5));
		arregloNotas.add(new NotasTemporizadas(Notas.DO, 6));
		Cancion color_humano = new Cancion("Color humano", arregloNotas);
		System.out.println(Musicos.FLACO.tocar(color_humano));
//		Musicos s = new Musicos(); // no se puede instanciar este strictfpo
		
	}
}
