<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>model 전달자</h2>
	<h3>요청주소 - /컨탠스패스/response/ex01</h3>
	
	<a href="ex02">ex02 페이지로(모델방식)</a>
	
	<a href="ex03">ex03 페이지로(모델엔뷰)</a>
	
	<a href="ex04?id=aaa123">ex04 페이지로(모델어노테이션)</a>
	<form action="ex05" method="post">
		id: <input type="text" name="id"><br>
		age: <input type="text" name="age"><br>
		<input type="submit" value="모델어노테이션">
	</form>
</body>
</html>