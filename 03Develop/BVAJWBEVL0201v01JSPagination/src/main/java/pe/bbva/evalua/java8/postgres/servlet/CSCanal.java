package pe.ias.bbva.evalua.java8.postgres.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.ias.bbva.evalua.java8.postgres.entity.CECanal;
import pe.ias.bbva.evalua.java8.postgres.entity.CEConstDataBase;
import pe.ias.bbva.evalua.java8.postgres.entity.CEPagination;
import pe.ias.bbva.evalua.java8.postgres.entity.CEPaginationLink;
import pe.ias.bbva.evalua.java8.postgres.model.impl.CDCanalEmbebido;

public class CSCanal extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Long currentPage = (request.getParameter("vCurrentPage")==null) ? CEConstDataBase.DF_CURRENT_PAGE:Long.valueOf(request.getParameter("vCurrentPage"));;
        Long recordByPage = (request.getParameter("vRecordPage")==null)? CEConstDataBase.DF_RECORD_PAGE: Long.valueOf(request.getParameter("vRecordPage"));
        
        CDCanalEmbebido oCDCanal = new CDCanalEmbebido();
        List<CECanal> oListCanal = oCDCanal.getChannelByPaginationWithList(recordByPage, currentPage);
        
        Long numbeTotalRows = oCDCanal.getNumberOfRecord();
        CEPagination oCEPagination = createPagination(recordByPage, currentPage, numbeTotalRows);
        
        request.setAttribute("vListCanal", oListCanal);
        request.setAttribute("vPagination", oCEPagination);
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CSCanal</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CSCanal at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        processRequest(request, response);
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

    
    private CEPagination createPagination(Long pRecordByPage, Long pCurrentPage, Long pNumbeTotalRows){
        String queryPagination = "%s?pageSize=%d&paginationKey=%d";

        CEPagination oCEPagination = new CEPagination();
        CEPaginationLink oCEPaginationLink = new CEPaginationLink();
        
        Long lFirst = 0L;
	Long lNext = pCurrentPage + 1;
	int lLast = (int) Math.ceil(pNumbeTotalRows / pRecordByPage); // page: 0, 1, 2, 3 ,4 ,5, 6, ...
	Long lPrevious = pCurrentPage - 1;

        oCEPaginationLink.setFirst(0L);
        if (lNext < Long.valueOf(lLast)){
            oCEPaginationLink.setNext(lNext);
        }
        if (lPrevious>0){
            oCEPaginationLink.setPrevious(lPrevious);
        }
        oCEPaginationLink.setLast(Long.valueOf(lLast));
        
        Long numberOfPages = pNumbeTotalRows / pRecordByPage;
        if ((numberOfPages % pRecordByPage)>0){
            numberOfPages++;
        }
        oCEPagination.setCurrentPage(pCurrentPage);
        oCEPagination.setNumberPage(numberOfPages);
        oCEPagination.setRecordPage(pRecordByPage);
        oCEPagination.setNumberRows(pNumbeTotalRows);
        
        oCEPagination.setoCEPagiationLink(oCEPaginationLink);
        
        return oCEPagination;
    }
}
