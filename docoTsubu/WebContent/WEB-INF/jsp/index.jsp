<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE  html>
<html style="height: 100vh;" lang="ja">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/styles.css">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>〇×システム</title>
</head>
<body style="background: rgb(204, 233, 239);">
  <div class="wrapper">
    <!-- <div class="login"> -->
      <div class="spase">
        <h1 class="system">〇×システム</h1>
        <form action="/docoTsubu/Login" method="post">
        <label for="user">ユーザー名:</label>
        <input type="text" name="username" placeholder="ユーザー名"><br>
         <label for="uid">email:</label>
          <input type="email" name="email" placeholder="メールアドレス"><br>
          <label for="pwd">password:</label>
           <input type="password" name="pass" placeholder="パスワード"><br>
           <div class="loginbtn">
             <input type="submit" value="ログイン">
             <div class="clearbtn">
               <input type="reset"style="width: 70px;" name="reset" value="クリア">
             </div>
            </div>
     </form>
            <br>
            <div class="link">
              <a href="/docoTsubu/Registergamen">新規登録はこちら</a>
            </div>
      </div>
       <!-- </div> -->
    </div>
  </body>
</html>