package encapsulamiento;

public class PruebaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo circulito = new Circulo(2);
		
		System.out.println(circulito.obtenerRadio());
		circulito.cambiarRadio(4);
		System.out.println(circulito.obtenerRadio());
		System.out.println(circulito.obtenerDiametro());
		System.out.println(circulito.obtenerPerimetro());
		System.out.println(circulito.obtenerArea());
	}
}
