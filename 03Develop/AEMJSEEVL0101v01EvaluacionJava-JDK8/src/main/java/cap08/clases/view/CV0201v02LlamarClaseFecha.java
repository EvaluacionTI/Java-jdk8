package pe.aemsa.evalua.java.cap08.clases.view;

/////////////////////////////////////////////////////////////////

import pe.aemsa.evalua.java.cap08.clases.view.CO02v02DefinicionFecha;
/////////////////////////////////////////////////////////////////
// Aplicaci�n que utiliza la clase CFecha
//
public class CV0201v02LlamarClaseFecha
{
  // Visualizar una fecha
  public static void visualizarFecha(CO02v02DefinicionFecha fecha)
  {
    int[] f = new int[3];
    
    fecha.obtenerFecha(f);
    System.out.println(f[0] + "/" + f[1] + "/" + f[2]);
  }
  
  public static void main(String[] args)
  {
    CO02v02DefinicionFecha fecha1 = new CO02v02DefinicionFecha();
    CO02v02DefinicionFecha fecha2 = new CO02v02DefinicionFecha(3);
    CO02v02DefinicionFecha fecha3 = new CO02v02DefinicionFecha(15, 3);
    CO02v02DefinicionFecha fecha4 = new CO02v02DefinicionFecha(1, 3, 2002);

    fecha1.copiar(fecha2.copiar(fecha3));
    CO02v02DefinicionFecha fecha5 = new CO02v02DefinicionFecha(fecha1);

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
