<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

  <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
  <html>
    <head>
         <title>��¼����</title>         
   </head>
   <body>
                                    �û���¼
             <br>
             <s:form action="/login" method="post">
                 <s:textfield name="username" label="�û���"/>
                 <s:textfield name="password" label="����"/>
                 <s:submit value="��¼"/>
             </s:form>
     </body>
 </html>
