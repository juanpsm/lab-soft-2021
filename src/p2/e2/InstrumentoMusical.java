package p2.e2;

public interface InstrumentoMusical {
	void hacerSonar();
	String queEs();
	void afinar(){}
}

class abstract InstrumentoDeViento implements InstrumentoMusical {
	void hacerSonar(){
		System.out.println("Sonar Vientos");
	}
	public String queEs() {
		return "Instrumento de Viento";
	}
}

class InstrumentoDeCuerda implements InstrumentoMusical {
	void hacerSonar(){
		System.out.println("Sonar Cuerdas");
	}
	public String queEs() {
		return "Instrumento de Cuerda";
	}
}
