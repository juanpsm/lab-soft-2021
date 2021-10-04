package p5;

public enum FrecuenciasDeLA {
	ISO("Organización Internacional de Estandarización ISO 16", 440),
	CAM("Afinación de cámara", 444),
	REN("Renacimiento", 446),
	BACH("Órganos alemanes que tocaba Bach", 480);
	private String description;
	private int frecuency;

	FrecuenciasDeLA(String d, int f) {
		this.description = d;
		this.frecuency = f;
	}
public String toString() { return this.frecuency + " Hz: " + this.description + "."; }
}
