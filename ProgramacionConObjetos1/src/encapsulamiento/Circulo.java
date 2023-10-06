package encapsulamiento;
//importar clase Math de forma estática.
import static java.lang.Math.*;

public class Circulo {

	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double obtenerRadio() {
		return radio;
	}
	public void cambiarRadio(double nuevoRadio) {
		radio = nuevoRadio;
	}
	public double obtenerDiametro() {
		return radio*2;
	}
	public double obtenerPerimetro() {
		return PI * obtenerDiametro();
	}
	public double obtenerArea() {
		return PI * pow(radio, 2);
	}
	
}
