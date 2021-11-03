package p2.e3;

import java.util.Collection;
import java.util.HashSet;

public class HashSetAgregadosAgregation<E>{
	private int cantidadAgregados = 0;
	protected HashSet<E> hs;
	public HashSetAgregadosAgregation() {
		hs = new HashSet<E>();
	}
	
	public boolean add(E e) {
		cantidadAgregados++;
		System.out.println("add: (" + e + ")");
		return hs.add(e);
	}
	public boolean addAll(Collection<? extends E> c) {
		cantidadAgregados += c.size();
		System.out.println("addAll: " + c.size() + " (" + c + ")");
		return hs.addAll(c);
	}
	public int getCantidadAgregados() {
		return cantidadAgregados;
	}
	public HashSet<E> getHs() {
		return hs;
	}
	@Override public String toString() {
		return hs.toString();
	}
}
