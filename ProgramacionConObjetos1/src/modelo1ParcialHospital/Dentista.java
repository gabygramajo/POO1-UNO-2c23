package modelo1ParcialHospital;

public class Dentista extends Profesional {

	public Dentista(String nombre, String apellido) {
		super(nombre, apellido);
	}

	@Override
	public double getHonorarioMensual() {
		return super.getHonorarioBasico();
	}

}
