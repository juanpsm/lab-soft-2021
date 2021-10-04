package p5;

public class TestGuitarra {

	public static void main(String[] args) {
		Guitarra g = new Guitarra();
		// InstrumentoMusical flauta = new InstrumentoDeViento();
		
		g.afinar();
		g.hacerSonar();
		
		g.afinar(FrecuenciasDeLA.ISO);
		g.hacerSonar(Notas.SOL, 7);
	}
}
