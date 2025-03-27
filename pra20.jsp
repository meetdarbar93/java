<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
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

