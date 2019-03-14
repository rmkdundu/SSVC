
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
   
<form id="form1" name="form1" method="get" action="">
    
  <table width="476" height="497" border="1">
   <%
   dbquery db=new dbquery();
   String cid=session.getAttribute("lid").toString();
   ResultSet res=db.cmndo_view(cid);
   if(res.next())
   {
    %>
    <tr>
      <td height="172" colspan="2"><div align="right">
             <img src="c_pic/<%=res.getString("image")%>" height="100" width="100"/>
      </div></td>
    </tr>
     
    <tr>
      <td width="138">Name</td>
      <td width="322"><label for="name"></label>
          <input type="text" readonly name="name" id="name" value="<%= res.getString("name")%>" /></td>
    </tr>
    <tr>
      <td>Place</td>
      <td><label>
              <input type="text"  readonlyname="textfield" value="<%= res.getString("place")%>" />
      </label></td>
    </tr>
    <tr>
      <td>Post</td>
      <td><label>
              <input type="text" readonly name="textfield2" value="<%= res.getString("post")%>" />
      </label></td>
    </tr>
    <tr>
      <td>Pin</td>
      <td><label>
              <input type="text" readonlyname="textfield3" value="<%= res.getString("pin")%>" />
      </label></td>
    </tr>
    <tr>
      <td>District</td>
      <td><label>
              <input type="text" readonly name="textfield4" value="<%= res.getString("district")%>" />
      </label></td>
    </tr>
    <tr>
      <td>State</td>
      <td><label>
              <input type="text" readonly name="textfield5" value="<%= res.getString("state")%>" />
      </label></td>
    </tr>
     <tr>
      <td>Gender</td>
      <td><input type="radio"  readonly name="radio"  id="male" value="male" <%if(res.getString("gender").equalsIgnoreCase("male")){%> checked="checked" <%}%> />
      <label for="male">male<br />
          <input type="radio" readonly name="radio" id="female" value="female" <%if(res.getString("gender").equalsIgnoreCase("female")){%> checked="checked"<% }%> />
      female      </label></td>
    </tr>
    <tr>
      <td>DOB</td>
      <td><label for="date"></label>
          <input type="text" readonly name="date" value="<%= res.getString("dob")%>" id="date"  /></td>
    </tr>
   
  
    <tr>
      <td>Email</td>
      <td><label for="email"></label>
          <input type="email"  readonly name="email" value="<%= res.getString("email")%>"  id="email" /></td>
    </tr>
  </table>
    <% } %>
   
</form>
</body>
</html>
    <%@include file="footer.jsp" %>
