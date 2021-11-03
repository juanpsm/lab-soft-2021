package p2.e3;

import java.util.Collection;
import java.util.HashSet;

public class HashSetAgregados<E> extends HashSet<E> {
	private int cantidadAgregados = 0;
	public HashSetAgregados() {
	}
	@Override public boolean add(E e) {
		cantidadAgregados++;
		System.out.println("add: (" + e + ")");
		return super.add(e);
	}
	@Override public boolean addAll(Collection<? extends E> c) {
		cantidadAgregados += c.size();
		System.out.println("addAll: " + c.size() + " (" + c + ")");
		return super.addAll(c);
	}
	public int getCantidadAgregados() {
		return cantidadAgregados;
	}
}
