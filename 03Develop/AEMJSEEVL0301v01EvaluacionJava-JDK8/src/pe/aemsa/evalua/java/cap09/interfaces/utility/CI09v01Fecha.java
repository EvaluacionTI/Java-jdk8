package pe.aemsa.evalua.java.cap09.interfaces.utility;

//////////////////////////////////////////////////////////////////

import java.util.Calendar;

// Interfaz CI09v01Fecha: m�todos y constantes para obtener
//                  el d�a, mes y a�o
//
public interface CI09v01Fecha
{
  public final static int DIA_DEL_MES = Calendar.DAY_OF_MONTH;
  public final static int MES_DEL_ANO = Calendar.MONTH;
  public final static int ANO = Calendar.YEAR;
  
  public abstract int dia();
  public abstract int mes();
  public abstract int ano();
}

/*
  public int d�a()
  {
    GregorianCalendar fechaActual = new GregorianCalendar();
    return fechaActual.get(DIA_DEL_MES);
  }
  public int mes()
  {
    GregorianCalendar fechaActual = new GregorianCalendar();
    return fechaActual.get(MES_DEL_A�O)+1;
  }
  public int a�o()
  {
    GregorianCalendar fechaActual = new GregorianCalendar();
    return fechaActual.get(A�O);
  }
*/