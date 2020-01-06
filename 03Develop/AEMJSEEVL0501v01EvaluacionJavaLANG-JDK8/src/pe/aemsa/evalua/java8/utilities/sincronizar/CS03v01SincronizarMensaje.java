package pe.aemsa.evalua.java8.utilities.sincronizar;

//////////////////////////////////////////////////////////////////
// Sincronizaci�n de hilos: wait y notify.
//
public class CS03v01SincronizarMensaje
{
  private String msTextoMensaje;
  private int miNumeroMensaje;
  private boolean mbDisponible = false;

  public synchronized void almacenar(int nmsj)
  {
    while (mbDisponible == true)
    {
      // El �ltimo mensaje a�n no ha sido mostrado
      try
      {
        wait(); // el hilo se pone a dormir y cede el monitor
      }
      catch (InterruptedException e) { }
    }
    miNumeroMensaje = nmsj;
    // Suponer operaciones para buscar el mensaje en una tabla
    // de mensajes; resultado:
    msTextoMensaje = "mensaje";
    mbDisponible = true;
    notifyAll();
  }

  public synchronized String obtener()
  {
    while (mbDisponible == false)
    {
      // No hay mensaje
      try
      {
        wait(); // el hilo se pone a dormir y cede el monitor
      }
      catch (InterruptedException e) { }
    }
    mbDisponible = false;
    notifyAll();
    // Componer el mensaje bajo un determinado formato
    String mensaje;
    mensaje = msTextoMensaje + " #" + miNumeroMensaje;
    return mensaje;
  }
}
//////////////////////////////////////////////////////////////////
