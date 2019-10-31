package aemsa.cap06.funcion.fecha;

import java.io.PrintStream;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CV02v01FormatoFechaFlujo
{
  static String FechaLocal(Date fechaHora)
  {
    String salida;
    DateFormat formato = DateFormat.getDateInstance();
    salida = formato.format(fechaHora);
    return salida;
  }
  
  static String HoraLocal(Date fechaHora)
  {
    String salida;
    DateFormat formato = DateFormat.getTimeInstance();
    salida = formato.format(fechaHora);
    return salida;
  }
  
  static public String FechaHoraPer(String patron, Date fechaHora)
  {
    SimpleDateFormat formato = new SimpleDateFormat(patron);
    String salida = formato.format(fechaHora);
    return salida;
  }

  static public void main(String[] args)
  {
    PrintStream flujoS = System.out;
    Date hoy = new Date();
    flujoS.println(FechaLocal(hoy));
    flujoS.println(HoraLocal(hoy));
    flujoS.println(FechaHoraPer("EEEE dd-MMM-yyyy, HH:mm:ss", hoy));
    
    Object[] argumentos = {new Long(1234), "C:", new Long(125)};
    MessageFormat mensaje = new MessageFormat("Fueron verificados {0} " + 
                            "ficheros de la unidad {1} en {2} segundos");
    System.out.println(mensaje.format(argumentos));
  }
}
