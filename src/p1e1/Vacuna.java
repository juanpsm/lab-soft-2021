package p1e1;

public class Vacuna {
	public Vacuna(String marca, String paisDeOrigen, String enfermedadPrevenida, int cantidadDeDosis) {
		super();
		this.marca = marca;
		this.paisDeOrigen = paisDeOrigen;
		this.enfermedadPrevenida = enfermedadPrevenida;
		this.cantidadDeDosis = cantidadDeDosis;
	}

	String marca;
	String paisDeOrigen;
	String enfermedadPrevenida;
	int cantidadDeDosis;

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPaisDeOrigen() {
		return paisDeOrigen;
	}
	public void setPaisDeOrigen(String paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen;
	}
	public String getEnfermedadPrevenida() {
		return enfermedadPrevenida;
	}
	public void setEnfermedadPrevenida(String enfermedadPrevenida) {
		this.enfermedadPrevenida = enfermedadPrevenida;
	}
	public int getCantidadDeDosis() {
		return cantidadDeDosis;
	}
	public void setCantidadDeDosis(int cantidadDeDosis) {
		this.cantidadDeDosis = cantidadDeDosis;
	}
	@Override
	public String toString() {

//		StringBuilder builder = new StringBuilder();
//		builder.append("Vacuna [marca=");
//		builder.append(marca);
//		builder.append(", paisDeOrigen=");
//		builder.append(paisDeOrigen);
//		builder.append(", enfermedadPrevenida=");
//		builder.append(enfermedadPrevenida);
//		builder.append(", cantidadDeDosis=");
//		builder.append(cantidadDeDosis);
//		builder.append("]");
//		return builder.toString();
		StringBuffer buffer = new StringBuffer();
		buffer.append("Vacuna [marca=");
		buffer.append(marca);
		buffer.append(", paisDeOrigen=");
		buffer.append(paisDeOrigen);
		buffer.append(", enfermedadPrevenida=");
		buffer.append(enfermedadPrevenida);
		buffer.append(", cantidadDeDosis=");
		buffer.append(cantidadDeDosis);
		buffer.append("]");
		return buffer.toString();
	}
	
}
