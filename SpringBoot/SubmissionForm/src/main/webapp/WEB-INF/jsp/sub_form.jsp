<h2>From JSP page </h2>
<%@ page language="java"
    contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<body>
    <form method="post" action="details">
        Enter Customer Name : <input type="text" name="cname">
        Enter Customer Id : <input type="text" name="cid">
        Enter Customer Email : <input type="email" name="cemail">
        <input type="submit" value="Submit">
    </form>
</body>
</html>