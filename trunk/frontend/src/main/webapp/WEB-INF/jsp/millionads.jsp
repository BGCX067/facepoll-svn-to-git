<%-- 
    Document   : millionads
    Created on : Sep 11, 2011, 10:27:48 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="../js/jquery-1.6.3.min.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function(){
                $(document).mousemove(function(e){
                    $('#status').html(e.pageX +', '+ e.pageY);
                });
            })
        </script>
    </head>
    <body>
        <h2 id="status">
            0, 0
        </h2>
    </body>
</html>
