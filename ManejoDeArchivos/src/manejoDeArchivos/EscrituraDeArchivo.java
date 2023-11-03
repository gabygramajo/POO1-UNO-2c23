package manejoDeArchivos;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class EscrituraDeArchivo {

  public static void main(String[] args) throws IOException {
    // File: carga la ubicación del archivo.
    // File file = new File("datos.txt");
    File file = new File("D:\\POO1-UNO-2c23\\ManejoDeArchivos\\src\\manejoDeArchivos\\datos.txt");

    // FileWriter: abre el archivo para escritura
    FileWriter fw = new FileWriter(file);
    // Al usar FileWriter se requiere de tratar previamente la Excepcion de IOException ya que si no existe lo crea y al intentar creal el archivo podria no tener permisos o espacion, etc.
    // El manejo de I/O están sujetas a una variedad de condiciones de error, como archivos inexistentes, falta de permisos, discos llenos, problemas de red, etc. 
    //Podemos tratar la excepcion con un Try/catch ó indicando la exception en él método.

    // Preparar el archivo en memoria y así poder realizar la escritura de manera eficiente
    BufferedWriter bw = new BufferedWriter(fw);

    //Escritura
    bw.write("Escribiendo la primera línea del archivo.");
    bw.newLine();
    bw.write("Escribiendo la segundo línea del archivo");
    bw.close(); // Siempre se debe de cerrar el archivo.

  }

}
