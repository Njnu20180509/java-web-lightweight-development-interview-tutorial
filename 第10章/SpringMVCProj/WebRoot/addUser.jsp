<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <title>����û�</title>
  </head> 
  <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> 
  <body>  
    <form action="<%=basePath%>/addUser" method="post">  
        �û�����<input type="text" name="name"><br/>  
        ��&nbsp�䣺      <input type="text" name="age"><br/>  
           <input type="submit" value="����û�">  
    </form>  
  </body>  
</html>  
