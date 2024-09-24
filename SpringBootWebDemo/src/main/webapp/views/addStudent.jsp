<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="/views/style.css">
    </head>
    </body>
        <h2> Add Student</h2>

         <form action="saveStudent">
                <label for="id">Enter ID :</label>
                <input type="text" id=id" name="id"><br>
                <label for="name">Enter Name :</label>
                <input type="text" id="name" name="name"><br>
                <input type="submit" value="Submit">
            </form>

    </body>
</html>