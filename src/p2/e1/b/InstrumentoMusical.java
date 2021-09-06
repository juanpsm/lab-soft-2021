package p2.e1.b;

public interface InstrumentoMusical {
	void hacerSonar();
	String queEs();
	// Para que no pida agregar metodos no implementados en las clases
	// se le pone default
	default void afinar(){}
}

abstract class InstrumentoDeViento implements InstrumentoMusical {
	// en las interfaces los metodos son public por defecto, entonces
	// aca en la clase no puedo reducir la visibilidad,
	// por eso hay que ponerle public por lo menos.
	// Se podŕia modicifar la interfaz, pero esta adminte solamente
	// public y private, public ya es y private no me sirve
	public void hacerSonar(){
		System.out.println("Sonar Vientos");
	}
	public String queEs() {
		return "Instrumento de Viento";
	}
}

class InstrumentoDeCuerda implements InstrumentoMusical {
	public void hacerSonar(){
		System.out.println("Sonar Cuerdas");
	}
	public String queEs() {
		return "Instrumento de Cuerda";
	}
}
