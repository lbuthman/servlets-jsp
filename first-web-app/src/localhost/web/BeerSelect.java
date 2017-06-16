package localhost.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import localhost.model.*;

/**
 * Created by lbuthman on 6/15/17.
 * control class
 */
public class BeerSelect extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {

        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Beer Selection Advice<br>");

        for (Object r: result) {
            out.print("<br>try: " + r);
        }

        //out.println("<br>Got beer color " + c);
    }
}
