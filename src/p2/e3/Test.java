package p2.e3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("------------ HashA - Herencia ------------");
		HashSetAgregados<Integer> hashA = new HashSetAgregados<Integer>();
		
		hashA.add(76);
		hashA.add(1);
		
		System.out.println("HashA: " + hashA);
		
		Collection<Integer> arreglo = new ArrayList<Integer>();
		arreglo.add(76);
		arreglo.add(2);
		arreglo.add(3);
		
		System.out.println("\nArrayList: " + arreglo);
		
		hashA.addAll(arreglo);
		
		System.out.println("HashA: " + hashA);
		System.out.println("CantidadAgregados: " + hashA.getCantidadAgregados());
		
//		Collection<String> set = new HashSet<String>();
//		set.add("c");
//		set.add("a");
//		set.add("3");
//		
//		System.out.println("\nSet: " + set);
//        // No se puede porque no extiende Integer
//		hashA.addAll(set);
		
		System.out.println("HashA: " + hashA);
		System.out.println("CantidadAgregados: " + hashA.getCantidadAgregados());
		
		System.out.println("\n------------ HashB - Agregation ------------");
		HashSetAgregadosAgregation<Integer> hashB = new HashSetAgregadosAgregation<Integer>();
		
		hashB.add(76);
		hashB.add(1);
		
		System.out.println("HashB: " + hashB);
		
		System.out.println("ArrayList: " + arreglo);
		
		hashB.addAll(arreglo);
		
		System.out.println("HashB: " + hashB);
		System.out.println("CantidadAgregados: " + hashB.getCantidadAgregados());
		
		System.out.println("\nhashA.equals(hashB): " + hashA.equals(hashB));
		System.out.println("hashA==hashB: " + (hashA==hashB.getHs()));
		
		System.out.println("\n------------ HashC - Removidos ------------");
		HashSetRemovidos<Integer> hashC = new HashSetRemovidos<Integer>();
		
		hashC.add(76);
		hashC.add(1);
		hashC.addAll(arreglo);
		System.out.println("HashC: " + hashC);
		
		hashC.remove(76);
		hashC.remove(1);
		
		System.out.println("HashC: " + hashC);
		
		hashC.removeAll(arreglo);
		
		System.out.println("HashC: " + hashC);
		System.out.println("CantidadAgregados: " + hashC.getCantidadAgregados());
		System.out.println("CantidadEliminados: " + hashC.getCantidadEliminados());
		
		System.out.println("Eliminar 3: " + hashC.remove(3));
		System.out.println("CantidadEliminados: " + hashC.getCantidadEliminados());
	}
}