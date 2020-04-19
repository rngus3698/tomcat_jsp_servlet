<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>test</h2>
	<h1>login/main</h1>
	<c:choose>
		<c:when test="${now_user_name ne null}">
			
			<h2>${now_user_name}님 안녕하세요!</h2>
			<h2>${now_user_id}으로 로그인 하셨네요!</h2>
			<a href="../logout.m">log out</a>
			<a href="">board list</a>
			<a href="../board_write.b">board write</a>
			
		</c:when>
		<c:otherwise>
			<a href="../singUp.m">join</a>
		</c:otherwise>
		
	</c:choose>
	
</body>
</html>