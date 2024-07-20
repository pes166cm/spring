<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/common/header.jsp"/>
<section id="content">
	<table>
		<tr>
			<th>이름</th>
			<td>${student.name }</td>
		</tr>
		<tr>
			<th>나이</th>
			<td>${student.age }</td>
		</tr>
		<tr>
			<th>학년</th>
			<td>${student.hak }</td>
		</tr>
		<tr>
			<th>반</th>
			<td>${student.ban }</td>
		</tr>
		<tr>
			<th>학과</th>
			<td>${student.hakka }</td>
		</tr>
	</table>
</section>
<jsp:include page="/WEB-INF/views/common/footer.jsp"/>
