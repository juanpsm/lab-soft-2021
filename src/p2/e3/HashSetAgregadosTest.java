package p2.e3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashSetAgregadosTest {
	public static void main(String[] args) {

		Collection<Integer> arreglo = new ArrayList<Integer>();
		arreglo.add(76);
		arreglo.add(2);
		arreglo.add(3);
		
		System.out.print("ArrayList: ");
		System.out.println(arreglo);
		
		HashSetAgregados<Integer> hash = new HashSetAgregados<Integer>();
		
		hash.addAll(arreglo);
		
		System.out.print("HashSetAgregados: ");
		System.out.println(hash);
		
		System.out.print("CantidadAgregados: ");
		System.out.println(hash.getCantidadAgregados());
		
		Collection<String> set = new HashSet<String>();
		set.add("c");
		set.add("a");
		set.add("3");
		
		HashSetAgregados<String> hash1 = new HashSetAgregados<String>();
		
		hash1.addAll(set);
		
		System.out.print("HashSetAgregados: ");
		System.out.println(hash1);
		
		System.out.print("CantidadAgregados: ");
		System.out.println(hash1.getCantidadAgregados());
		
	}
}