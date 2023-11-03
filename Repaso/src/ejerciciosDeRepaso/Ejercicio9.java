package ejerciciosDeRepaso;

public class Ejercicio9 {
	
	static int sumaMultiplos(int n) {
		int suma = 0, i = 0;
		
		while(i < n) {
			
			if(i % 3 == 0 || i % 5 == 0) {
				suma += i;
			}
			
			i++;
		}
		
		return suma;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Resultado: " + sumaMultiplos(10));
		System.out.println("Resultado: " + sumaMultiplos(16));
		
	}

}
