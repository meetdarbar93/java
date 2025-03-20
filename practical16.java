/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LENOVO
 */
@WebServlet(urlPatterns = {"/practical16"})
public class practical16 extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int n = Integer.parseInt(request.getParameter("choice"));
            int val = Integer.parseInt(request.getParameter("value"));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet practical16</title>");
            out.println("</head>");
            out.println("<body>");
            switch (n) {
                case 1:
                    if (val > 0) {
                        out.println("<h2>The number is positive</h2>");
                    } else if (val < 0) {
                        out.println("<h2>The number is negative</h2>");
                    } else {
                        out.println("<h2>The number is zero</h2>");
                    }

                    break;
                case 2:
                    if (val % 2 == 0) {
                        out.println("<h2>The number is even</h2>");
                    } else {
                        out.println("<h2>The number is odd</h2>");

                    }
                    break;
                case 3:
                    if (val == 2 || val == 3 || val == 5 || (val > 1 && val % 2 != 0 && val % 3 != 0 && val % 5 != 0)) {
                        out.println("<h2>number " + val + " is prime<h2>");
                    } else {
                        out.println("<h2>number " + val + " is not prime</h2>");
                    }
                    break;

                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
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

}
