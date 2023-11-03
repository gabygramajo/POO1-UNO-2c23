package archivosYexcepciones;

public class ConversionPesosArgentinosADolaresException extends ConversionMonedaException {
  public ConversionPesosArgentinosADolaresException (String msj) {
    super(msj);
  }

  public ConversionPesosArgentinosADolaresException () {
    this("Imposible convertir pesos argentinos a dolares");
  }
}
