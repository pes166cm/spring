<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>    
<jsp:include page="/WEB-INF/views/common/header.jsp"/>
<section id="content">
	<h2>우와 나의 메인페이지!!</h2>
	<h3>a태그이용하기</h3>
	<p>"/main" , "main"</p>
	<a href="${pageContext.request.contextPath }/main">/main 내가 만든 페이지</a><br>
	<a href="${path }/main">main 내가 만든 페이지</a><br>
	<a href="${path }/student/enrollstudent.do">학생정보</a><br>
	<a href="${path }/testStudent">학생조회</a>
</section>
<jsp:include page="/WEB-INF/views/common/footer.jsp"/>