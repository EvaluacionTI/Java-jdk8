package aemsa.cap09.clase;

import java.util.Calendar;
import java.util.GregorianCalendar;
/////////////////////////////////////////////////////////////////
// Definici�n de la clase CFecha
//
public class CO02v02DefinicionFecha
{
  // Atributos
  private int dia, mes, ano;
  
  // M�todos
  public CO02v02DefinicionFecha() // constructor sin argumentos
  {
    asignarFecha(); // asignar fecha actual
  }
  
  public CO02v02DefinicionFecha(int dd) // constructor con un argumento
  {
    //asignarFecha(); // asignar fecha actual
    this(); // invoca al constructor CFecha sin argumentos
    dia = dd;
    if (!fechaCorrecta())
    {
      System.out.println("Fecha incorrecta. Se asigna la actual.");
      asignarFecha();
    }
  }
  
  public CO02v02DefinicionFecha(int dd, int mm) // constructor con dos argumentos
  {
    asignarFecha(); // asignar fecha actual
    dia = dd; mes = mm;
    if (!fechaCorrecta())
    {
      System.out.println("Fecha incorrecta. Se asigna la actual.");
      asignarFecha();
    }
  }
  
  public CO02v02DefinicionFecha(int dd, int mm, int aaaa) // constructor con tres argumentos
  {
    dia = dd; mes = mm; ano = aaaa;
    if (!fechaCorrecta())
    {
      System.out.println("Fecha incorrecta. Se asigna la actual.");
      asignarFecha();
    }
  }
  
  public CO02v02DefinicionFecha(CO02v02DefinicionFecha obj) // constructor copia
  {
    dia = obj.dia;
    mes = obj.mes;
    ano = obj.ano;
  }
  
  protected void finalize() throws Throwable // destructor
  {
    System.out.println("Objeto destruido");
  }
  
  protected boolean bisiesto()
  {
    return ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0));
  }
  
  public final void asignarFecha()
  {
    // Asignar, por omisi�n, la fecha actual.
    GregorianCalendar fechaActual = new GregorianCalendar();
    dia = fechaActual.get(Calendar.DAY_OF_MONTH);
    mes = fechaActual.get(Calendar.MONTH)+1;
    ano = fechaActual.get(Calendar.YEAR);
  }
  
  public void asignarFecha(int dd)
  {
    asignarFecha();
    dia = dd;
  }
  
  public void asignarFecha(int dd, int mm)
  {
    asignarFecha();
    dia = dd; mes = mm;
  }
  
  public void asignarFecha(int dd, int mm, int aaaa)
  {
    dia = dd; mes = mm; ano = aaaa;
  }

  public void obtenerFecha(int[] fecha)
  {
    fecha[0] = dia;
    fecha[1] = mes;
    fecha[2] = ano;
  }
  
  public boolean fechaCorrecta()
  {
    boolean diaCorrecto, mesCorrecto, anoCorrecto;
    // �a�o correcto?
    anoCorrecto = (ano >= 1582);
    // �mes correcto?
    mesCorrecto = (mes >= 1) && (mes <= 12);
    switch (mes)
    // �d�a correcto?
    {
      case 2:
        if (bisiesto())
          diaCorrecto = (dia >= 1 && dia <= 29);
        else
          diaCorrecto = (dia >= 1 && dia <= 28);
        break;
      case 4: case 6: case 9: case 11:
        diaCorrecto = (dia >= 1 && dia <= 30);
        break;
      default:
        diaCorrecto = (dia >= 1 && dia <= 31);
    }
    return diaCorrecto && mesCorrecto && anoCorrecto;
  }

  public CO02v02DefinicionFecha copiar(CO02v02DefinicionFecha obj)
  {
    dia = obj.dia;
    mes = obj.mes;
    ano = obj.ano;
    return this;
  }
}