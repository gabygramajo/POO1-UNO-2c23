import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Infractores {
  private int limiteDeVelocidad = 80;
  private double multa = 50000.0;
  private Map<String, Integer> infractores = new HashMap<String, Integer>();

  public Infractores() {
    
  }

  public int getLimiteDeVelocidad() {
    return limiteDeVelocidad;
  }

  public double getMulta() {
    return multa;
  }

  public Map<String, Integer> getInfractores() {
    return infractores;
  }

  public void leerInfractores(String entrada) throws IOException {
    File fl = new File(entrada);
    FileReader fr = new FileReader(fl);
    BufferedReader br = new BufferedReader(fr);

    String linea = br.readLine();
    while ( linea != null) {

      String patente = linea.split(" ")[0];
      Integer velocidad = Integer.parseInt(linea.split(" ")[1]);

      if (velocidad > limiteDeVelocidad) {
        if (infractores.containsKey(patente)) {
          infractores.put(patente, infractores.get(patente) + 1);
        } else
          infractores.put(patente, 1);
      }

      linea = br.readLine();
    }

    br.close();
  }

    public void escribirMultados(String entrada) throws IOException {
      FileWriter fw = new FileWriter(entrada);
      PrintWriter pr = new PrintWriter(fw);

      for ( Map.Entry<String, Integer> entry : infractores.entrySet()) {
        String patente = entry.getKey();
        Integer cantDeMultas = entry.getValue();

        pr.println(patente + " " + cantDeMultas * multa); 
      }

      pr.close();
  }

  public static void main(String[] args) throws IOException {
    Infractores infractores = new Infractores();

    // System.out.println(infractores.getLimiteDeVelocidad());
    infractores.leerInfractores("Infractores.in");
    // System.out.println(infractores.getInfractores());
    infractores.escribirMultados("multados.out");
  }

}
