package aemsa.cap06.funcion.fecha;

/////////////////////////////////////////////////////////////////

import aemsa.cap06.funcion.fecha.CO02v01FuncionFecha;

// Aplicaci�n que utiliza la clase CFecha
//
public class CV02v01FuncionFecha
{
  // Visualizar una fecha
  public static void visualizarFecha(CO02v01FuncionFecha fecha)
  {
    int[] f = new int[3];
    
    fecha.obtenerFecha(f);
    System.out.println(f[0] + "/" + f[1] + "/" + f[2]);
  }
  
  public static void main(String[] args)
  {
    CO02v01FuncionFecha fecha1 = new CO02v01FuncionFecha();
    CO02v01FuncionFecha fecha2 = new CO02v01FuncionFecha(3);
    CO02v01FuncionFecha fecha3 = new CO02v01FuncionFecha(15, 3);
    CO02v01FuncionFecha fecha4 = new CO02v01FuncionFecha(1, 3, 2002);

    fecha1.copiar(fecha2.copiar(fecha3));
    CO02v01FuncionFecha fecha5 = new CO02v01FuncionFecha(fecha1);

    visualizarFecha(fecha1);
    visualizarFecha(fecha2);
    visualizarFecha(fecha3);
    visualizarFecha(fecha4);
    visualizarFecha(fecha5);
 
    fecha2 = null;
    Runtime runtime = Runtime.getRuntime();
    runtime.gc();
    runtime.runFinalization();
  }
}
