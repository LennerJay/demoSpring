<%@page language="java" isELIgnored="false"%>
<html>
    <head>
         <link rel="stylesheet" type="text/css" href="/views/style.css">
    </head>
    </body>
<%-- 	<h1>Result: <%= session.getAttribute("result") %></h1> --%>
	<h1>Result: ${result} </h1> 
	
	
	<p>dynamic value -> ${testDynamic}</p>
    </body>
</html>	