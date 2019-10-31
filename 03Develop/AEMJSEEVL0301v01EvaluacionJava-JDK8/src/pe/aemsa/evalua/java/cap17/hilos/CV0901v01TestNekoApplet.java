package pe.aemsa.evalua.java.cap17.hilos;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class CV0901v01TestNekoApplet extends Applet implements Runnable
{
  Image neko_img[] = new Image[9];
  Image imgActual;
  int pos_x = 0;
  int pos_y = 0;
  Thread neko;

  public void init() 
  {
    // Cargar los nombres de los ficheros gif en una matriz
    String neko_gif[] = {"pararse.gif", "bostezar.gif",
                         "dormirse1.gif", "dormirse2.gif",
                         "despertarse.gif", "arrascarse1.gif",
                         "arrascarse2.gif", "correr1.gif",
                         "correr2.gif"};
    // Cargar las im�genes en una matriz
    System.out.println(getDocumentBase());
    // Colocar el archivo html en:
    // file:D:/2017/04-LanguajeProgram/Java/JSE01EvaluacionJavaJSE/build/CV0901v01TestNekoApplet.html
    
    // Colocar las imagene en build: de aemsa.cap15.hilos.recursos en :
    //file:D:/2017/04-LanguajeProgram/Java/JSE01EvaluacionJavaJSE/build/recursos
    for (int i=0; i < neko_img.length; i++)
    {
      neko_img[i] = getImage(getDocumentBase(),
                             "recursos/" + neko_gif[i]);
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
  
      // CV0901v01TestNekoApplet se para
      imgActual = neko_img[0];
      repaint();
      pausa(1500);
  
      // Bosteza
      imgActual = neko_img[1];
      repaint();
      pausa(1500);
  
      // Duerme
      nekoDuerme();
  
      // Despierta
      imgActual = neko_img[4];
      repaint();
      pausa(1500);
  
      // Se arrasca
      nekoSeArrasca();
      
      // CV0901v01TestNekoApplet corre
      nekoCorre();
    }
  }

  void nekoDuerme()
  {
    for (int i = 0; i < 10; i++)
    {
      imgActual = neko_img[2];
      repaint();
      pausa(300);
      imgActual = neko_img[3];
      repaint();
      pausa(300);
    }
  }

  void nekoSeArrasca()
  {
    for (int i = 0; i < 6; i++)
    {
      imgActual = neko_img[5];
      repaint();
      pausa(150);
      imgActual = neko_img[6];
      repaint();
      pausa(150);
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
      if (imgActual == neko_img[7])
        imgActual = neko_img[8];
      else imgActual = neko_img[7];
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