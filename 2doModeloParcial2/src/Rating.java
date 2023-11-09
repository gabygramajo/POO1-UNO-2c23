import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Rating {

  private Map<Integer, List<Programa>> canales = new TreeMap<Integer, List<Programa>>();

  public void leerRating(String entrada) throws IOException {
    FileReader fr = new FileReader(new File(entrada));
    BufferedReader br = new BufferedReader(fr);

    String linea = br.readLine();

    while (linea != null) {
      Integer canal = Integer.parseInt(linea.split(",")[0]);
      String programa = linea.split(",")[1];
      Double rating = Double.parseDouble(linea.split(",")[2]);
      Programa p = new Programa(programa, rating);

      if(!canales.containsKey(canal)) {
        List<Programa> lP = new ArrayList<Programa>();
        lP.add(p);
        canales.put(canal, lP);
      } else {
        canales.get(canal).add(p);
      }
      linea = br.readLine();
    }
    br.close();
  }

  public void escribirRatingPorCanal(String salida) throws IOException {
    PrintWriter pw = new PrintWriter(new FileWriter(salida));

    for (Map.Entry<Integer, List<Programa>> cu : canales.entrySet()) {
      Integer canal = cu.getKey();
      double acumRating = 0.0;

      for (Programa p : cu.getValue()) {
        acumRating += p.getRating();
      }
      
      pw.println(canal + " " + acumRating);
    }
    pw.close();
  }

  public static void main(String[] args) throws IOException {
    Rating r = new Rating();
    r.leerRating("rating.in");
    System.out.println(r.canales);
    r.escribirRatingPorCanal("ratingPorCanal.out");
  }
}
