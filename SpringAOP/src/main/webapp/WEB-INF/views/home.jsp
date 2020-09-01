<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>시작 페이지</title>
</head>
<body>
	<c:if test="${LOGIN == null }">
		<a href="login">로그인</a>
		<br />
	</c:if>
	<c:if test="${LOGIN != null }">
		<a href="logout">로그아웃</a>
		<br />
	</c:if>
	<a href="boardlist">게시물 보기</a>
	<br />
	<a href="boardwrite">게시물 쓰기</a>
	<br />
	<a href="noticewrite">공지사항 쓰기</a>
	<br />
	
	<a href="arinsert">ArrayList 삽입</a><br />
	<a href="liinsert">LinkedList 삽입</a><br />
	<a href="arread">ArrayList 읽기</a><br />
	<a href="liread">LinkedList 읽기</a><br />
	
</body>
</html>