package p5;

public enum Musicos {
	FLACO("Luis Alberto Spinetta", new Guitarra() );
	// private String nombreCompleto;
	private String name;
	private InstrumentoMusical instrument;

	private Musicos(String n, InstrumentoMusical i) {
		this.name = n;
		this.instrument = i;
	}

	public String toString() { 
		return this.name() + ": " + this.name + " toca " + this.instrument.queEs() + ".";
	}
	
	public String tocar(Cancion cancion) {
		return this.name() + ": " + this.name + " toca " + cancion.toString();
	}
	
	public void cambiarInstrumento (InstrumentoMusical i) {
		this.instrument = i;
	}
}