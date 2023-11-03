package archivosYexcepciones;

public class Moneda {
  private double valor;
  private TipoMoneda tipoMoneda;

  public Moneda(double valor, TipoMoneda tipoMoneda) {
    this.valor = valor;
    this.tipoMoneda = tipoMoneda;
  }

  public Moneda(double valor, String codMoneda) {
    this.valor = valor;
    this.tipoMoneda = TipoMoneda.valueOf(codMoneda);
  }

  public double getValor() {
    return valor;
  }

  public TipoMoneda getTipoMoneda() {
    return tipoMoneda;
  }
}
