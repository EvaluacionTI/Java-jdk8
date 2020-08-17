/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.vista.servlet.formulario;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CV01v01IniciarMostrarEnServlet extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();

        String login = request.getParameter("mTxtLogin");
	String password = request.getParameter("mPwdClave");

	String boton2 = request.getParameter("mBtnOk");
	String boton3 = request.getParameter("mBtnSalir");
   
        out.println("<HTML>\n" +
                "<HEAD><title>.....[ Evaluación JSP ].....</title></HEAD>\n" +
                "<BODY>\n" +
                "<H1>Arrengamiento Financiero</H1>\n" +
		"<P><H2>Se obtuvieron los siguientes datos</H2></P>\n" +
		"<P>Login:  " + login + "</P>\n" +
		"<P>Password:  " + password + "</P>\n" +
		"<P>Boton Acceso: " + boton2 + "</P>\n" +
		"<P>Boton Salir: " + boton3 + "</P>\n" +
                "</BODY></HTML>");

        out.close();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
    * Handles the HTTP <code>GET</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
    * Handles the HTTP <code>POST</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
    * Returns a short description of the servlet.
    */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
