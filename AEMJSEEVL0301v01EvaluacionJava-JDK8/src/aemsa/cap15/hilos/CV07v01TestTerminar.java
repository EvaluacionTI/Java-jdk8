package aemsa.cap15.hilos;

import aemsa.cap15.hilos.thread.CS0701v01Demonio;
import aemsa.cap15.hilos.thread.CS0702v01ContadorAdelante;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//////////////////////////////////////////////////////////////////
// Terminar un hilo.
//
public class CV07v01TestTerminar
{
  public static void main(String[] args)
  {
    // Lanzar el demonio dbip
    CS0701v01Demonio dbip = new CS0701v01Demonio();
    
    // Lanzar el hilo cuentaAdelante
    CS0702v01ContadorAdelante cuentaAdelante = new CS0702v01ContadorAdelante("Contador+");
    
    System.out.println("Pulse [Entrar] para finalizar");
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    try
    {
      br.readLine(); // ejecuci�n detenida hasta pulsar [Entrar]
    }
    catch (IOException e) {}
    // Permitir al hilo cuentaAdelante finalizar
    cuentaAdelante.terminar();
  }
}
//////////////////////////////////////////////////////////////////
