package p4.e2;

public class Veterinaria<E> {
	private E animal;
	public void setAnimal(E x) {
		animal = x;
	}
	public E getAnimal() {
		return animal;
	}
}