<%-- 
    Document   : pra21
    Created on : 22 Feb, 2025, 11:41:44 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.io.*,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Auto Refresh</title>
    </head>
    <body>
    <center>
        <form>
            <fieldset style="width:20%;background: #e6ffe6">
                <legend>Auto Refresh</legend>
                <h2>Auto Refresh Example</h2>
                <%
                    response.setHeader("Refresh", "1");
                    Calendar c = new GregorianCalendar();
                    String am_pm;
                    int hours = c.get(Calendar.HOUR);
                    int minutes = c.get(Calendar.MINUTE);
                    int seconds = c.get(Calendar.SECOND);
                    if (c.get(Calendar.AM_PM) == 0) {
                        am_pm = "AM";
                    }else{
                        am_pm = "PM";
                    }
                    String CT = hours+" : "+minutes+ " : " + seconds + " "+ am_pm;
                    out.println(CT);
                %>
            </fieldset>
        </form>
    </center>
</body>
</html>

