<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@ page import="com.business.NoteBean, com.domain.Note, java.util.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>������Ϣ�б�</title>
  </head>
  
  <body>
  	<h2>����������Ϣ���£�</h2><br />
  	<table border="1" width="700">
  		<tr>
  			<th width="500">���Ա���</th>
  			<th width="100">��������</th>
  			<th width="100">����ʱ��</th>
  		</tr>
  		<%
  		NoteBean noteBean = new NoteBean();
  		List noteList = noteBean.findAllNotes();
  		Iterator noteIt = noteList.iterator();
  		while(noteIt.hasNext()) {
  			Note tn = (Note)noteIt.next();
  		%>
  		<tr>
  			<td><%= tn.getTitle() %></td>
  			<td><%= tn.getAuthor() %></td>
  			<td><%= tn.getCreateTime() %></td>
  		</tr>
  		<%
  		}
  		%>
  	</table>
  </body>
</html>
