<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <jsp:include page="masterPage.jsp"></jsp:include>
    </head>
    <body>
       <jsp:include page="header.jsp"></jsp:include>
        <div class="container body-content" >

        <h1>Hello World!</h1>
        <p>This is the homepage!</p>
        <input class="btn btn-default" type="button" value="hh">
        <jsp:include page="footer.jsp"></jsp:include>
        </div>
    </body>
</html>