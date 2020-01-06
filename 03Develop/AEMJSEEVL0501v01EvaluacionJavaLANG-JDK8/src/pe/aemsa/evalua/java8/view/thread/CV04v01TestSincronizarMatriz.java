package pe.aemsa.evalua.java8.view.thread;

import pe.aemsa.evalua.java8.utilities.thread.CS04v02Productor;
import pe.aemsa.evalua.java8.utilities.thread.CS04v01Consumidor;
import pe.aemsa.evalua.java8.utilities.sincronizar.CS04v01SincronizarMatriz;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//////////////////////////////////////////////////////////////////
// Sincronizaci�n de hilos.
//
public class CV04v01TestSincronizarMatriz
{
  public static void main(String[] args)
  {
    CS04v01SincronizarMatriz matriz = new CS04v01SincronizarMatriz(10);
    CS04v02Productor productor1 = new CS04v02Productor(matriz);
    CS04v01Consumidor consumidor1 = new CS04v01Consumidor(matriz);

    System.out.println("Pulse [Entrar] para continuar y");
    System.out.println("vuelva a pulsar [Entrar] para finalizar.");
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    
    try
    {
      br.readLine(); // ejecuci�n detenida hasta pulsar [Entrar]
      // Iniciar la ejecuci�n de los hilos
      productor1.start();
      consumidor1.start();
      br.readLine(); // ejecuci�n detenida hasta pulsar [Entrar]
    }
    catch (IOException e) {}
    // Permitir a los hilos finalizar
    productor1.terminar();
    consumidor1.terminar();
  }
}
//////////////////////////////////////////////////////////////////
