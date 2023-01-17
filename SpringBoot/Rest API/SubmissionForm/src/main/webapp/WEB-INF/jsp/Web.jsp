<h2>From JSP page </h2>
<%@ page language="java"
    contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<body>
    1. Setup the required dependencies in pom.xml
    <br/>
    2. Manually setup View and port details in application.properties
    <br/>
    3. Finally in ControllerClass.java, input Model and pass the details to View.
    <br/>

    Message : ${msg}
    <form action="addCustomers">
        <input type="text" name="cid"><br>
        <input type="text" name="cname"><br>
        <input type="text" name="cemail"><br>
        <input type="submit"><br>
    </form>
</body>
</html>