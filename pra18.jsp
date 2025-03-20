<%-- 
    Document   : pra18
    Created on : 22 Feb, 2025, 11:32:55 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Number to String</title>
    </head>
    <body>
        <font color="green">
        <%
            String s1 = request.getParameter("num");
            int i = 0;
            do {
                char ch = s1.charAt(i);
                switch (ch) {
                    case '0':
                        out.println("zero");
                        break;
                    case '1':
                        out.println("one");
                        break;
                    case '2':
                        out.println("two");
                        break;
                    case '3':
                        out.println("three");
                        break;
                    case '4':
                        out.println("four");
                        break;
                    case '5':
                        out.println("five");
                        break;
                    case '6':
                        out.println("six");
                        break;
                    case '7':
                        out.println("seven");
                        break;
                    case '8':
                        out.println("eight");
                        break;
                    case '9':
                        out.println("nine");
                        break;
                }
                i++;
            } while (i < s1.length());
        %>
    </body>
</html>
