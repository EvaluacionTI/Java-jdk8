package pe.aemsa.evalua.java8.utilities.thread;


import pe.aemsa.evalua.java8.utilities.sincronizar.CS06v01SeccionCritica;

//////////////////////////////////////////////////////////////////
// Sincronizaci�n de hilos. Trabajar con secciones cr�ticas.
//
public class CS06v01AdquirirSeccionCritica extends Thread
{
  private CS06v01SeccionCritica m;    // objeto para almacenar los datos

  public CS06v01AdquirirSeccionCritica(CS06v01SeccionCritica mdatos) // constructor
  {
    m = mdatos;
  }

  public void run()
  {
    int i = 0;

    do
    {
      i = m.calculos(getName()); // adquirir datos
    }
    while (i < m.tamano);
  }
}
//////////////////////////////////////////////////////////////////
