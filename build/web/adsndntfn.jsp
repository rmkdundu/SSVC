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
  <table width="287" height="157" border="1">
    <tr>
      <td width="129"><div align="center">Notification</div></td>
      <td width="142"><label for="name"></label>
      <input type="text" name="name" id="name" /></td>
    </tr>
    <tr>
      <td colspan="2"><div align="center">
        <input type="submit" name="send" id="send" value="send" />
      </div></td>
    </tr>
  </table>
</form>
</body>
</html>
<% 
    
    if(request.getParameter("send")!=null)
    {
        String notification=request.getParameter("name");
        
        dbquery db=new dbquery();
        int i=db.notification_add(notification);
    
    if(i>0)
    {
        %>
        <script>
            
            alert("send successfully");
                </script>
        <%
    }
    else
    {
        %>
        <script>
            alert("send failed");
        </script>
            <%
    }
    
    }
    
%>
<%@include file="footer.jsp" %>