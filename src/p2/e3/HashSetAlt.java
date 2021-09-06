package p2.e3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class HashSetAlt<E> implements Set<E> {
	private int cantidadAgregados = 0;
	public HashSetAlt() {
	}

	@Override public boolean add(E e) {
		cantidadAgregados++;
		System.out.println("add: 1");
		return super.add(e);
	}
	@Override public boolean addAll(Collection<? extends E> c) {
		cantidadAgregados += c.size();
		System.out.print("addAll: ");
		System.out.println(c.size());
		return super.addAll(c);
	}
	public int getCantidadAgregados() {
		return cantidadAgregados;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
}
