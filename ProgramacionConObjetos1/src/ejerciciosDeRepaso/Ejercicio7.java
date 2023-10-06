package ejerciciosDeRepaso;

public class Ejercicio7 {

	static int max(int n1, int n2, int n3) {
		if(n1 > n2 && n1 > n3) 
			return n1;

		if(n2 > n3) 
			return n2;
		
		return n3;
	}
	
	static int min(int n1, int n2, int n3) {
		if(n1 < n2 && n1 < n3)
			return n1;
		
		if(n2 < n3) 
			return n2;
		
		return n3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20, num2 = 2, num3 = 30;
		
		System.out.println("max: " + max(num1, num2, num3));
		System.out.println("min: " + min(num1, num2, num3));
		
	}

}
/*
Leer tres valores numéricos enteros, indicar cual es el mayor, cuál es el del medio y cuál el
menor. Considerar que los tres valores son diferentes.
*/