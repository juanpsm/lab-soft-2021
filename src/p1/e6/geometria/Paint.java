package p1.e6.geometria;

public class Paint {
	public Paint() {
		super();
		this.paleta = new FiguraGeometrica [5];
	}

	private FiguraGeometrica[] paleta;

	public FiguraGeometrica[] getPaleta() {
		return paleta;
	}

	public void setPaleta(FiguraGeometrica[] paleta) {
		this.paleta = paleta;
	}
	
	public void init() {
		paleta[0] = new Circulo(2);
		paleta[0].setColor("azul");
		paleta[1] = new Circulo(3);
		paleta[1].setColor("amarillo");
		paleta[2] = new Rectangulo(2,3);
		paleta[2].setColor("verde");
		paleta[3] = new Rectangulo(4,10);
		paleta[3].setColor("rojo");
		// El enunciado pedía definir 3 objetos rectángulo
		// pero daba los atributos de 2, así que este último
		// lo invento yo.
		paleta[4] = new Rectangulo(27,15);
		paleta[4].setColor("índigo");
	}
}
