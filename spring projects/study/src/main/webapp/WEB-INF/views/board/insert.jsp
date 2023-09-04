<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 등록</title>
</head>
<body>
	<h1>게시글 등록</h1>
	<form action="<c:url value='/board/insert'/>" method="post">
		<input type="text" class="form-control" name="bo_title" placeholder="제목"> <br>
		<textarea rows="40" cols="20" name="bo_contents" placeholder="내용"></textarea> <br>
		<button>등록</button>
	</form>
	
</body>
</html>