package pe.aemsa.evalua.java8.view.thread;

//////////////////////////////////////////////////////////////////

import pe.aemsa.evalua.java8.logical.CD06v02SeccionCritica;
import pe.aemsa.evalua.java8.utilities.thread.CS06v02AdquirirSeccionCritica;

// Trabajar con secciones cr�ticas.
//
public class CV06v02TestSeccionCritica
{
  public static void main(String[] args)
  {
    CD06v02SeccionCritica oDatos = new CD06v02SeccionCritica(10);
    CS06v02AdquirirSeccionCritica oCSAdquirirDatos_0 = new CS06v02AdquirirSeccionCritica(oDatos);
    CS06v02AdquirirSeccionCritica oCSAdquirirDatos_1 = new CS06v02AdquirirSeccionCritica(oDatos);

    oCSAdquirirDatos_0.start();
    oCSAdquirirDatos_1.start();
  }
}

