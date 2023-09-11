<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시글 상세</h1>
	<h3>제목 : ${board.bo_title }</h3>
	<h3>작성자 : ${board.bo_me_id }</h3>
	<h3>조회수 : ${board.bo_views }</h3>
	<hr>
	<div>${board.bo_contents }</div>
	<h3>첨부파일</h3>
	<c:forEach items="${fileList}" var="file">
		<a  href="<c:url 
			value='/download${file.fi_name}'/>" 
			download="${file.fi_ori_name }"
		>${file.fi_ori_name }</a> <br>
	</c:forEach>
	<a href="<c:url value='/board/update?bo_num=${board.bo_num}'/>">수정</a>
	<a href="<c:url value='/board/delete?bo_num=${board.bo_num}'/>">삭제</a>
	<hr>
	<h2>댓글</h2>
	<textarea rows="" cols="" placeholder="댓글 등록" id="inputComment"></textarea>
	<button id="btnCommentInsert">댓글 등록</button>
	<script type="text/javascript" src="//code.jquery.com/jquery-3.6.1.js"></script>
	<script type="text/javascript">
// 	보낼 객체를 만들고 ajax로 객체를 보내줌
		$('#btnCommentInsert').click(function(){
			let co_contents = $('#inputComment').val();
			let co_me_id = '${user.me_id}';
			let co_bo_num = '${board.bo_num}';
			
			if(co_me_id == ''){
				if(confirm('로그인이 필요한 서비스입니다. 로그인하시겠습니까?')){
					location.href = '<c:url value="/member/login"/>'
				}
				return;
			}
// 			공백으로만 되어있는 경우 안되게 하기위해서 trim
			if(co_contents.trim() == ''){
				alert('댓글 내용을 입력하세요.');
				$('#inputComment').focus();
				return;
			}
			let comment = {
					co_contents : co_contents,
					co_me_id : co_me_id,
					co_bo_num : co_bo_num
			}
			console.log(comment)
			$.ajax({
				async : false,
				method : 'post',
				url : '<c:url value="/comment/insert"/>',
				data : JSON.stringify(comment),
				contentType : 'application/json; charset=utf-8',
				dataType : 'json',
				success : function(data){
					if(data.res){
						alert('댓글 등록 성공');
						$('#inputComment').val('');
					}else{
						alert('댓글 등록 실패');
					}
				}
			})
		})
	
	</script>
</body>
</html>