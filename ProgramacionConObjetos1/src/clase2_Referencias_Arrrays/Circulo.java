 package clase2_Referencias_Arrrays;

public class Circulo {
	private double radio;
	
	public Circulo(double radio) {
		this.setRadio(radio);
	}

	public Circulo() {
		this(1.0);
	}
	
	public double getRadio() {
		return this.radio;
	}

	public void setRadio(double radio) {
		if( radio <= 0)
			throw new Error("Radio Inválido");
		
		this.radio = radio;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) // Son el mismo objeto?
			return true;
		if(obj == null) // El parametro es nulo
			return false;
		if(getClass() != obj.getClass()) // Son diferente clase?
			return false;
		
		Circulo other = (Circulo) obj;
		
		return Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio); 
	}
}
