<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<jsp:include page="/WEB-INF/views/common/header.jsp"/>
<section id="content">
	<form id="studentFrm" method="post">
		<table>
			<tr>
				<th>이름</th>
				<td><input type="text" id="name" name="name"></td>
			</tr>
			<tr>
				<th>나이</th>
				<td><input type="text" id="age" name="age"></td>
			</tr>
			<tr>
				<th>학년</th>
				<td><input type="text" id="hak" name="hak"></td>
			</tr>
			<tr>
				<th>반</th>
				<td><input type="text" id="ban" name="ban"></td>
			</tr>
			<tr>
				<th>학과</th>
				<td><input type="text" id="hakka" name="hakka"></td>
			</tr>
			<tr>
				<td colspan="5">
				<button type="button" 
				onclick="requestTest('enrollstudentend.do');">
					학생등록하기
				</button>
				</td>
			</tr>
		</table>
	</form>
</section>
<script>
	function requestTest(url){
		const form=document.getElementById("studentFrm");
		form.action="${path}/student/"+url;
		form.submit();
	}
</script>
<jsp:include page="/WEB-INF/views/common/footer.jsp"/>