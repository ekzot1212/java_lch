<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" 
	pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>

</head>
<body>
	<h1 class="pt-5">게시글 등록</h1>
	<form action="<c:url value='/board/insert'/>" method="post" enctype="multipart/form-data">
		<div class="form-group">
			<input class="form-control" placeholder="제목" name="bo_title">
		</div>
		<div class="form-group">
			<textarea class="form-control" placeholder="내용" name="bo_contents" style="min-height: 400px"></textarea>
		</div>
		<input type="file" class="form-control" name="fileList">
		<input type="file" class="form-control" name="fileList">
		<input type="file" class="form-control" name="fileList">
		<button class="btn btn-danger">게시글 등록</button>
	</form>
</body>
</html>
