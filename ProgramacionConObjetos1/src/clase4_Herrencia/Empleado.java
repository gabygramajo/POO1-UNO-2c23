package clase4_Herrencia;

public class Empleado {

	private String nombre;
	private double sueldoBasico;
	private Fecha fechaDeNacimiento;
	
	public Empleado(String nombre, double sueldoBasico, Fecha fechaDeNacimiento) {
		this.nombre = nombre;
		this.sueldoBasico = sueldoBasico;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public Empleado(String nombre, double sueldoBasico) {
		this(nombre, sueldoBasico, null);
	}
	
	public Empleado(String nombre) {
		this(nombre, 0); // No hace falta inicar un segundo argumento null xq ya lo hace el de arriba
	}
	
	public Empleado() {
		this(" "); // llama al constructor de arriba e incializa con " " al atributo nombre.
	}

	public double getSalario() {
		return this.sueldoBasico;
	}
	
	public String getNombre() {
		return nombre;
	}

	public Fecha getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

}
