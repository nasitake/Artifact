<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="model.User" %>
<%
//セッションスコープからユーザー情報を取得
User loginUser = (User) session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>トップ</title>
<link rel="stylesheet" href="css/styles1.css">
</head>
<body>
<header>
        <div class="container">
            〇×システム
        </div>
    </header>
<% if(loginUser != null){ %>
	<p>ログインに成功しました</p>
	<p>ようこそ<%= loginUser.getUsername() %>さん</p>
	<a href="/docoTsubu/PassChange">パスワード変更はこちら</a><br>
	<a href="/docoTsubu/Featuredescription">機能説明はこちら</a><br>
	<a href="/docoTsubu/Logout">ログアウト</a>
	<%}else{ %>
		<p>ログインに失敗しました</p>
		<a href="/docoTsubu/Topservret">TOPへ</a>
	<%} %>
</body>
</html>