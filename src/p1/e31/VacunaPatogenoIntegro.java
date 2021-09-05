package p1.e31;

import p1.e1.Vacuna;

public class VacunaPatogenoIntegro extends Vacuna {
	
	private String nombreVirusAtenuado;
	
	public VacunaPatogenoIntegro(String marca, String paisDeOrigen, String enfermedadPrevenida, int cantidadDeDosis,
			String nombreVirusAtenuado) {
		super(marca, paisDeOrigen, enfermedadPrevenida, cantidadDeDosis);
		this.nombreVirusAtenuado = nombreVirusAtenuado;
	}

	public String getNombreVirusAtenuado() {
		return nombreVirusAtenuado;
	}

	public void setNombreVirusAtenuado(String nombreVirusAtenuado) {
		this.nombreVirusAtenuado = nombreVirusAtenuado;
	}

	

}
