<%-- 
    Document   : pra20
    Created on : 22 Feb, 2025, 11:39:44 PM
    Author     : LENOVO
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="javax.servlet.http.HttpServletResponse" %>
<%@ page import="javax.servlet.ServletException" %>
<%@ page import="java.io.*,java.util.*" %>
<%
    MultipartRequest m = new MultipartRequest(request, "D:/");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload File</title>
    </head>
    <body>
        <h2>File Uploaded Successfully</h2>
    </body>
</html>

