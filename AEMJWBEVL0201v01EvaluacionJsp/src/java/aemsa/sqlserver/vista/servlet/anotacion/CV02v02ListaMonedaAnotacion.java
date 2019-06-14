/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.sqlserver.vista.servlet.anotacion;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import aemsa.sqlserver.controladora.CCVTAt04_Moneda;
import aemsa.sqlserver.entidad.CEVTAt04_Moneda;

/**
 *
 * @author ALDV
 */
@WebServlet(name = "CV02v02ListaMonedaAnotacion", urlPatterns = {"/ListaMonedaAnotacion"})
public class CV02v02ListaMonedaAnotacion extends HttpServlet {
    private static final Logger moLog = LogManager.getLogger(CV02v02ListaMonedaAnotacion.class);
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {

        String lsNombreJsp = "jsp02v02ListaMonedaAnotacion.jsp";
        String lsUrl = "./cap20BaseDatos/SQLServer/servlet/" + lsNombreJsp;
        String lsNombreDOMServlet = "oLstMonedaDOMAnotacion";
        
        response.setContentType("text/html;charset=UTF-8");
        try{
            List<CEVTAt04_Moneda> oListaMoneda = CCVTAt04_Moneda.cargarTablaMonedaColeccion();
            moLog.info("Cantidad de registros ----> " + oListaMoneda.size());
            
            request.getSession().setAttribute(lsNombreDOMServlet, oListaMoneda);
            response.sendRedirect(lsUrl);
        }catch(SQLException ex){
            moLog.debug("Error en conexion ----->", ex.getLocalizedMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        moLog.info("Ingreso por Get x request ----->", request.getClass());
        moLog.info("Ingreso por Get x response ----->", response.getStatus());
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            moLog.debug("Error en conexion ----->", ex.getLocalizedMessage());
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        moLog.info("Ingreso por Post x request ----->", request.getClass());
        moLog.info("Ingreso por Post x response ----->", response.getStatus());        
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            moLog.debug("Error en conexion ----->", ex.getLocalizedMessage());
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
