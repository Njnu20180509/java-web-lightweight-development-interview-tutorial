<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>  
  <head>  
    <title>�û��б�</title>      
  </head>  
  <body>  
        <a href=/SpringMVCProj/addUser.jsp>����û�</a>
        <table border="1">  
            <tbody>  
                <tr>  
                    <th>����</th>  
                    <th>����</th>  
                    <th>����</th>  
                </tr>  
                    <c:forEach items="${users}" var="u">  
                        <tr>  
                            <td>${u.name }</td>  
                            <td>${u.age }</td>  
                            <td>  
                                <a href="/SpringMVCProj/getUser/${u.id}">����</a>  
                                <a href="/SpringMVCProj/deleteUser/${u.id}">ɾ��</a>  
                            </td>  
                        </tr>  
                    </c:forEach>  
            </tbody>  
        </table>  
  </body>  
</html>  
