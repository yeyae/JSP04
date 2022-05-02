<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
<style>
	table {
		border : 5px solid green;
	}
</style>
</head>
<body>
<%-- 게시글 작성하는 form 만들고, 작성후 board 로 요청 보내기 --%>
<%-- action : 어디로 보낼건지 / method : 정보를 보내는 방법 --%>
<form action="board" method="post" >
<table>
	<tr>
		<th>작성자</th>
		<td><input type="text" name="name"></td>
	</tr>
	<tr>
		<th>비밀번호</th>
		<td><input type="password" name="pass"></td>
	</tr>
	<tr>
		<th>이메일</th>
		<td><input type="text" name="email"></td>
	</tr>
	<tr>
		<th>제목</th>
		<td><input type="text" name="title"></td>
	</tr>
	<tr>
		<th>내용</th>
		<td><textarea name="content"></textarea></td>
	</tr>
	<tr>
		<td>
			<input type="submit" value="작성">
			<input type="reset" name="다시 작성">
		</td>
	</tr>
</table>
</form>
</body>
</html>