<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<jsp:include page="/WEB-INF/views/common/header.jsp"/>
<style>
	div#demo-container{
		width:50%;
		padding:15px;
		margin:0 auto;
		border:1px solid lightgray;
		border-radius:10px;
	}
</style>
<section id="content">
	<div id="demo-container">
	<h2>파라미터 테스트</h2>
		<form id="devFrm" method="post">
			<div class="form-group row">
				<label for="devName" class="col-sm-2 col-form-label">이름</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="devName" name="devName">
				</div>
			</div>
			<div class="form-group row">
			<label for="devAge" class="col-sm-2 col-form-label">나이</label>
			<div class="col-sm-10">
				<input type="number" class="form-control" id="devAge" name="devAge" required>
			</div>
			</div>
			<div class="form-group row">
			<label for="devEmail" class="col-sm-2 col-form-label">이메일</label>
			<div class="col-sm-10">
				<input type="email" class="form-control" id="devEmail" name="devEmail">
			</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 col-form-label">성별</label>
				<div class="col-sm-10">
					<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="devGender" id="devGender0" value="M">
					<label class="form-check-label" for="devGender0">남</label>
					</div>
					<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="devGender" id="devGender1" value="F">
					<label class="form-check-label" for="devGender1">여</label>
					</div>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 col-form-label">개발언어</label>
				<div class="col-sm-10">
					<div class="form-check form-check-inline">
					<input class="form-check-input" type="checkbox" name="devLang" id="devLang0" value="Java">
					<label class="form-check-label" for="devLang0">Java</label>
					</div>
					<div class="form-check form-check-inline">
					<input class="form-check-input" type="checkbox" name="devLang" id="devLang1" value="C">
					<label class="form-check-label" for="devLang1">C</label>
					</div>
					<div class="form-check form-check-inline">
					<input class="form-check-input" type="checkbox" name="devLang" id="devLang2" value="Javascript">
					<label class="form-check-label" for="devLang2">Javascript</label>
					</div>
				</div>
				<div class="form-group row">
				<label for="devName" class="col-sm-2 col-form-label">키</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="devHeight" name="devHeight">
					</div>
				</div>
				<div class="form-group row">
				<label for="devName" class="col-sm-2 col-form-label">생일</label>
				<div class="col-sm-10">
					<input type="date" class="form-control" id="birthDay" name="birthDay">
					</div>
				</div>
				<div class="form-group row">
				<label for="devName" class="col-sm-2 col-form-label">저장시간</label>
				<div class="col-sm-10">
					<input type="datetime-local" class="form-control" id="enrollDate" name="enrollDate">
					</div>
				</div>
				<div class="form-group row">
				<label for="devName" class="col-sm-2 col-form-label">우편번호</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="zipCode" name="zipCode">
					</div>
				</div>
				<div class="form-group row">
				<label for="devName" class="col-sm-2 col-form-label">시도</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="city" name="city">
					</div>
				</div>
				<div class="form-group row">
				<label for="devName" class="col-sm-2 col-form-label">상세주소</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="detail" name="detail">
					</div>
				</div>
				<div class="form-group-row">
					<div class="col-sm-12">
						<button type="button" 
						class="btn btn-outline-info col-sm-12"
						onclick="requestTest('demo1.do');">
							기본 서블릿처럼 이용하기
						</button>
					</div>
				</div>
				<div class="form-group-row">
					<div class="col-sm-12">
						<button type="button" 
						class="btn btn-outline-info col-sm-12"
						onclick="requestTest('demo2');">
							파라미터이용하기
						</button>
					</div>
				</div>
				<div class="form-group-row">
					<div class="col-sm-12">
						<button type="button" 
						class="btn btn-outline-info col-sm-12"
						onclick="requestTest('demo3');">
							@RequestParam이용하기
						</button>
					</div>
				</div>
				<div class="form-group-row">
					<div class="col-sm-12">
						<button type="button" 
						class="btn btn-outline-info col-sm-12"
						onclick="requestTest('demo4');">
							Command이용하기
						</button>
					</div>
				</div>
				<div class="form-group-row">
					<div class="col-sm-12">
						<button type="button" 
						class="btn btn-outline-info col-sm-12"
						onclick="requestTest('demo5');">
							Map이용하기
						</button>
					</div>
				</div>
			</div>
		</form>
	</div>
</section>
<script>
	/*const requestTest=()=>{}*/
	
	function requestTest(url){
		const form=document.getElementById("devFrm");
		//<form action="">
		//devAge값 확인하기 => validation(유효성검사)
		const devAge=document.getElementById("devAge").value;
	/* 	if(devAge.length<=0){
			alert("나이를 입력해주세요");
		}  else{*/
			form.action="${path}/demo/"+url;
			form.submit();
		/* } */
	}

</script>

<jsp:include page="/WEB-INF/views/common/footer.jsp"/>