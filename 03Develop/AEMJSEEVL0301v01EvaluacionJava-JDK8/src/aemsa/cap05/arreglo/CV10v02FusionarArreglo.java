package aemsa.cap05.arreglo;

public class CV10v02FusionarArreglo
{
  // Fusionar dos listas clasificadas
  public static int Fusionar(String[] listaA, String[] listaB,
                             String[] listaC)
  {
    int ind = 0, indA = 0, indB = 0, indC = 0;

    if (listaA.length + listaB.length == 0)
      return 0;

    // Fusionar las listas A y B en la C
    while (indA < listaA.length && indB < listaB.length)
      if (listaA[indA].compareTo(listaB[indB]) < 0)
        listaC[indC++] = listaA[indA++];
      else
        listaC[indC++] = listaB[indB++];
    
    // Los dos bucles siguientes son para prever el caso de que,
    // l�gicamente una lista finalizar� antes que la otra.
    for (ind = indA; ind < listaA.length; ind++)
      listaC[indC++] = listaA[ind];
    
    for (ind = indB; ind < listaB.length; ind++)
      listaC[indC++] = listaB[ind];
    
    return 1;
  }
                            
  static public void main(String[] args)
  {
    // Iniciamos las listas a clasificar (puede sustituir este
    // proceso, por otro de lectura con el fin de tomar los
    // datos de la entrada est�ndar).
    String[] lista1 = { "Ana", "Carmen", "David",
                        "Francisco", "Javier", "Jes�s",
                        "Jos�", "Josefina", "Lu�s",
                        "Mar�a", "Patricia", "Sonia" };
    
    String[] lista2 = { "Agust�n", "Bel�n", "Daniel",
                        "Fernando", "Manuel",
                        "Pedro", "Rosa", "Susana" };
    
    // Declarar la matriz que va a almacenar el resultado de
    // fusionar las dos anteriores
    String[] lista3 = new String[lista1.length + lista2.length];
    
    // Fusionar lista1 y lista2 y almacenar el resultado en lista3.
    // El m�todo "Fusionar" devolver� un 0 cuando no se pueda
    // realizar la fusi�n.
    int ind, r;
    r = Fusionar(lista1, lista2, lista3);

    // Escribir la matriz resultante
    if (r != 0)
    {
      for (ind = 0; ind < lista3.length; ind++)
        System.out.println(lista3[ind]);
    }
    else
      System.out.println("Error");
  }
}
