package p1.e31;

import p1.e1.Vacuna;

public class VacunaSubunidadAntigenica extends Vacuna {
	
	int cantAntigenos;
	String tipoProceso;
	
	public VacunaSubunidadAntigenica(String marca, String paisDeOrigen, String enfermedadPrevenida, int cantidadDeDosis,
			int cantAntigenos, String tipoProceso) {
		super(marca, paisDeOrigen, enfermedadPrevenida, cantidadDeDosis);
		this.cantAntigenos = cantAntigenos;
		this.tipoProceso = tipoProceso;
	}

	public int getCantAntigenos() {
		return cantAntigenos;
	}

	public void setCantAntigenos(int cantAntigenos) {
		this.cantAntigenos = cantAntigenos;
	}

	public String getTipoProceso() {
		return tipoProceso;
	}

	public void setTipoProceso(String tipoProceso) {
		this.tipoProceso = tipoProceso;
	}
}
