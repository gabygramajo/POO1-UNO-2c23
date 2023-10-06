package clase4_Herrencia;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	
	
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	public Fecha() {
		
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) // Son el mismo objeto?
			return true;
		if(obj == null) // El parametro es nulo
			return false;
		if(getClass() != obj.getClass()) // Son diferente clase?
			return false;
		
		Fecha other = (Fecha) obj;
		
		return this.toString() == other.toString(); 
	}
}
