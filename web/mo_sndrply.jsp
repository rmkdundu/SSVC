<%@page import="mypackage.dbquery"%>
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>sender reply</title>
</head>
    <%@include file="header.jsp" %>
<body>
<form id="form1" name="form1" method="post" action="">
  <table width="435" height="166" border="1">
    <tr>
      <td width="93">Reply</td>
      <td width="326"><label for="reply"></label>
      <textarea name="reply" id="reply1" cols="45" rows="5"></textarea></td>
    </tr>
    <tr>
      <td colspan="2"><div align="center">
        <input type="submit" name="submit" id="button" value="Send" />
      </div></td>
    </tr>
  </table>
</form>
</body>
</html>
<% 
    String cid=request.getParameter("id");
if(request.getParameter("submit")!=null)
{
    String reply=request.getParameter("reply");
    dbquery db=new dbquery();
    int i=db.reply_add(reply,cid);
     
    if(i>0)
    {
        %>
        <script>
            
            alert("submit successfully");
                </script>
        <%
    }
    else
    {
        %>
        <script>
            alert(" failed");
        </script>
            <%
    }
    
    }
    
%>
<%@include file="footer.jsp" %>
