package modelo1ParcialHospital;

public abstract class Profesional implements Comparable<Profesional> {
	private static double HONORARIO_BASICO = 500000;
	private String nombre;
	private String apellido;
	
	public Profesional(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public double getHonorarioBasico() {
		return HONORARIO_BASICO;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public abstract double getHonorarioMensual();

	@Override
	public String toString() {
		return this.getNombre() + " " + this.getApellido() + "\t\t $" + this.getHonorarioMensual();
	}

	@Override
	public int compareTo(Profesional p) {
		return Double.compare(p.getHonorarioMensual(), this.getHonorarioMensual());
	}
	
}
