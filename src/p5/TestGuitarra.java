package p5;

public class TestGuitarra {

	public static void main(String[] args) {
		Guitarra g = new Guitarra();
		
		g.afinar();
		g.hacerSonar();
		
		g.afinar(FrecuenciasDeLA.ISO);
		g.hacerSonar(Notas.SOL, 7);
		
		// las notas no se pueden instanciar por mas que no se indique
		// la visivilidad del constructor, siempre es private
		// Notas solsost = new Notas("G#");
	}
}
