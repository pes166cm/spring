<%@page import="com.bs.spring.demo.model.vo.Demo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <% Demo demo = (Demo)request.getAttribute("demo"); %> --%>
<jsp:include page="/WEB-INF/views/common/header.jsp"/>
<section id="content">
	
	<table class="table" id="tbl-dev">
		<tr>
			<th scope="col">이름</th>
		<%-- 	<td><%= demo.getDevName() %></td> --%>
			<td>${demo.devName }</td>
		</tr>
		<tr>
			<th scope="col">나이</th>
			<%-- <td><%= demo.getDevAge() %></td> --%>
			<td>${demo.devAge }</td>
		</tr>
		<tr>
			<th scope="col">이메일</th>
			<%-- <td><%= demo.getDevEmail() %></td> --%>
			<td>${demo.devEmail }</td>
		</tr>
		<tr>
			<th scope="col">성별</th>
			<%-- <td><%=demo.getDevGender() %></td> --%>
			<td>${demo.devGender }</td>
		</tr>
		<tr>
			<th scope="col">개발가능언어</th>
			<%-- <td><%= demo.getDevLang() %></td> --%>
			<td>${demo.devLang }</td>
		</tr>
	</table>
</section>
<jsp:include page="/WEB-INF/views/common/footer.jsp"/>