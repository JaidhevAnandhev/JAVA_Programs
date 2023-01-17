<h2>From JSP page </h2>
<%@ page language="java"
    contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<body>
    <form method="post" action="details">
        Enter Customer Name : <input type="text" name="cname"><br/>
        Enter Customer Id : <input type="text" name="cid"><br/>
        Enter Customer Email : <input type="email" name="cemail"><br/>
        <input type="submit" value="Submit">
    </form>
</body>
</html>