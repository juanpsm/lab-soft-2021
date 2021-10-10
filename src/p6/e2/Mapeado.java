package p6.e2;

@Archivo(nombre="AchivoMapeado.txt")
public class Mapeado {
	@AlmacenarAtributo
	private String valor = "Default1";
	@AlmacenarAtributo
	private Integer valor2=20;
	@AlmacenarAtributo
	private Float valor3=30.20f;
	private Float valor4=30.20f;
	//Metodos getters y setters
	public String getValor() {
		return valor;
	}
	public Integer getValor2() {
		return valor2;
	}
	public Float getValor3() {
		return valor3;
	}
	public Float getValor4() {
		return valor4;
	}
	
	
}
