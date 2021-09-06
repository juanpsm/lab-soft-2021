package p1.e2.c.griego;

public class Alpha {
	private int x;
	
	// poner el metodo public, esta en otro paquete y fuera de la herencia Beta
	// void unMetodoA(){
	public void unMetodoA(){
		System.out.println("Un mét. paquete");
	}
	
	// Agregar getter y seter para acceder desde la otra clase
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
}