package archivosYexcepciones;

import java.util.Calendar;

public class ConversionMoneda {
  private Moneda origen;
  private Moneda destino;
  
  public ConversionMoneda(Moneda origen, Moneda destino) {
    this.origen = origen;
    this.destino = destino;
  }

  public boolean convertir() throws ConversionMonedaException {
    if (origen.getValor() == 0 || destino.getValor() == 0 ) 
      throw new ConversionMonedaException("Los valores no pueden ser ceros.");

    // no se puede convertir de ARS a USD en fin de semana
    if (origen.getTipoMoneda().getCodigo().equals(TipoMoneda.PESOS_ARGENTINOS.getCodigo()) 
        && 
        destino.getTipoMoneda().getCodigo().equals(TipoMoneda.DOLARES_ESTADOUNIDENSES.getCodigo())) {
      Calendar calendar = Calendar.getInstance(); 
      int dia_semana = calendar.get(Calendar.DAY_OF_WEEK);
      if ( (dia_semana == 1) || (dia_semana == 7) ) { // si es sab (1) o dom (7).
        throw new ConversionMonedaException("Conversion incorrecta entre monedas, es fin de semana");
      }
    }

    return true;
  }
}
