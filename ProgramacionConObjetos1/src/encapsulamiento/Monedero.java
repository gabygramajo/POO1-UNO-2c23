package encapsulamiento;

public class Monedero {
//	ATRIBUTOS
	private double dinero;
// 	El estado del objeto sólo debe ser visible únicamente desde el objeto. Por eso los atributos deben de ir con private.
	
//	Constructor
//	-> Se ejecuta al instanciar la clase.
//	-> Se usa para inicializar los atributos.
	// Constructor parametrizado
	public Monedero(double dineroInicial) {
		this.dinero = dineroInicial;
	}
	// Constructor por defecto
	public Monedero() {
		this.dinero = 0.0;
	}

//	Métodos
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	public void sacarDinero(double monto) {
		if(monto >= 0 && monto <= dinero)
			this.dinero -= monto;
	}
	public void depositarDinero(double monto) {
		if(monto > 0)
			this.dinero += monto;
	}
	
	public static void main(String[] args) {
		Monedero m1 = new Monedero();
		Monedero m2 = new Monedero(2500.50);
		
		System.out.println("Saldo monedero1: $" + m1.getDinero());
		System.out.println("Saldo monedero2: $" + m2.getDinero());
		
		m2.sacarDinero(750);
		System.out.println("Saldo monedero2: $" + m2.getDinero());
		
		m1.depositarDinero(1000);
		System.out.println("Saldo monedero1: $" + m1.getDinero());
	}

}
/* 
 CONSTRUCTORES	
 - Es un método específico que se usa para inicializar los objetos de esa clase. 	
 - Es una función que se ejecuta automáticamente siempre al crear un objeto.	
 - Se encarga de reservar memoria e inicializar la variable miembro de la clase.	
 - Se los utiliza para inicializar los estados de las variables de instancia.
 
This
- Es un objeto llamador el cual hace referencia a un atributo o método de la misma clase.

Getters y Setters
- El estado del objeto sólo debe ser visible únicamente desde el objeto. Por eso los atributos deben de ir con private y sólo deben de ser modificados o accedidos desde los métodos set o get.
 */