<%-- 
    Document   : jsp09v01Thead
    Created on : 24-jun-2017, 21:07:14
    Author     : OFICINA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div>
        <thead>
          <tr>
           <th><label for=e1>Name</label>
           <th><label for=e2>Product</label>
           <th><label for=e3>Picture</label>
           <th><label for=e4>Price</label>
          <tr>
           <td>Your name here
           <td>What are you selling?
           <td>Link to a picture
           <td>Your reserve price <tbody>
          <tr>
           <td>Ms Danus
           <td>Doughnuts
           <td><img src="http://example.com/mydoughnuts.png" title="Doughnuts from Ms Danus">
           <td>$45
          <tr>
           <td><input id=e1 type=text name=who required form=f>
           <td><input id=e2 type=text name=what required form=f>
           <td><input id=e3 type=url name=pic form=f>
           <td><input id=e4 type=number step=0.01 min=0 value=0 required form=f>
        </table>            
        <form id=f action="/auction.cgi">
 <input type=button name=add value="Submit">
</form>
        </div>
    </body>
</html>
