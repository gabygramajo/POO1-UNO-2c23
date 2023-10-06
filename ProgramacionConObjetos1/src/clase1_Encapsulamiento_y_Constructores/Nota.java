package clase1_Encapsulamiento_y_Constructores;

public class Nota {
	
	private int valorNota;
	
	public Nota(int valorInicial) {
		this.setValorNota(valorInicial);
	}

	public int obtenerValor() {
		return this.valorNota;
	}
	
	public boolean aprobado() {
		return (this.valorNota >= 4);
	}
	
	public boolean desaprobado() {
		return (this.valorNota < 4);
	}
	
	public void recuperar(int nuevoValor) {
		if (nuevoValor > this.valorNota && esValorCorrecto(nuevoValor))
			this.setValorNota(nuevoValor);
	}
	
	private boolean esValorCorrecto(int x) {
		return (x >= 0 && x <= 10 ); 
	}
	
	private void setValorNota(int nota) {
		if(!esValorCorrecto(nota)) {
			throw new Error("Nota inválida ingresada");
		}
		this.valorNota = nota;
	}
	
}
