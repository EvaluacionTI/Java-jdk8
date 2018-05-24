package aemsa.cap15.hilos;

//////////////////////////////////////////////////////////////////

import aemsa.cap15.hilos.modelo.CD06v02SeccionCritica;
import aemsa.cap15.hilos.thread.CS06v02AdquirirSeccionCritica;

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

