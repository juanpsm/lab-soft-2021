package p2.e3;

import java.util.Collection;
import java.util.HashSet;

public class HashSetRemovidos<E> extends HashSetAgregadosAgregation<E> {
	private int cantidadEliminados = 0;
	public HashSetRemovidos() {
		hs = new HashSet<E>();
	}
	public boolean remove(E e) {
		if (hs.remove(e)) {
			cantidadEliminados++;
			System.out.println("remove: (" + e + ")");
			return true;
		}
		return false;
	}
	public boolean removeAll(Collection<? extends E> c) {
		if (hs.removeAll(c)) {
			cantidadEliminados += c.size();
			System.out.println("removeAll: " + c.size() + " (" + c + ")");
			return true;
		}
		return false;
	}
	public int getCantidadEliminados() {
		return cantidadEliminados;
	}
}