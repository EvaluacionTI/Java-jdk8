package aemsa.cap06.funcion;

import aemsa.cap06.funcion.CL01v01ObtenerFormatoNumero;
import java.io.PrintStream;
import java.util.Locale;

public class CV01v01FormatoNumeroFlujo
{
  static public void main(String[] args)
  {
    PrintStream flujoS = System.out;
    
    flujoS.println(CL01v01ObtenerFormatoNumero.FormatoLocal(123456));
    flujoS.println(CL01v01ObtenerFormatoNumero.FormatoLocal(123456.789));
    flujoS.println(CL01v01ObtenerFormatoNumero.FormatoLocal(123.45));
    flujoS.println();

    flujoS.println(CL01v01ObtenerFormatoNumero.FormatoPer("###,###.##", 123456));
    flujoS.println(CL01v01ObtenerFormatoNumero.FormatoPer("########", 123456));
    flujoS.println(CL01v01ObtenerFormatoNumero.FormatoPer("###.##", 123456.789));
    flujoS.println(CL01v01ObtenerFormatoNumero.FormatoPer("000000.000", 123.45));
    flujoS.println(CL01v01ObtenerFormatoNumero.FormatoPer("$###,###.###", 12345.67));
    flujoS.println(CL01v01ObtenerFormatoNumero.FormatoPer("###,###.###", 12.34));
    flujoS.println();

    String patron;
      patron = "###,###,##0.00";
    flujoS.println(CL01v01ObtenerFormatoNumero.AlinDer(patron, 1.234));
    flujoS.println(CL01v01ObtenerFormatoNumero.AlinDer(patron, 12.345));
    flujoS.println(CL01v01ObtenerFormatoNumero.AlinDer(patron, -123.456));
    flujoS.println(CL01v01ObtenerFormatoNumero.AlinDer(patron, 123.456));
    flujoS.println(CL01v01ObtenerFormatoNumero.AlinDer(patron, 1234.567));
    flujoS.println(CL01v01ObtenerFormatoNumero.AlinDer(patron, 12345.678));
    flujoS.println(CL01v01ObtenerFormatoNumero.AlinDer(patron, -12345));
    flujoS.println();

    Locale[] pais =
    {
      new Locale("es", "ES"),
      new Locale("en", "US"),
    };
    for (int i = 0; i < pais.length; i++)
      flujoS.println(CL01v01ObtenerFormatoNumero.FormatoPais("###,###.###", 123456.789, pais[i]));
  }
}
