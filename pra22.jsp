<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.io.*,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Count Visitor</title>
    </head>
    <body>
        <form>
            <fieldset style="width: 20%;background: #e6ffe6">
                <legend>Visit Counter</legend>
                <%
                    // Retrieve visitor count from application scope
                    Integer hc = (Integer) application.getAttribute("hitCounter");
                    if (hc == null) {
                        hc = 1; // Set initial count
                        out.println("<h3>Welcome to My Website ....!</h3>");
                    } else {
                        hc++; // Increment count for returning visitors
                        out.println("<h3>Welcome back to my website</h3>");
                    }

                    // Store updated count back in application scope
                    application.setAttribute("hitCounter", hc);
                %>
                <p>Your visit number: <strong><%= hc%></strong></p>
            </fieldset>
        </form>
    </body>
</html>

