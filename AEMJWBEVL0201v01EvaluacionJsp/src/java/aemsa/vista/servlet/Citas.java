package aemsa.vista.servlet;

// Citas.java

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Citas extends HttpServlet implements SingleThreadModel
{
  String dirDelFichResultante = null;

  public void init(ServletConfig config) throws ServletException
  {
    super.init(config);
    // Par�metro establecido en el fichero servlets.properties
    // del servidor
    dirDelFichResultante = getInitParameter("dirDelFichResultante");
    if (dirDelFichResultante == null)
    {
      System.err.println("Debe existir un par�metro");
    }
  }

  // M�todo doPost para responder a una petici�n POST
  public void doPost(HttpServletRequest req,
                     HttpServletResponse res)
      throws ServletException, IOException
  {	
    // Tipo de la respuesta que ser� enviada al cliente
    res.setContentType("text/html");

    // Obtener un 'PrintWriter' para devolver una respuesta
    // al solicitante
    PrintWriter solicitante = res.getWriter();
    try
    {
      // Abrir el fichero para el registro de citas
      FileWriter fw = new FileWriter(dirDelFichResultante
        + System.getProperty("file.separator")
        + "citas.txt", true);
      PrintWriter fichCitas = new PrintWriter(fw);

      // Tomar los datos recibidos del cliente y escribirlos
      // en el fichero. Delimitamos los registros por las marcas
      // <INICIO> y <FIN> para su posterior identificaci�n.
      fichCitas.println("<INICIO>");
      Enumeration nombresParams = req.getParameterNames();
      while (nombresParams.hasMoreElements())
      {
        String nombre = (String)nombresParams.nextElement();
        String valor = req.getParameterValues(nombre)[0];
        fichCitas.println(nombre + ": " + valor);
      }
      fichCitas.println("<FIN>");

      // Cerrar el fichero
      fichCitas.close(); 
      fw.close();

      // Responder al solicitante
      solicitante.println("<html>");
      solicitante.println("<title>Respuesta a la solicitud</title>");
      solicitante.println("Su cita ha sido registrada<BR>Un saludo");
      solicitante.println("</html>");

    }
    catch(IOException e)
    {
      solicitante.println("Hubo problemas cursando su solicitud." +
                          "<BR>Por favor, int�ntelo otra vez.");
    }
    // Cerrar el flujo
    solicitante.close();
  }

  // M�todo doGet para responder a una petici�n GET
  public void doGet(HttpServletRequest req,
                    HttpServletResponse res)
      throws ServletException, IOException
  {
    // Escriba aqu� su c�digo
  }	

  public void destroy()
  {
    // Liberar recursos
  }	
}
