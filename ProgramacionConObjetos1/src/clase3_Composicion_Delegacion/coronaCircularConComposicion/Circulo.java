package clase3_Composicion_Delegacion.coronaCircularConComposicion;

public class Circulo {
	private double radio;
	
	public Circulo(double radio) {
		serRadio(radio);
	}

	private void serRadio(double radio) {
		if(radio <= 0)
			throw new Error("Radio negativo o cero");
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}
	public double getDiametro() {
		return radio * 2;
	}
	
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}
	
	public double getSuperficie() {
		return (Math.PI*Math.pow(this.radio, 2));
	}
}
