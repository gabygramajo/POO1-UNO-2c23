package encapsulamiento;

public class Nota {
	//Atributo
	private double valor;
	
	//Constructor
	public Nota(double valor) {
		this.valor = valor;
	}
	
	//Métodos
	double obtenerValor() {
		return this.valor;
	}
	boolean aprobado() {
		return (valor >= 4 && valor <= 10);
	}
	boolean desaprobado() {
		return !aprobado();
	}
	void recuperar(double nuevoValor) {
		if(nuevoValor > valor)
			this.valor = nuevoValor;
	}
	boolean promocion() {
		return this.valor >= 7;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nota parcial1 = new Nota(3);
		Nota parcial2 = new Nota(7);
		
		System.out.println(parcial1.aprobado());
		System.out.println(parcial1.desaprobado());
		System.out.println(parcial1.obtenerValor());
		parcial1.recuperar(8);		
		System.out.println(parcial1.aprobado());
		System.out.println(parcial1.obtenerValor());
		System.out.println(parcial1.promocion());
	}

}
