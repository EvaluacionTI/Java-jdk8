package pe.aemsa.evalua.java.cap17.hilos;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class CV1001v01TestNekoAppletCorre extends Applet implements Runnable
{
  Image neko_img[] = new Image[3];
  Image imgActual;
  int pos_x = 0;
  int pos_y = 0;
  Thread neko;

  public void init() 
  {
    // Cargar los nombres de los ficheros gif en una matriz
    String neko_gif[] = {"pararse.gif", "correr1.gif", "correr2.gif"};
    // Cargar las im�genes en una matriz
    for (int i=0; i < neko_img.length; i++)
    {
      neko_img[i] = getImage(getDocumentBase(),
                             "Recursos/" + neko_gif[i]);
    }
    // Posici�n de partida: centro de la pantalla
    pos_x = getSize().width / 2;
    pos_y = getSize().height / 2;
  }

  public void start()
  {
    if (neko == null)
    {
      neko = new Thread(this); // crear el hilo
      neko.start();            // lanzar el hilo
    }
  }
    
  public void stop()
  {
    neko = null;
  }

  public void run()
  {
    Thread hiloActual = Thread.currentThread();
    while (neko == hiloActual)
    {    
      setBackground(Color.white); // limpia el �rea de dibujo
  
      // CV1001v01TestNekoAppletCorre se para
      imgActual = neko_img[0];
      repaint();
      pausa(1500);
  
      // CV1001v01TestNekoAppletCorre corre
      nekoCorre();
    }
  }

  void nekoCorre()
  {
    for (int i = 0; i < 12; i ++)
    {
      if (pos_x+10 > getSize().width)
        pos_x = 0;
      else
        pos_x += 10;
      // Intercambiar im�genes
      if (imgActual == neko_img[1])
        imgActual = neko_img[2];
      else imgActual = neko_img[1];
      repaint();
      pausa(150);
    }
  }

  void pausa(int tiempo)
  {
    try
    {
      Thread.sleep(tiempo);
    }
    catch (InterruptedException ignorada) { }
  }

  public void paint(Graphics g)
  {
    if (imgActual != null)
      g.drawImage(imgActual, pos_x, pos_y, this);
  }
}