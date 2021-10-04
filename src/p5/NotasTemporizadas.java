package p5;

public class NotasTemporizadas {
	private Notas nota;
	private double duracion;
	
	public NotasTemporizadas(Notas nota, double duracion) {
		this.nota = nota;
		this.duracion = duracion;
	}
	public String toString() {
		return this.nota.toString() + " por " + this.duracion + " segundos";
	}
}
