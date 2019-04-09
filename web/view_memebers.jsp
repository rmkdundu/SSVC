<%@page import="mypackage.dbquery"%>
<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>View Memebers</title>
</head>
    <%@include file="header.jsp" %>
<body>
<form id="form1" name="form1" method="post" action="">
  <table width="200" border="1">
    <tr>
      <td>TEAM</td>
      <td><label>
        <select name="select"> <%
          dbquery db=new dbquery();
          int i=1;
          ResultSet rs1=db.team_view();
          while(rs1.next())
          
          {
      %>
      <option value="<%=rs1.getString(1)%>"><%=rs1.getString(2)%></option>
      <%
          }
              %>
        </select>
      </label></td>
    </tr>
        <tr>
            <td colspan="2"> <input type="submit" name="button" id="submit" value="Submit" </input></td>
        </tr>
         </table>
        <%
          if(request.getParameter("button")!=null)
          {
              String id=request.getParameter("select");
          
          ResultSet rs=db.ad_team(id);
          if(rs.next())
          {
              
          
          %>
 
  <table width="200" border="1">
    <tr>
      <td>Sl.no</td>
      <td>Name</td>
   
    </tr>
      <%
      
      do{
          
%>
    <tr>
        <td><%=i++%></td>
        <td><%=rs.getString("name") %></td>
     
    </tr>
<%

      }while(rs.next());
%>
  </table>
     <%  } }%>
  <p>&nbsp;</p>
 
</form>
</body>
</html>
     <%@include file="footer.jsp" %>
