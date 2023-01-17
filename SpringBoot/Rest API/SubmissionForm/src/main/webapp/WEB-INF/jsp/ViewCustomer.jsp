<h2>From JSP page </h2>
<%@ page language="java"
    contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WebView  Database Connect</title>
<body>
    <h1>VIEW CUSTOMER DETAILS</h1>
    <h2>These are the given customer details</h2>
    <form action="getdetails" method="post">
    <input type="number" name="cid">
    <input type="submit" value="Submit">
</body>

</html>
</head>