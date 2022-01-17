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
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Lobster&display=swap" rel="stylesheet">
<style>
	h1 {
		font-family: 'Lobster', cursive;
	}
</style>
<title>Home Page</title>
</head>
<body>
<div class="container">

	<main class="align-self-center">
	<h1 class="mb-3 text-center">Welcome to CMDEV Database Management Home Page</h1>
	<div class="card" style="max-width: 20rem">
	<div class="card-header text-center fs-5 fw-bolder">
	使用者登入
	</div>
	
	<div class="card-body">
	<form class="form" action="userLogin" method="POST">
	<p>
	<label class="pe-3" for="account">帳號: </label>
	<input type="text" id="account" name="userAccount">
	</p><br>
	
	<p>
	<label class="pe-3" for="pass">密碼: </label>
	<input type="password" id="pass" name="userPassword">
	</p>
	
	<p>
	<input type="checkbox" id="remeber" name="autoLogin" value="true">
	<label for="remeber">記住我</label>
	</p>
	
	<p>
	<input class="btn btn-primary w-100" type="submit" value="登入">
	</p>
	</form>
	
	<p class="text-muted text-center">還不是會員嗎? <a href="register">立即註冊</a></p>
	
	</div><!-- ./card.body -->
	</div><!-- ./card -->
	</main>
</div>
</body>
</html>












