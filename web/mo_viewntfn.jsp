<%@page import="mypackage.dbquery"%>
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>
    <%@include file="header.jsp" %>
<body>
<form id="form1" name="form1" method="post" action="">
  <table width="423" height="139" border="1">
    <tr>
      <td><div align="center">S.NO</div></td>
      <td><div align="center">DATE</div></td>
      <td><div align="center">TIME</div></td>
      <td><div align="center">NOTIFICATION</div></td>
    </tr>
      <%
          dbquery db=new dbquery();
          int i=1;
          ResultSet rs= db.notification_view();
          while(rs.next())
          {
          %>
    
      <tr>
          <td height="220"><%= i %></td>
          <td><%=rs.getString("date")%></td>
           <td><%=rs.getString("time")%></td>
              
           
            
    
        
      
      <td><%=rs.getString("notification")%></td>
      
     
    </tr>
      <% i++;} %>
  </table>
</form>
</body>
</html>
      <%@include file="footer.jsp" %>