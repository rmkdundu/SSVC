<%@page import="java.lang.String"%>
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
  <table width="459" height="185" border="1">
    <tr>
      <td><div align="center">S.NO</div></td>
      <td><div align="center">DATE</div></td>
      <td><div align="center">PHOTO</div></td>
      <td><div align="center">NAME</div></td>
     
      <td><div align="center">COMPLAINT</div></td>
    </tr>
      <% 
          String lid=session.getAttribute("lid").toString();
          dbquery db=new dbquery();
          int i=1;
          ResultSet rs=db.complaint_view(lid);
          while(rs.next())
          {
                  
      %>
    <tr>
                <td height="220"><%= i %></td>
      <td><%=rs.getString("complaint_date")%></td>
       <td><img src="c_pic/<%=rs.getString("image")%>" name="ImageField"  height="150" width="150"/></td>
      <td><%=rs.getString("name")%></td>
      <td><%=rs.getString("compliaint")%></td>
      <td>
      <%
      String r=rs.getString("reply");
      if(r.equalsIgnoreCase("pending"))
      {
      %>
          <a href="mo_sndrply.jsp?id=<%=rs.getString(7)%>">Reply</a>
      <%
      }else{
          out.print(r);
      }
      %>
      </td>
    </tr>
    <%
    i++;  }
    %>
  </table>
</form>
</body>
</html>
    <%@include file="footer.jsp" %>