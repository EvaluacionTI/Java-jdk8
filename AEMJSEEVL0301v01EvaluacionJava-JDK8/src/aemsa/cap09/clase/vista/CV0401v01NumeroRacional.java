package aemsa.cap09.clase.vista;

class CV0401v01NumeroRacional
{
      int Numerador;
      int Denominador;

      void AsignarDatos(int num, int den)
      {
        Numerador = num;
        if (den == 0) den = 1; // el denominador no puede ser cero
        Denominador = den;
      }

      void VisualizarRacional()
      {
        System.out.println(Numerador + "/" + Denominador);
      }

      public static void main (String[] args)
      {
        // Punto de entrada a la aplicaci�n

        System.out.println("En la misma clase principal se incluye una clase secundaria");
        CV0401v01NumeroRacional or1 = new CV0401v01NumeroRacional(); // crear un objeto Apl03_01CRacional

        or1.AsignarDatos(2, 5);
        or1.VisualizarRacional();
      }
}