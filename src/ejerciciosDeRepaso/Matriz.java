package ejerciciosDeRepaso;

public class Matriz {
	
	int[][] C;
	
	public Matriz(int[][] X) {
		C = X;
	}
	
	int[][] sumarMatrizNxN(int[][] A, int[][] B) {
		int n = A[0].length;
		
		this.C = new int[n][n] ;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}	
		}	
		return C;
	}
	
	void mostrarMatriz() {
		int n = C.length;
		
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(C[i][j]);
			}			
		}		
	}
	
	public static void main(String[] args) {
		int[][] M1 = { {4, 1} , 
					   {6, 2} };
		
		int[][] M2 = { {1, 1} , 
					   {4, 2} };
		
		Matriz M3 = new Matriz(null);
		M3.sumarMatrizNxN(M1, M2);
		M3.mostrarMatriz();
		
	}

}
/*. Escribir una función que reciba dos matrices de NxN y devuelva la suma de las mismas.
Podemos considerar que las matrices se representan como un arreglo bidimensional.*/