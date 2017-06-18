package localhost.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import localhost.model.NameType;

/**
 * Created by lbuthman on 6/17/17.
 *
 */

public class NameInput extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String type = request.getParameter("type");
        String message = "";

        switch (type.toLowerCase()) {
            case "vampire":
                message = NameType.VAMPIRE.welcomeType(name);
                break;
            case "demi-god":
                message = NameType.DEMI_GOD.welcomeType(name);
                break;
            case "spirit":
                message = NameType.SPIRIT.welcomeType(name);
                break;
            case "morphing-entity":
                message = NameType.MORPHING_ENTITY.welcomeType(name);
        }

        out.print(message);

    }
}
