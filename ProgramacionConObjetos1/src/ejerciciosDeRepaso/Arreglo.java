package ejerciciosDeRepaso;

public class Arreglo {	
	//24. Escribir una función que reciba un arreglo de enteros y devuelva true si el arreglo estáordenado de mayor a menor y false si está desordenado.
	public boolean ordenadoMayoraMenor(int[] arr) {
		int mayor = arr[0];		
		
		for (int i = 1; i < arr.length; i++) {
			if(mayor < arr[i])
				return false;
			mayor = arr[i];
		}
		return true;
	}
	// 25. Escribir una función que reciba un arreglo de enteros y devuelva la suma de los elementos que se encuentran en posiciones pares (incluido el elemento de la posición 0). Por ejemplo: Dado el arreglo [1, 2, 13 ,4, 8, 6] => devuelve 22 (1+13+8)
	public void sumaPosPar(int[] arr) {
		int i = 0;
		int resultado = 0;
		while(i < arr.length) {
			resultado += arr[i];
			i += 2;
		}
		System.out.println(resultado);
	}
	//26. Implementar una función que reciba como parámetro un arreglo de enteros y muestre por pantalla cuántas veces se repite cada uno. El arreglo no está ordenado. Se garantiza que a los sumo habrá 100 números diferentes.
	public void numRepetidos(int[] arr) {
		int[] numerosDiferentes = new int[100];
		
		for (int i = 0; i < arr.length - 1; i++) {
			int contador = 0;

			if(seRepite(arr[i], numerosDiferentes))
				continue;
			
			for (int j = i; j < arr.length; j++) {
				if(arr[i] == arr[j]) 
					contador++;
			}
			
			numerosDiferentes[i] = arr[i];
			System.out.println(arr[i] + " se repite: " + contador + " veces.");
		}
	}
	
	public boolean seRepite(int n, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == n)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] v1 = {2,3,1};
		int[] v2 = {-1,-2,-3};
		int[] v3 = {3,2,1};
		int[] v4 = {6,3,2,1};
		int[] v5 = {1, 2, 13 ,4, 8, 6};
		int[] v6 = {2,1,2,13,2,4,8,6,1,6};
		
		Arreglo v = new Arreglo();
//		v.numRepetidos(v6);
//		v.sumaPosPar(v5);
//		System.out.println(v.ordenadoMayoraMenor(v1));
		System.out.println(v.ordenadoMayoraMenor(v2));
//		System.out.println(v.ordenadoMayoraMenor(v3));		
//		System.out.println(v.ordenadoMayoraMenor(v4));		
//		System.out.println(v.ordenadoMayoraMenor(v5));		
	}

}
