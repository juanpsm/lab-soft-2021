package parcial0;

public class Transmision {
	private String name;
	private Videojuego videojuego;
	private String idioma;
	private String acceso; // gratuito | pago
	private int cantidadEspectadores;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Videojuego getVideojuego() {
		return videojuego;
	}

	public void setVideojuego(Videojuego videojuego) {
		this.videojuego = videojuego;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getAcceso() {
		return acceso;
	}

	public void setAcceso(String acceso) {
		this.acceso = acceso;
	}

	public int getCantidadEspectadores() {
		return cantidadEspectadores;
	}

	public void setCantidadEspectadores(int cantidadEspectadores) {
		this.cantidadEspectadores = cantidadEspectadores;
	}
}
