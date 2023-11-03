package archivosYexcepciones;

public enum TipoMoneda {
  REALES("R$", "Reales"),
  PESOS_ARGENTINOS("AR$", "Pesos Argentinos"),
  GUARANIES("GS", "Guaranies"),
  DOLARES_ESTADOUNIDENSES("USD", "Dolares Estadounidenses");

  private String codigo;
  private String nombre;

  private TipoMoneda(String codigo, String nombre) {
    this.codigo = codigo;
    this.nombre = nombre;
  }

  public String getCodigo() {
    return codigo;
  }

  public String getNombre() {
    return nombre;
  }

}
