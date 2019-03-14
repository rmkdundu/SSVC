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
<form action="" method="post" enctype="multipart/form-data" name="form1" id="form1">
  <table width="486" height="371" border="1">
      <%
          dbquery db=new dbquery();
          String tid=session.getAttribute("lid").toString();
          ResultSet rs=db.military_view(tid);
          if(rs.next())
          {
          %>
    <tr>
      <td colspan="2"><div align="right">
              <input type="image" readonly name="imageField" id="imageField"<img src="c_pic/<%=rs.getString("image")%>" height="100" width="100"/>
      </div></td>
    </tr>
    <tr>
      <td width="92" height="58">Name</td>
      <td width="181"><label for="name"></label>
          <input type="text" readonly name="name" id="name" value="<%= rs.getString("name")%>" /></td>
    </tr>
    <tr>
      <td>Place</td>
      <td><label>
              <input type="text" readonly name="textfield" value="<%= rs.getString("place")%>" />
      </label></td>
    </tr>
    <tr>
      <td>Post</td>
      <td><label>
              <input type="text" readonly name="textfield2" value="<%= rs.getString("post")%>"/>
      </label></td>
    </tr>
    <tr>
      <td>Pin</td>
      <td><label>
              <input type="text" readonly name="textfield3" value="<%= rs.getString("pin")%>" />
      </label></td>
    </tr>
    <tr>
      <td>District</td>
      <td><label>
              <input type="text" readonly name="textfield4"  value="<%= rs.getString("district")%>"/>
      </label></td>
    </tr>
    <tr>
      <td>State</td>
      <td><label>
              <input type="text" readonly name="textfield5" value="<%= rs.getString("state")%>" />
      </label></td>
    </tr>
   <tr>
      <td>Gender</td>
      <td> <input type="radio"  readonly name="radio"  id="male" value="male" <%if(rs.getString("gender").equalsIgnoreCase("male")){%> checked="checked" <%}%> />
      <label for="male">male<br />
          <input type="radio" readonly name="radio" id="female" value="female" <%if(rs.getString("gender").equalsIgnoreCase("female")){%> checked="checked"<% }%> />
      female      </label></td>
    </tr>
    <tr>
      <td height="58">DOB</td>
      <td><label>
              <input type="text" readonly name="dob"  value="<%= rs.getString("dob")%>"/>
      </label></td>
    </tr>
    <tr>
      <td height="58">Email</td>
      <td><label>
              <input type="email" readonly name="email" value="<%= rs.getString("email")%>" />
          </label>  </td>     
    </tr>
  </table>
<%} %>
</form>
</body>
</html>
<%@include file="footer.jsp" %>