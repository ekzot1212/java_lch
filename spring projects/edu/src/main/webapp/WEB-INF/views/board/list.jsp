<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" 
	pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>

</head>
<body>
	<h1 class="pt-5">게시글 조회</h1>
	<table class="table table-warning table-hover">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>추천/비추천</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="board" varStatus="vs">
				<tr>
					<td>${list.size() - vs.index }</td>
					<td><a href="#">${board.bo_title }</a></td>
					<td>${board.bo_me_id }</td>
					<td>${board.bo_up}/${board.bo_down}</td>
					<td>${board.bo_views}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
