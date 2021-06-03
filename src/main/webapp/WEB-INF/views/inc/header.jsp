<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:set var = "param" value= "${param}"/>
	<c:if test = "${empty param}">
		<c:out value = "jsp파일 안에 있는 모든것을 가져옵니다"/>
	</c:if>
	<c:if test = "${not empty param}"><c:out value = "${param}"/></c:if>
<br>
<h3>**header**</h3>
<br>