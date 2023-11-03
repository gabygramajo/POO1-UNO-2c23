package archivosYexcepciones;

public class ConversionMonedaException extends Exception {
  public ConversionMonedaException(String msj) {
    super(msj); // la clase Exception tiene un cons. para lanzar el msj
  }
  public ConversionMonedaException() {
    this("Conversion incorrecta entre monedas");
  }

}
