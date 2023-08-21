package ejerciciosDeRepaso;

public class ArraysEnJava {

	public static void main(String[] args) {
		// Arrays en Java
		
		// 1) Se los instancia con el operador new.
		
		int[] arrayNumEnteros = new int[5];
		arrayNumEnteros[1] = 6; 
		arrayNumEnteros[2] = 9;
		System.out.println("pos 2 = " + arrayNumEnteros[2]);
		// sus elementos se inicializan a 0
		System.out.println("arrayNumEnteros = " + arrayNumEnteros[3]); // >> 0
		double[] arrayNumFloat = new double[2];
		System.out.println("arrayNumFloat = " + arrayNumFloat[1]); // >> 0.0
		
		// System.out.println(arrayNumEnteros[6]); No permite acceder a memoria no definida
		
		// Formas de declarar arrays
		int[] vectorInt = {4, 8, 12};
		int[][] matrizInt = { {4, 8, 12}, {5, 10, 15} };
		
		
		// 2) Son "Zero-Based", comienzan con el indice 0 y hasta n -    
		// 	  Siendo n la longitpud del array.
		System.out.println(vectorInt[0]);
		int n = vectorInt.length - 1;
		System.out.println(vectorInt[n]);
		
		// 3) Todo arreglo es Homogeneo, de un tipo,  o una clase 
		// y Estático porque tiene un tamaño fijo.
		
		int[] enteros = {3, 1, 5, 6};
		double[] flotantes = { 4.23, 3.14, 1.65};
		char[] caracteres = {'H', 'o', 'l', 'a'};
		String[] cadenas = {"Hola", "Mundo"};
	}

}
/* Arrays en Java
 * 
 * 1) Son "Zero-Based", comienzan con el indice 0 y hasta n - 1. Siendo n la longitpud del array.
 * 2) Se los instancia con el operador new.
 * 3) Todo arreglo es de un tipo o una clase.
 */