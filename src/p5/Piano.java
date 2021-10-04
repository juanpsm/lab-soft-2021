package p5;

public class Piano implements InstrumentoMusical {
	// Esta clase la hacemos rapidamente para probar,
	// es muy parecida a guitarra, por lo que sería mas
	// correcto hacer una superclase y que esta clase y
	// Guitarra hereden de ella.
	public void hacerSonar(){
		System.out.println("Suena  " + queEs());
	}
	public String queEs() {
		return "el piano";
	}
	@Override
	public void hacerSonar(Notas n, int duracion) {
		this.hacerSonar();
		System.out.println(" - suena la nota " + n.name() + " durante " + duracion + " segundos");
	}
	@Override
	public void afinar(FrecuenciasDeLA f) {
		System.out.println("Se afina con " + f);
	}
}