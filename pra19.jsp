<%-- 
    Document   : pra19
    Created on : 22 Feb, 2025, 11:35:47 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Strings </title>
    </head>
    <body style="background-color: aqua">
        <h1>Getting a length of String</h1>
        <%
            String str = "Sardar Patel University";
            out.println("\"" + str + "\"" + "is of :" + str.length() + "characters");
        %><br><br>
        <%
            out.println("Original String is : " + str);
        %><br><br>
        <%
            out.println("String after replacing 'p' with 'r' : " + str.replace('P', 'r'));
        %><br><br>
        <%
            out.println("\"" + str + "\"" + "=" + str.toUpperCase());
        %><br><br>
        <%
            out.println(str.substring(7, 23));
        %>
    </body>
</html>
