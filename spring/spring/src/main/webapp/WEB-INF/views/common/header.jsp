<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jstl라이브러리 태그를 가져옴 -->    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
	<head>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
		<script src="${pageContext.request.contextPath }/resources/js/jquery-3.7.1.min.js"></script>
	</head>
	<body>
	<div id="container">
		<div id="header-container">
			<h2>HelloSpring</h2>
		</div>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="#">
				<img alt="로고" 
				src="${path }/resources/images/logo-spring.png"
				 width="50px">
			</a>
		<button class="navbar-toggler" type="button" 
			data-toggle="collapse" data-target="#navbarNav" 
			aria-controls="navbarNav" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>	
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active">
					<a class="nav-link" href="#">HOME</a>
				</li>
				<li class="nav-item active">
					<a class="nav-link" href="${path }/demo/demo.do">parameterTest</a>
				</li>
			</ul>
			<button class="btn btn-outline-success my-2 my-sm-0">
				로그인
			</button>
			&nbsp;
			<button class="btn btn-outline-success my-2 my-sm-0">
				회원가입
			</button>
		</div>
	</div>
</nav>



