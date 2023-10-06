package clasesEnPOO;

//Importando una clase desde otro package
import sistemaBancario.CuentaBancaria;

//[acceso] class [NombreClase] {
//		Cuerpo de la clase donde contiene atributos y métodos
// }
//Nombre de la clase: sustantivo singular
//Nomenclatura: Upper Camel-Case

public class Biblioteca {

	public static void main(String[] args) {
		// Declarando un objeto:
		CuentaBancaria cb;
		// Instanciando un objeto:
		cb = new CuentaBancaria();
		
		// Declarando e Instanciando un objeto
		CuentaBancaria cb2 = new CuentaBancaria();
		
		// cb y cb2 son Objetos de tipo CuentaBancaria
		System.out.println( cb.getClass().getName() );
		System.out.println( cb2.getClass().getName() );

	}

}
