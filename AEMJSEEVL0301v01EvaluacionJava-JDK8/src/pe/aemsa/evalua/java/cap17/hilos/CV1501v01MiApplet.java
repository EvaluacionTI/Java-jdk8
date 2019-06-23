package pe.aemsa.evalua.java.cap17.hilos;

// necesaria para Graphics

import java.applet.Applet;
import java.awt.Graphics;
import java.util.StringTokenizer;

// necesaria para Applet
// necesaria para StringTokenizer

public class CV1501v01MiApplet extends Applet
{
  private StringBuffer texto_a_mostrar;
  
  private void anadir(String str)
  {
    texto_a_mostrar.append(str);
    repaint();
  }
  
  // Punto de entrada 
  public void init()
  {
    texto_a_mostrar = new StringBuffer();
    anadir("Iniciando el applet ...,");
  }
  
  public void start()
  {
    anadir("Arrancando el applet ...,");
  }
  
  public void stop()
  {
    anadir("Deteniendo el applet ...,");
  }
  
  public void paint(Graphics g)
  {
    // Dibujar un rect�ngulo alrededor del contenedor
    g.draw3DRect(0, 0, getSize().width-1, getSize().height-1,false);
    // Dibujar el texto que hay actualmente en texto_a_mostrar
    // poniendo cada frase debajo de la anterior
    StringTokenizer cadena;
    cadena = new StringTokenizer(texto_a_mostrar.toString(), ",");
    int i = 1;
    while (cadena.hasMoreTokens())
    {
      g.drawString(cadena.nextToken(), 10, 20*i);
      i++;
    }
  }
}
