<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Board b = (Board)request.getAttribute("board");
	SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 정보</title>
</head>
<body>
	작성자 이름 : <%=b.getName() %><br>
	비밀번호 : <%=b.getPass() %><br>
	이메일 : <%=b.getEmail() %><br>
	글 제목 : <%=b.getTitle() %><br>
	글 내용 : <%=b.getContent() %><br>
	작성시간 : <%= sf.format(b.getCreatedTime()) %>
</body>
</html>