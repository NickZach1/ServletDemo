/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uclan.co4752;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Li GUo
 */
@WebServlet(name = "MyFirstServlet", urlPatterns =
{
    "/MyFirstServlet"
})
public class MyFirstServlet extends HttpServlet
{

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
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        try
        {
            /* TODO output your page here. You may use following sample code. */
            String userName = request.getParameter("username");
            if (userName != null)
            {
                Vector<User> users = new DBConnector().getUserDetails(userName);
                 out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet MyFirstServlet</title>");
                out.println("</head>");
                out.println("<body>");
                for(User user: users)
                {
                     out.println("<h1>Given username is:"+user.getUserName()+"</h1>");
                     out.println("<h1>Firstname is:"+user.getFirstName()+"</h1>");
                     out.println("<h1>Lastname is:"+user.getLastName()+"</h1>");
                }
                out.println("</body>");
                out.println("</html>");
            } else
            {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet MyFirstServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet MyFirstServlet at " + request.getContextPath() + "</h1>");
                out.println("<h1>The required parameter username is NULL</h1>");
                out.println("</body>");
                out.println("</html>");
            }
        } finally
        {
            out.close();
        }
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
            throws ServletException, IOException
    {
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
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>
}
