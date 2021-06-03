<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<hr>
<h3>***layOut***</h3>
<hr>


<t:insertAttribute name="header" /><!-- /WEB-INF/views/inc/header.jsp -->

<t:insertAttribute name="body" /><!-- 이 부분만 바뀐다 , board.jsp, login.jsp, register.jsp 등등 -->

<t:insertAttribute name="aside" /><!-- /WEB-INF/views/inc/aside.jsp -->

<t:insertAttribute name="footer" /><!-- /WEB-INF/views/inc/footer.jsp -->
