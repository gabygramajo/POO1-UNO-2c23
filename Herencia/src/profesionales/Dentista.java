package profesionales;

public class Dentista  extends Profesional{

	public Dentista(String nombre, String apellido) {
		super(nombre, apellido);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Odontologo " + super.toString();
	}

}
