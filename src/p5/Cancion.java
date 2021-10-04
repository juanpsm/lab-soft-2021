package p5;

import java.util.ArrayList;
import java.util.List;

public class Cancion {
	private String name;
	private List<NotasTemporizadas> notas;
	
	public Cancion(String name, ArrayList<NotasTemporizadas> arregloNotas) {
		this.name = name;
		this.notas = arregloNotas;
	}
	
	public String toString() {
		String result = "la cancion '" + this.name + "'\n    Sus notas:\n";
		for (NotasTemporizadas n : this.notas) {
			result += "        " + n.toString() + "\n";
		}
		return result;
	}
}
