package clase3_Composicion_Delegacion.coronaCircularSinComposicion;

public class CoronaCircular {

	private double radioInterior;
	private double radioExterior;
	
	public CoronaCircular (double radioInterior, double radioExterior) {
		if(radioInterior >= radioExterior)
			throw new Error("El radio interior debe ser menor que el exterior");
		this.setRadioInterior(radioInterior);
		this.setRadioExterior(radioExterior);
	}

	public double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(double radioInterior) {
		if(validarRadio(radioInterior))
			this.radioInterior = radioInterior;
	}

	public double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(double radioExterior) {
		if(validarRadio(radioExterior))
			this.radioExterior = radioExterior;
	}
	
	public double getPerimetro() {
		return (this.radioInterior + this.radioExterior)*2*Math.PI;
	}
	
	public double getSuperficie() {
		return Math.PI * (Math.pow(this.radioExterior, 2) - Math.pow(this.radioInterior, 2));
	}

	private boolean validarRadio(double valorRadio) {
		if(valorRadio <= 0)
			throw new Error("El radio no puede ser cero 0 negativo");
		
		return true;
	}
	
	public static void main(String[] args) {
		CoronaCircular cc = new CoronaCircular(10, 15);
		System.out.println(cc.getRadioInterior());
		System.out.println(cc.getRadioExterior());
	}
	
}
