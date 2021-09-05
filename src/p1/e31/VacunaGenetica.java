package p1.e31;

import p1.e1.Vacuna;

public class VacunaGenetica extends Vacuna {
	
	private int tempMinAlmac;
	private int tempMaxAlmac;
	
	public VacunaGenetica(String marca, String paisDeOrigen, String enfermedadPrevenida, int cantidadDeDosis,
			int tempMinAlmac, int tempMaxAlmac) {
		super(marca, paisDeOrigen, enfermedadPrevenida, cantidadDeDosis);
		this.tempMinAlmac = tempMinAlmac;
		this.tempMaxAlmac = tempMaxAlmac;
	}
	
	public int getTempMinAlmac() {
		return tempMinAlmac;
	}
	public void setTempMinAlmac(int tempMinAlmac) {
		this.tempMinAlmac = tempMinAlmac;
	}
	public int getTempMaxAlmac() {
		return tempMaxAlmac;
	}
	public void setTempMaxAlmac(int tempMaxAlmac) {
		this.tempMaxAlmac = tempMaxAlmac;
	}

}
