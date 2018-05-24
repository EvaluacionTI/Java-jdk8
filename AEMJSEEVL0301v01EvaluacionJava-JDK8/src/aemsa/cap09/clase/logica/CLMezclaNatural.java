package aemsa.cap09.clase.logica;

import aemsa.cap12.flujos.entidad.CO04v01FlujoTipoDato;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//////////////////////////////////////////////////////////////////
// Ordenar un fichero utilizando el m�todo de mezcla natural.
// Se trata de un fichero de texto que almacena una lista de
// nombres.
// El nombre del fichero se recibe a trav�s de la l�nea de �rdenes.
// La ordenaci�n se realiza en orden alfab�tico ascendente.
// La aplicaci�n est� soportada por la clase CMezclaNatural.
//    M�todos:
//      mezclaNatural
//      distribuir
//      mezclar
//      main
//
public class CLMezclaNatural
{
  // Mezcla natural //////////////////////////////////////////////
  public static void mezclaNatural(File fichFuente)
    throws IOException
  {
    // Definici�n de variables
    File a = new File("ftempa.tmp"); // fichero temporal
    File b = new File("ftempb.tmp"); // fichero temporal

    int nro_tramos;
    do
    {
      nro_tramos = distribuir(fichFuente, a, b);
      if (nro_tramos <= 1)
      {
        // Proceso finalizado. Borrar los ficheros temporales.
        a.delete(); b.delete();
        return;
      }
      nro_tramos = mezclar(a, b, fichFuente);
    }
    while (nro_tramos != 1);
  } // mezclaNatural

  // Fase de distribuci�n ////////////////////////////////////////
  public static int distribuir(File fuente, File destinoA,
                               File destinoB) throws IOException
  {
    // Abrir un flujo de entrada desde fuente que permita
    // leer la informaci�n l�nea a l�nea.
    FileInputStream fis = new FileInputStream(fuente);
    InputStreamReader isr = new InputStreamReader(fis);
    BufferedReader fc = new BufferedReader(isr);
  
    // Abrir un flujo de salida hacia destinoA
    FileOutputStream fosA = new FileOutputStream(destinoA);
    OutputStreamWriter osrA = new OutputStreamWriter(fosA);
    BufferedWriter fa = new BufferedWriter(osrA);
      
    // Abrir un flujo de salida hacia destinoB
    FileOutputStream fosB = new FileOutputStream(destinoB);
    OutputStreamWriter osrB = new OutputStreamWriter(fosB);
    BufferedWriter fb = new BufferedWriter(osrB);
    
    BufferedWriter faux = fa; // faux ser� fa o fb
    String linea;             // �ltima l�nea le�da
    String linea_ant;         // l�nea anterior a la �ltima le�da
    int nro_tramos = 1;       // n�mero total de tramos ordenados

    // Leer la primera l�nea (l�nea anterior)
    if ((linea_ant = fc.readLine()) != null)
    {
      // Escribe en fa la l�nea le�da m�s el separador de l�nea
      fa.write(linea_ant); fa.newLine();
    }
    else
    {
      faux = null; fc.close(); fa.close(); fb.close();
      return 0;
    }

    // Leer la siguiente l�nea (l�nea actual)
    while ((linea = fc.readLine()) != null)
    {
      if (linea.compareTo(linea_ant) < 0)
      {
        // Cambiar al otro fichero
        faux = (faux == fa) ? fb : fa;
        ++nro_tramos;
      }
      linea_ant = linea;
      // Escribe en faux la l�nea le�da m�s el separador de l�nea
      faux.write(linea); faux.newLine();
    }
    faux = null; fc.close(); fa.close(); fb.close();
    return nro_tramos;
  } // distribuir

  // Fase de mezcla //////////////////////////////////////////////
  public static int mezclar(File fuenteA, File fuenteB,
                            File destino) throws IOException
  {
    // Abrir un flujo de entrada desde fuenteA que permita
    // leer la informaci�n l�nea a l�nea.
    FileInputStream fisA = new FileInputStream(fuenteA);
    InputStreamReader isrA = new InputStreamReader(fisA);
    BufferedReader fa = new BufferedReader(isrA);
  
    // Abrir un flujo de entrada desde fuenteB que permita
    // leer la informaci�n l�nea a l�nea.
    FileInputStream fisB = new FileInputStream(fuenteB);
    InputStreamReader isrB = new InputStreamReader(fisB);
    BufferedReader fb = new BufferedReader(isrB);
  
    // Abrir un flujo de salida hacia destino
    FileOutputStream fos = new FileOutputStream(destino);
    OutputStreamWriter osr = new OutputStreamWriter(fos);
    BufferedWriter fc = new BufferedWriter(osr);
    
  
    String lineaDeFa, lineaDeFb, lineaDeFa_ant, lineaDeFb_ant;
    int nro_tramos = 1;

    // Leemos las dos primeras l�neas, una de fa y otra de fb
    lineaDeFa = fa.readLine();
    lineaDeFa_ant = lineaDeFa;
    lineaDeFb = fb.readLine();
    lineaDeFb_ant = lineaDeFb;
    
    // Vamos leyendo y comparando hasta que se acabe alguno de los
    // ficheros. La fusi�n se realiza entre pares de tramos
    // ordenados. Un tramo de fa y otro de fb dar�n lugar a un
    // tramo ordenado sobre fc.
    while (lineaDeFa != null && lineaDeFb != null)
    {
      if (lineaDeFa.compareTo(lineaDeFb) < 0)       // if 1
      {
        if (lineaDeFa.compareTo(lineaDeFa_ant) < 0) // if 2
        // Encontrado el final del tramo de fa
        {
          lineaDeFa_ant = lineaDeFa;
          // Copiamos el tramo ordenado de fb
          do
          {
            fc.write(lineaDeFb); fc.newLine();
            lineaDeFb_ant = lineaDeFb;
          }
          while ((lineaDeFb = fb.readLine()) != null &&
                 lineaDeFb.compareTo(lineaDeFb_ant) > 0);
          ++nro_tramos;
        }
        else // de if 2
        {
          // Copiamos la cadena le�da de fa
          lineaDeFa_ant = lineaDeFa;
          fc.write(lineaDeFa); fc.newLine();
          lineaDeFa = fa.readLine();
        }
      }
      else // de if 1
      {
        if (lineaDeFb.compareTo(lineaDeFb_ant) < 0)  // if 3
        // Encontrado el final del tramo de fb
        {
          lineaDeFb_ant = lineaDeFb;
          // Copiamos el tramo ordenado de fa
          do
          {
            fc.write(lineaDeFa); fc.newLine();
            lineaDeFa_ant = lineaDeFa;
          }
          while ((lineaDeFa = fa.readLine()) != null &&
                 lineaDeFa.compareTo(lineaDeFa_ant) > 0);
          ++nro_tramos;
        }
        else // de if 3
        {
          // Copiamos la cadena le�da de fb
          lineaDeFb_ant = lineaDeFb;
          fc.write(lineaDeFb); fc.newLine();
          lineaDeFb = fb.readLine();
        }
      }
    } // de while

    // En el caso de acabarse primero los datos de fb
    if (lineaDeFb == null)
    {
      fc.write(lineaDeFa); fc.newLine();
      while ((lineaDeFa = fa.readLine()) != null)
      {
        fc.write(lineaDeFa); fc.newLine();
      }
    }
    // En el caso de acabarse primero los datos de fa
    else if (lineaDeFa == null)
    {
      fc.write(lineaDeFb); fc.newLine();
      while ((lineaDeFb = fb.readLine()) != null)
      {
        fc.write(lineaDeFb); fc.newLine();
      }
    }
    fc.close(); fa.close(); fb.close();
    return nro_tramos;
  } // de mezclar
    
  public static void main(String[] args)
  {
    // main debe recibir un par�metro: el fichero a ordenar.
    if (args.length != 1)
      System.err.println("Sintaxis: java CMezclaNatural " +
                         "<nombre_fichero>");
    else
    {
      File nombreFichero = new File(args[0]);
      try
      {
        // Asegurarse de que "nombreFichero" existe y se puede leer
        if (!nombreFichero.exists() || !nombreFichero.isFile())
          throw new IOException("No existe el fichero " + 
                                nombreFichero);
        if (!nombreFichero.canRead())
          throw new IOException("El fichero " + nombreFichero +
                                " no se puede leer");
       
        mezclaNatural(nombreFichero); // realizar la ordenaci�n
        
        // Mostrar el contenido del fichero
        char resp;
        System.out.print("Desea ver el contenido del fichero? s/n: ");
        resp = CO04v01FlujoTipoDato.caracter();
        CO04v01FlujoTipoDato.limpiar();
        if (resp == 's')
        {
          // Abrir un flujo de entrada desde nombreFichero
          // que permita leer la informaci�n l�nea a l�nea.
          FileInputStream fis = new FileInputStream(nombreFichero);
          InputStreamReader isr = new InputStreamReader(fis);
          BufferedReader fc = new BufferedReader(isr);
          
          // Leer el fichero y mostrarlo
          String linea;
          while ((linea = fc.readLine()) != null)
            System.out.println(linea);
          fc.close();
        }
      }
      catch(IOException e)
      {
        System.out.println("Error: " + e.getMessage());
      }
    }
  }
}
//////////////////////////////////////////////////////////////////
