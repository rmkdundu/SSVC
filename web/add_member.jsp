<%@page import="mypackage.dbquery"%>
<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>
    <%@include file="header.jsp" %>
<body>
<form id="form1" name="form1" method="post" action="">
<table width="200" border="1">
  <tr>
    <td>Team</td>
    <td>
      <label>
        <select name="select">
            <option>select</option>
              <%
          dbquery db=new dbquery();
         
          ResultSet rs=db.team_view();
          while(rs.next())
              {%>
              <option value="<%=rs.getString("Tid")%>"><%=rs.getString("tname")%></option>
       <%
              }
       %>
      %>
        </select>
        </label>
   
    </td>
  </tr>
</table>
 <table width="200" border="1">
   <tr>
     <td>Sl.no</td>
     <td>Name</td>
     <td>Picture</td>
     <td>&nbsp;</td>
   </tr>
      <%
          dbquery db1=new dbquery();
          int i=1;
          ResultSet rs1=db.commando_view();
          while(rs1.next())
          
          {
      %>
   <tr>
     <td><%= i++ %></td>
     <td><%=rs1.getString("name")%></td>
     <td><img src="c_pic/<%=rs1.getString("image")%>" width="50" height="50"></td>
     <td><label>
       <input type="checkbox" name="checkbox" value="<%=rs1.getString("clogin_id")%>" />
     </label></td>
   </tr>
   <%
          }
   %>
   <tr>
     <td colspan="4"><label>
       <div align="center">
         <input type="submit" name="Submit" value="ADD" />
         </div>
     </label></td>
    </tr>
 </table>
 <p>&nbsp;</p>
</form>
</body>
</html>
   
   <%
          int k=0;
    if(request.getParameter("Submit")!=null)
{
    String tid=request.getParameter("select");
    String mid[]=request.getParameterValues("checkbox");
    
    
    dbquery db2=new dbquery();
    for(int j=0;j<mid.length;j++)
    {
 k=db2.add_member(tid, mid[j]);
    }
if(k>0)
{
    %>
    <script>
        alert("success");
    </script>
    <%
}
  else
{
    %>
    <script>
        alert("sorry, Already a memeber");
    </script>
    <%
}
    
}
%>
<%@include file="footer.jsp" %>

