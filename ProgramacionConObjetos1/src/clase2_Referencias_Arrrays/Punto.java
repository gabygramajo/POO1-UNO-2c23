package clase2_Referencias_Arrrays;

import java.util.ArrayList;

public class Punto {
	double x;
	double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String mostrarPunto() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.mostrarPunto();
	}

	public static void main(String[] args) {
		
		ArrayList<Punto> arrayDePuntos = new ArrayList<Punto>();
		arrayDePuntos.add(new Punto(0, 2));
		arrayDePuntos.add(new Punto(3, 2));
		arrayDePuntos.add(new Punto(5, 1));
		arrayDePuntos.add(new Punto(8, 5));
		arrayDePuntos.add(new Punto(9, 2));
		
		System.out.println(Double.compare(0.3, 0.3));
		System.out.println(Double.compare(2.3, 0.3));
		System.out.println(Double.compare(0.3, 0.1));
		
	
		for (Punto punto : arrayDePuntos) {
			if(punto instanceof Punto) {
				System.out.println(punto.toString());
			}
		}
		
//		Punto[] arrayDePuntos = new Punto[6];
//		Punto arrayDePuntos [] = new Punto[6];
//		
//		for (int i = 0; i < arrayDePuntos.length; i++) {
//			arrayDePuntos[i] = new Punto(i, i+1);
//		}
//		int i = 0;
//		for (Punto punto : arrayDePuntos) {
//			i++;
//			System.out.println("P" + i + " " + punto.mostrarPunto());
//		}
		
	}
}
