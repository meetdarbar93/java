<%-- 
    Document   : pra17
    Created on : 22 Feb, 2025, 11:30:45 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practical 17</title>
        
    </head>
    <body>
        <form>
            <fieldset style="background-color:yellowgreen;width:20%;">
                <legend><b><i> Application </i></b></legend>
                <h3> Current Date & Time is : </h3>
                <%
                    java.util.Date d = new java.util.Date();
                    out.println(d.toString());
                    
                   %>
           </fieldset>
        </form>
    </body>
</html>