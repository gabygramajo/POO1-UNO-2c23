package manejoDeArchivos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

public class LecturaDeArchivos {
  // Al diferencia de la escritura de datos, al leer debe de tratar la excepcion FileNotFoundException xq si no existe dará error y no se crea, y para IOException en caso de que esté corrupto .
  public static void main(String[] args) throws FileNotFoundException, IOException {
    // Cargar la ruta/ubicacion del archivo
    File file = new File("D:\\POO1-UNO-2c23\\ManejoDeArchivos\\src\\manejoDeArchivos\\datos.txt");
    // Abrir el archivo en modo lectura
    FileReader fr = new FileReader(file);
    // para leer el archivo de manera eficiente al realizar buffering de los datos leídos.
    BufferedReader br = new BufferedReader(fr);

    // para almacenar cada línea leída del archivo.
    String linea = "";

    while ( (linea = br.readLine()) != null ) { // La condición del bucle verifica si la llamada al método readLine() del BufferedReader no devuelve null, lo que significa que hay más líneas en el archivo.
      System.out.println(linea);
    }

    br.close();
    // Una vez que se ha completado la lectura del archivo, se cierra el BufferedReader utilizando el método close(). Esto asegura que los recursos asociados al archivo se liberen adecuadamente.
  }
}
