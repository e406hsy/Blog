
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet" href="/css/header.css">
<link rel="stylesheet" href="/css/basic.css">
<header>
<p id="title">My Personal Web</p>
<div id="header_id_box">
	<c:choose>
		<c:when test="${empty user}">
			<p class="header_id">
				<a href="/login">로그인</a>
			</p>
			<p class="header_id">
				<a href="register">회원가입</a>
			</p>
		</c:when>
		<c:otherwise>
			<p class="header_id">
				<a href="/logout">logout</a>
			</p>
		</c:otherwise>
	</c:choose>
</div>
</header>