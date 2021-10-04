package parcial0;

public class Videojuego {
	private String name;
	private String genero; // rts | fps | mmobg
	private String plataforma; // win | osx | linux

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
}
