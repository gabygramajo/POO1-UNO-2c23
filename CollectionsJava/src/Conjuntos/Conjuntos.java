package Conjuntos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {
	
	public static void main(String[] args) {
		Set<Integer> enteros = new TreeSet<Integer>();
		enteros.add(2);
		enteros.add(-2);
		enteros.add(3);	
		System.out.println(enteros);
		
		Set<Punto> puntos = new TreeSet<Punto>();
		puntos.add(new Punto(-1, 1));
		puntos.add(new Punto(-1, -1));
		puntos.add(new Punto(1, -1));	
		puntos.add(new Punto(1, 1));	
		puntos.add(new Punto(-1, 1));
		
		System.out.println(puntos);
	}
}
