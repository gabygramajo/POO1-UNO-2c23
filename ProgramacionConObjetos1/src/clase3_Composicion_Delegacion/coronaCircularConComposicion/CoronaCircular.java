package clase3_Composicion_Delegacion.coronaCircularConComposicion;

public class CoronaCircular {

	private Circulo circuloChico;
	private Circulo circuloGrande;
	
	public CoronaCircular(double radioInterior, double radioExterior) {
		if(radioInterior >= radioExterior) 
			throw new Error("El radio interior debe ser menor que el exterior");
		this.circuloChico = new Circulo(radioInterior);
		this.circuloGrande = new Circulo(radioExterior);	
	}

	public double getRadioCirculoChico() {
		return circuloChico.getRadio();
	}

	public double getRadioCirculoGrande() {
		return circuloGrande.getRadio();
	}

	public double getPerimetro() {
		return this.circuloChico.getPerimetro() + this.circuloGrande.getPerimetro();
	}
	
	public double getSuperficie() {
		return this.circuloGrande.getSuperficie() - this.circuloChico.getSuperficie();
	}
}
