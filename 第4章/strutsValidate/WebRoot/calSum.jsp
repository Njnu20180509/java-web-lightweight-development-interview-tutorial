<%@ page language="java" pageEncoding="GBK" %>
  <%@ taglib prefix="s" uri="/struts-tags"%>
  
  <html>
      <head>
          <title>���������</title>
      </head>
  
      <body>
           ���
          <br/>
          <s:form action="mystruts/calSum" >                
              <s:textfield name="num1" label="��1"/>
              <s:textfield name="num2"  label="��2" />        
              <s:submit value="���" />            
          </s:form>
      </body>
  </html>
