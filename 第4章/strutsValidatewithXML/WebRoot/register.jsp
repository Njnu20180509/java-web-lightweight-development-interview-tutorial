<%@ page language="java" pageEncoding="GBK" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
  <html>
      <body>
          <s:fielderror/>
          <form action="registerAction" validate="true" method="post">                
                                 ��¼�û���<input type="text" name="username"><br>
                                 ��¼���룺<input type="text" name="password"><br>
                                 ȷ�����룺<input type="text" name="confirm"><br>
                                 �ʼ���ַ��<input type="text" name="email"><br>
		            �ֻ����룺<input type="text" name="handphone"><br>
		    <input type="submit" value="�ύ">
          </form>
      </body>
  </html>
