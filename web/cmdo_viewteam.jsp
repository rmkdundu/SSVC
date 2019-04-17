<%@page import="mypackage.dbquery"%>
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Commando View Team</title>
</head>
    <%@include file="header.jsp" %>
<body>
<form id="form1" name="form1" method="post" action="">
    
    <% 
        String tid="";
        String cid=session.getAttribute("lid").toString();
    dbquery db=new dbquery();
    ResultSet rs=db.teammem_view(cid);
    if(rs.next())
    {
        tid=rs.getString("Tid");
    %>
    
  
  <p>Team Name:<%=rs.getString("tname")%></p>
  <p>Head:<%=rs.getString("name")%></p>
  
  
  
  <%
    }
    %>
  
    <table width="100" height="100" border="1">
  
    <tr>
      <td width="64"><div align="center">S.NO</div></td>
      <td width="89"><div align="center">PHOTO</div></td>
      <td width="121"><div align="center">MEMBER NAME</div></td>
      <td width="8"><div align="center">EMAIL</div></td>
    </tr>
    <%
   ResultSet rs2=db.mem_view(tid);
   int i=1;
   while(rs2.next())
   {
    %>
    <tr>
      <td height="68"><%=i%></td>
     <td><img src="c_pic/<%=rs2.getString("image")%>" name="ImageField"  height="150" width="150"/></td>
      <td><%=rs2.getString("name")%></td>
      <td><%=rs2.getString("email")%></td>
    </tr>
    <%
    i++;} 
   %>
  
  <p>&nbsp;</p>
  <p>&nbsp;</p>
    </table>
</form>
</body>
</html>
   <%@include file="footer.jsp" %>