package pe.aemsa.evalua.java.cap08.clases.view;

public class CV0102v02EvaluarClaseMain
{
  public static void main(String[] args)
  {
    // C�digo com�n a todos los casos
    System.out.println("Argumentos: ");
    if (args.length == 0)
    {
      // Escriba aqu� el c�digo que s�lo se debe ejecutar cuando
      // no se pasan argumentos
      System.out.println("    ninguno");
    }
    else
    {
      boolean argumento_k = false, argumento_l = false,
              argumento_n = false;
 
      // �Qu� argumentos se han pasado?
      for (int i = 0; i < args.length; i++)
      {
        if (args[i].compareTo("-k") == 0) argumento_k = true;
        if (args[i].compareTo("-l") == 0) argumento_l = true;
        if (args[i].compareTo("-n") == 0) argumento_n = true;
      }

      if (argumento_k) // si se pas� el argumento -k:
      {
        // Escriba aqu� el c�digo que s�lo se debe ejecutar cuando
        // se pasa el argumento -k
        System.out.println("    -k");
      }
      if (argumento_l) // si se pas� el argumento -l:
      {
        // Escriba aqu� el c�digo que s�lo se debe ejecutar cuando
        // se pasa el argumento -l
        System.out.println("    -l");
      }
      if (argumento_n) // si se pas� el argumento -n:
      {
        // Escriba aqu� el c�digo que s�lo se debe ejecutar cuando
        // se pasa el argumento -n
        System.out.println("    -n");
      }
    }
    // C�digo com�n a todos los casos
  }
}
