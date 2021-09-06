package p1.e2.e.griego;

public class Alpha {
	private int x;
	// Si bien Delta esta en la jerarquía y puede acceder al metodo,
	// también se intancia la var a que es directamente clase ALpha
	// y para usar el metodo otroMetodoA desde unMetodoD se necesita
	// que este metodo sea publico.
	// protected void otroMetodoA(){
	public void otroMetodoA(){
		System.out.println("Un método protegido");
	}
	
	// Agrego setter y getter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
}