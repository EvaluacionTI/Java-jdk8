package aemsa.cap15.hilos.thread;

//////////////////////////////////////////////////////////////////

import aemsa.cap15.hilos.modelo.CD06v02SeccionCritica;

// Sincronización de hilos. Trabajar con secciones críticas.
//
public class CS06v02AdquirirSeccionCritica extends Thread
{
  private CD06v02SeccionCritica m;    // objeto para almacenar los datos

  public CS06v02AdquirirSeccionCritica(CD06v02SeccionCritica mdatos) // constructor
  {
    m = mdatos;
  }

  public void run()
  {
    double x;
    do
    {
      synchronized (m)
      {
        if (m.ind >= m.tamano) return;
        x = Math.random();
        System.out.println(getName() + " tomo la muestra " + m.ind);
        m.asignar(x, m.ind);
        m.ind++;
      }
    }
    while (m.ind < m.tamano);
  }
}
//////////////////////////////////////////////////////////////////
