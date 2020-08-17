/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.vista.servlet.sqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CDRegistrarVoto extends HttpServlet {
    private Connection con;
    PreparedStatement actualizaVotos, totalizaVotos, resultado;

    @Override
    public void init() throws ServletException {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  //conexcion tipo I
            con = DriverManager.getConnection("jdbc:sqlserver://INVERTEC\\MSQLEXPRESS:2027;databaseName=AMPERCRUZBLANCA");
            System.out.println("Conexion realizada");
            actualizaVotos=con.prepareStatement("UPDATE candidatos set votos=votos+1 where id=?");
            totalizaVotos=con.prepareStatement("SELECT sum(votos) FROM candidatos");
            resultado=con.prepareStatement("SELECT nombre, votos, id FROM candidatos");
        }
        catch (ClassNotFoundException | SQLException ex) {
            ex.getMessage();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        DecimalFormat dosDigitos=new DecimalFormat("0.00");
        int valor=Integer.parseInt(request.getParameter("opcion"));
        try {
            actualizaVotos.setInt(1,valor);
            actualizaVotos.executeUpdate();
            ResultSet totalRS=totalizaVotos.executeQuery();
            totalRS.next();
            int total=totalRS.getInt(1);
            ResultSet rs=resultado.executeQuery();

            PrintWriter out = response.getWriter();
            response.setContentType("text/html");

            out.println("<html><body>");
            out.println("Resultado<p>");
            int votos;
            while(rs.next()) {
                out.println(rs.getString(1)+"\t");
                votos=rs.getInt(2);
                out.println(dosDigitos.format((double)votos/total*100));
                out.println("%\t votos"+votos+"<p>");
            }
            rs.close();
            out.println("total de votantes : "+total);
            out.println("</body></html>");
        }
        catch(SQLException  ex) {
            ex.getSQLState();
        }
    }

    @Override
    public void destroy() {
        try {
            actualizaVotos.close();
            totalizaVotos.close();
            resultado.close();
            con.close();
        }
        catch(SQLException ex) {
            ex.getSQLState();
        }
    }
}
