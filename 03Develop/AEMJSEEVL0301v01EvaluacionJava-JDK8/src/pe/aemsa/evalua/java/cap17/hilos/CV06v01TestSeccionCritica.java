package pe.aemsa.evalua.java.cap17.hilos;


import aemsa.cap15.hilos.sincronizar.CS06v01SeccionCritica;
import aemsa.cap15.hilos.thread.CS06v01AdquirirSeccionCritica;

//////////////////////////////////////////////////////////////////
// Trabajar con secciones cr�ticas.
//
public class CV06v01TestSeccionCritica
{
  public static void main(String[] args)
  {
    CS06v01SeccionCritica oDatoSeccionCritica = new CS06v01SeccionCritica(10);
    CS06v01AdquirirSeccionCritica oCSAdquirirDatos_0 = new CS06v01AdquirirSeccionCritica(oDatoSeccionCritica);
    CS06v01AdquirirSeccionCritica oCSAdquirirDatos_1 = new CS06v01AdquirirSeccionCritica(oDatoSeccionCritica);

    oCSAdquirirDatos_0.start();
    oCSAdquirirDatos_1.start();
  }
}
//////////////////////////////////////////////////////////////////
