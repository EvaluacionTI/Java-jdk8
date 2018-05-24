/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bco.credito.controladora;

import aemsa.controladora.CCBaseCalculo;
import aemsa.controladora.CCFrecuencia;
import aemsa.controladora.CCMoneda;
import bco.credito.entidad.CEBaseCalculo;
import aemsa.entidad.CEFrecuencia;
import aemsa.entidad.CEMoneda;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author background21
 */
@WebServlet(name = "CRE01v02SimuladorCuotaFija", urlPatterns = {"/SimuladorCuotaFija"})
public class CRE01v02SimuladorCuotaFija extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        int opcion = request.getParameter("opcion") == null ? 1 : Integer.parseInt(request.getParameter("opcion").toString());
        switch (opcion) {
            case 1:
                Date oFechaSistema = new Date();
                SimpleDateFormat oFormatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                System.out.print(oFormatoFecha.format(oFechaSistema));

                List<CEMoneda> oCCComboMoneda = CCMoneda.cargarTablaMonedav1();
                request.getSession().setAttribute("oLstComboMoneda", oCCComboMoneda);

                List<CEBaseCalculo> oCCComboBaseCalculo = CCBaseCalculo.cargarTablaBaseCalculov1();
                request.getSession().setAttribute("oLstComboBaseCalculo", oCCComboBaseCalculo);

                List<CEFrecuencia> oCCComboFrecuencia = CCFrecuencia.cargarTablaFrecuenciav1();
                System.err.println(oCCComboFrecuencia.size());
                request.getSession().setAttribute("oLstComboFrecuencia", oCCComboFrecuencia);

                request.getSession().setAttribute("mFechaEmision", oFormatoFecha.format(oFechaSistema));
                request.getSession().setAttribute("mTea", 25.00);
                request.getSession().setAttribute("mPlazo", 24);
                request.getSession().setAttribute("mMontoComisión", 4.50);
                request.getSession().setAttribute("mMontoGastos", 2.50);
                break;

            case 2:
            
                //List<CEv0CronogramaCuotaFija> oCCCronograma = new CLFinanciero().cronogramaCuotaFija()
                
                break;
        }

        String lNombreVistaJsp = "CRE01v02SimuladorCuotaFija.jsp";
        response.sendRedirect("./cap20BaseDatos/jsp03v01SimuladorCuotaFija.jsp");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);



    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
