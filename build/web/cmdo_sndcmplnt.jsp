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
  <table width="348" height="188" border="1">
    <tr>
      <td>Complaint</td>
      <td><label for="complaint"></label>
      <textarea name="complaint" id="complaint" cols="45" rows="5"></textarea></td>
    </tr>
    <tr>
      <td colspan="2"><div align="center">
        <input type="submit" name="send" id="send" value="Send" />
      </div></td>
    </tr>
  </table>
</form>
</body>
</html>
<% 
   // String cid=request.getParameter("id");
    if(request.getParameter("send")!=null)
    {
        String cid=session.getAttribute("lid").toString();
       // out.print(cid);
        String complaint=request.getParameter("complaint");
        dbquery db=new dbquery();
        int i=db.complaint_add(complaint, cid);
                
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
    