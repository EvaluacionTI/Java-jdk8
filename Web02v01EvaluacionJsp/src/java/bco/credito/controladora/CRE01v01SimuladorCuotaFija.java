/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bco.credito.controladora;

import bco.credito.entidad.CEv0CronogramaCuotaFija;
import bco.credito.logica.CLv0Financiero;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CRE01v01SimuladorCuotaFija", urlPatterns = {"/SimuladorCuotaFijav01"})
public class CRE01v01SimuladorCuotaFija extends HttpServlet {

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
        
        Date oFechaSistema = new Date();
        SimpleDateFormat oFormatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        int opcion = request.getParameter("opcion") == null ? 1 : Integer.parseInt(request.getParameter("opcion"));

        System.out.print("Opcion: " + opcion);
        switch (opcion) {
            case 1:
                System.out.print(oFormatoFecha.format(oFechaSistema));

                request.getSession().setAttribute("mFechaEmision", oFormatoFecha.format(oFechaSistema));
                request.getSession().setAttribute("mTemIGV", 18.00);
                request.getSession().setAttribute("mTea", 25.00);
                request.getSession().setAttribute("mTemSD", 0.054);
                request.getSession().setAttribute("mTemDerEmiSD", 3.00);
                request.getSession().setAttribute("mPlazo", 24);
                request.getSession().setAttribute("mMontoComision", 4.50);
                request.getSession().setAttribute("mMontoGastos", 2.50);
                break;

            case 2:
                CEv0CronogramaCuotaFija oCECuotaFija = new CEv0CronogramaCuotaFija();

                String lStrFechaDesembolso = request.getParameter("txtFechaEmision");
                System.out.println("Fecha de Desembolso : " + lStrFechaDesembolso);

                try {
                    Date oDteFechaDesembolso = oFormatoFecha.parse(lStrFechaDesembolso);
                    System.out.println("Fecha de Desembolso : " + oFormatoFecha.format(oDteFechaDesembolso));

                    oCECuotaFija.setmFechaDesembolso(oDteFechaDesembolso);
                    oCECuotaFija.setmNumeroDiasFrecuencia(Integer.parseInt(request.getParameter("txtCboFrecuencia")));
                    oCECuotaFija.setmNumeroMesesGracia(Integer.parseInt(request.getParameter("txtNumeroMesesGracia")));

                    CLv0Financiero oCLFinanciero = new CLv0Financiero();
                    Date oDteFechaInicioPago = oCLFinanciero.fechaInicioPagoCuotaFija(oCECuotaFija);

                    System.out.println("Fecha Inicio Pago : " + oFormatoFecha.format(oDteFechaInicioPago));

                    oCECuotaFija.setmFechaInicioPago(oDteFechaInicioPago);
                    oCECuotaFija.setmTea(Double.parseDouble(request.getParameter("txtTea")));
                    oCECuotaFija.setmPlazo(Integer.parseInt(request.getParameter("txtPlazo")));

                    oCECuotaFija.setmNumeroDiasBaseCalculo(Integer.parseInt(request.getParameter("txtCboBaseCalculo")));

                    List<CEv0CronogramaCuotaFija> oLstCronograma;
                    oLstCronograma = oCLFinanciero.factoresCuotaFijav0(null);

                    System.out.println(oLstCronograma);

                    request.getSession().setAttribute("mListaCronograma", oLstCronograma);

                } catch (Exception ex) {
                }

                break;
        }

        String lNombreVistaJsp = "CRE01v01SimuladorCuotaFija.jsp";
        
        response.sendRedirect("./bco/credito/"+ lNombreVistaJsp);

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
