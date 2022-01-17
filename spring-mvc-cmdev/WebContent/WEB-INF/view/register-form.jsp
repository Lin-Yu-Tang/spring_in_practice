<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/sticky-footer-navbar/">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<div class="container-xl">
	<h1 class="mb-5">使用者註冊</h1>
	
	<form class="form" method="POST" action="processForm">
		<p>
		<label for="account">帳號: </label>
		<input type="text" id="account" name="account">
		</p><br>
		
		<p>
		<label for="pass">密碼: </label>
		<input type="password" id="pass" name="password">
		</p><br>
		
		<p>
		<label for="theName">姓名: </label>		
		<input type="text" id="theName" name="userName">
		</p><br>
		
		<p>
		<input class="btn btn-primary" type="submit">
		</p><br>
	</form>
	
</div>
</body>
</html>