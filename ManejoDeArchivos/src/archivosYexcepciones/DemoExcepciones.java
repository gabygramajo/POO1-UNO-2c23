package archivosYexcepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedList;

public class DemoExcepciones {

  public static void main(String[] args) throws Exception {

    LinkedList<Moneda> monedas = new LinkedList<Moneda>();

    File file = new File("D:\\POO1-UNO-2c23\\ManejoDeArchivos\\src\\archivosYexcepciones\\monedas.txt");
    FileReader fr = new FileReader(file);

    BufferedReader br = new BufferedReader(fr);
    
    String linea = "";

    while ((linea = br.readLine()) != null) {
      String [] split = linea.split(";");
      // System.out.println(Double.parseDouble(split[0]) + " " + split[1]);
      Moneda moneda = new Moneda(Double.parseDouble(split[0]), split[1]);

      monedas.add(moneda);
    }

    br.close();

    HashMap<String, Double> mapaMonetario = new HashMap<String, Double>();

    for (Moneda moneda : monedas) {
      String codigo = moneda.getTipoMoneda().getCodigo();
      double acum = moneda.getValor();

      if(mapaMonetario.get(codigo) != null)
        acum = acum + mapaMonetario.get(codigo);
        mapaMonetario.put(codigo, moneda.getValor());

      // System.out.println( moneda.getTipoMoneda().getCodigo() + " " + moneda.getValor());
    }

    for (String clave : mapaMonetario.keySet()) {
      System.out.println(clave + " = " + mapaMonetario.get(clave));
    }

    // codigo de la clase de excepciones
    /*
    Moneda mon1 = new Moneda(100, TipoMoneda.PESOS_ARGENTINOS);
    Moneda mon2 = new Moneda(1000, TipoMoneda.DOLARES_ESTADOUNIDENSES);

    ConversionMoneda conv = new ConversionMoneda(mon1, mon2);

    try {
      conv.convertir();
    } catch (ConversionPesosArgentinosADolaresException e) {
      e.printStackTrace();
    } catch (ConversionMonedaException e) {
      e.printStackTrace();
    }
    */
  }
}
