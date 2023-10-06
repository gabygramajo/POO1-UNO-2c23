package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Listas {
	
	public List<Integer> dosListasOrdenadasEnUna(List<Integer> L1, List<Integer> L2) {
		List<Integer> aux = new ArrayList<Integer>();
		
		for (Integer i : L1) {
			aux.add(i);
		}
		
		for (Integer i : L2) {
			aux.add(i);
		}
		
		Collections.sort(aux);
		
		return aux;
	}
	
	//Ej 3
	public List<Integer> eliminarDuplicados(List<Integer> l) {
		
		List<Integer> aux = new ArrayList<Integer>();
		
		for (Integer i : l) {
			if(!aux.contains(i))
				aux.add(i);
		}	
		return aux;
	}
	//Ej 3
		public List<Integer> eliminarDuplicadosConSet(List<Integer> l) {
			
			List<Integer> aux = new ArrayList<Integer>();
			
			Set<Integer> conjunto = new TreeSet<Integer>();
			conjunto.addAll(l);
			
			aux.addAll(conjunto);
			return aux;
		}
	// Ej 4
	public List<Integer> invertirLista(List<Integer> l) {
		
		List<Integer> aux = new ArrayList<Integer>();
		
		for (int i = l.size() - 1; i >= 0; i--) {
			aux.add(l.get(i));
		}
		
		return aux;
	}
	// Ej 4 con Iterator
		public List<Integer> invertirListaConListIterator(List<Integer> l) {
			
			List<Integer> aux = new ArrayList<Integer>();
			
			ListIterator<Integer> litr = l.listIterator(l.size());
			
			while (litr.hasPrevious()) {
				aux.add(litr.previous());
			}
			
			return aux;
		}
	
	
	public static void main(String[] args) {
		Listas rl = new Listas();
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(3);
		l1.add(5);
		l1.add(6);
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(2);
		l2.add(4);
		l2.add(7);
		l2.add(9);
		
		List<Integer> l3 = rl.dosListasOrdenadasEnUna(l1, l2);
		System.out.println(l3);
		
		List<Integer> l4 = new ArrayList<Integer>();
		l4.add(2);
		l4.add(8);
		l4.add(2);
		l4.add(7);
		l4.add(7);
		
		List<Integer> l5 = rl.eliminarDuplicados(l3);
		System.out.println(l5);
		
		System.out.println(rl.invertirLista(l5));
		
		List<Integer> l6 = new ArrayList<Integer>();
		l6.addAll(Arrays.asList(-11, 2, -30, 2, 4, 5, 6, 7, 7, 6));
		System.out.println("Set: " + rl.eliminarDuplicados(l6));
		
		System.out.println(rl.invertirListaConListIterator(l6));
	}
}
/*
Escribir un método que reciba dos listas de números enteros ordenados y devuelva una tercera lista de números enteros, con todos los elementos de las listas que recibió, manteniendo el orden.
Por ejemplo, si recibe las listas [1,3,5,6,8,9,10] y [2,4,7], debe devolver [1,2,3,4,5,6,7,8,9,10].
*/