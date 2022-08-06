<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>パスワード変更画面</title>
<link rel="stylesheet" href="css/styles1.css">
</head>
<body>
<header>
        <div class="container">
            〇×システム
        </div>
    </header>
<form action="/docoTsubu/PassChange" method="post">
<label for="email"></label>
メールアドレス:&emsp;&nbsp;<input type="text" name="email"><br>
<%-- 現在のパスワード:<input type="password" name="pass"><br>--%>
<label for="password">新しいパスワード:</label>
<input type="password" name="pass"><br>
<input type="submit" value="変更">
<input type="button" Value="戻る" onClick="history.go(-1);">
</form>
</body>
</html>