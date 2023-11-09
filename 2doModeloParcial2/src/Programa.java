public class Programa {
  private String programa = "";
  private double rating;

  public Programa(String programa, double rating) {
    this.programa = programa;
    this.rating = rating;
  }
  public String getPrograma() {
    return programa;
  }
  public double getRating() {
    return rating;
  }
  @Override
  public String toString() {
    return getPrograma() + " " + getRating();
  }

  
}
