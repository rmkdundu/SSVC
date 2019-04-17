<%@page import="mypackage.dbquery"%>
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Commando View Reply</title>
</head>
    <%@include file="header.jsp" %>
<body>
<form id="form1" name="form1" method="post" action="">
  <table width="413" height="209" border="1">
    <tr>
      <td><div align="center">S.NO</div></td>
      <td><div align="center">COMPLAINT</div></td>
      <td><div align="center">DATE</div></td>
      <td><div align="center">REPLY</div></td>
      <td><div align="center">REPLY DATE</div></td>
    </tr>
    <% 
        dbquery db=new dbquery();
    int i=1;
    String cid=session.getAttribute("lid").toString();
          ResultSet rs=db.cmplnt_view(cid);
         while(rs.next())
          {
    %>
    <tr>
         <td><%=i++%></td>
      <td><%=rs.getString("compliaint")%></td>
      <td><%=rs.getString("complaint_date")%></td>
      <td><%=rs.getString("reply")%></td>
      <td><%=rs.getString("reply_date")%></td>
      
    </tr>
      <% i++;  } %>
  </table>
</form>
</body>
</html>
      <%@include file="footer.jsp" %>