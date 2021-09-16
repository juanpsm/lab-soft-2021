package p2.e3;

import java.util.Collection;
import java.util.HashSet;

public class HashSetRemovidos<E> extends HashSet<E> {
	private int cantidadEliminados = 0;
	public HashSetRemovidos() {
	}
	public HashSetRemovidos(int initCap, float loadFactor) {
		super(initCap, loadFactor);
	}
	@Override public boolean remove(E e) {
		cantidadEliminados++;
		System.out.println("add: 1");
		return super.remove(e);
	}
	@Override public boolean removeAll(Collection<? extends E> c) {
		cantidadEliminados += c.size();
		System.out.print("addAll: ");
		System.out.println(c.size());
		return super.removeAll(c);
	}
	public int getCantidadEliminados() {
		return cantidadEliminados;
	}
}