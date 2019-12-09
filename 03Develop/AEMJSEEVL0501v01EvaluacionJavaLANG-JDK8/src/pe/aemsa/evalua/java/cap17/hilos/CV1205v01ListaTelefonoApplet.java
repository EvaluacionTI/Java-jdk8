package pe.aemsa.evalua.java.cap17.hilos;

import java.applet.Applet;
import java.awt.Graphics;


public class CV1205v01ListaTelefonoApplet extends Applet
{
  private String correo_e;
  private long telefono;
  
  public void init()
  {
    correo_e = getParameter("CORREO_E");
    if (correo_e == null) correo_e = "@";
    String stel = getParameter("TELEFONO");
    if (stel == null) stel = "0";
    telefono = Long.parseLong(stel);
  }
  
  public void paint(Graphics g)
  {
    g.drawString("Correo electr�nico: " + correo_e, 10, 20);
    g.drawString("Telefono:           " + telefono, 10, 40);
  }
}
