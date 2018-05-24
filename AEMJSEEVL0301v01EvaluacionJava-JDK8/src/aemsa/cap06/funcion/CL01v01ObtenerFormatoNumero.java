package aemsa.cap06.funcion;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.util.Locale;

public class CL01v01ObtenerFormatoNumero
{
  static public String FormatoLocal(double dato)
  {
    NumberFormat formato = NumberFormat.getCurrencyInstance();
    String salida = formato.format(dato);
    return salida;
  }

  static public String FormatoPer(String patron, double dato)
  {
    DecimalFormat formato = new DecimalFormat(patron);
    String salida = formato.format(dato);
    return salida;
  }

  static public StringBuffer AlinDer(String patron, double dato)
  {
    FieldPosition fp = new FieldPosition(NumberFormat.FRACTION_FIELD);
    DecimalFormat formato = new DecimalFormat(patron);
    StringBuffer salida = new StringBuffer();
    formato.format(dato, salida, fp);
    for (int i = 0; i < (patron.length() - fp.getEndIndex()); i++)
      salida.insert(0, ' ');
    return salida;
  }

  static public String FormatoPais(String patron, double dato, Locale lugar)
  {
    DecimalFormat df = (DecimalFormat)DecimalFormat.getNumberInstance(lugar);
    df.applyPattern(patron);
    String salida = df.format(dato);
    return salida;
  }
}
