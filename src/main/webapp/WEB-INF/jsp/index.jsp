
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>

<html lang="ko">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="./login.css">
<title>My Personal Web</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<main class="app">
		<form class="login-form" method="post">
			<div class="input-area-div">
				<p>아이디</p>
				<input class="input-area" type="text" />
			</div>
			<div  class="input-area-div">
				<p>비밀번호</p>
				<input class="input-area" type="password" />
			</div>
			<button>로그인</button>

		</form>
	</main>
</body>
</html>