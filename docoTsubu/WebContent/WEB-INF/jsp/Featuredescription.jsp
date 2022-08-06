<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="UTF-8"/>
  <meta name="viewport"
        content="width=device-width, initial-scale=1.0, user-scalable=no"/>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"/>
  <link rel="stylesheet" href="css/styles1.css">
  <title>機能説明</title>
</head>
<body>
    <header>
        <div class="container">
            〇×システム
        </div>
    </header>
  <div class="container">
  Topservret.java<br>
  ログイン画面(index.jsp)にフォワードするコントローラ。Topservret.javaをサーバーで実行する。<br>
  index.jsp(ログイン画面)<br>
  ユーザ名、メールアドレス、パスワードを入力する。<br>
  クリアボタンを押下することで、入力項目をクリアする<br>
  新規登録はこちらリンクを押下することで、ユーザ登録画面に遷移する。<br>
  Register.jsp(ユーザ登録画面)<br>
  画面の入力項目をDBに登録する。<br>
  必須と表示されている項目が空白の場合に登録ボタンを押下すると「このフィールドを入力してください。」と表示する。<br>
  メールアドレスに関しては空白のバリデーションチェックの他にメールアドレスの形式になっているか(@がついているか)の<br>
  バリデーションチェックをしている<br>
  入力項目を適正に入力し、「登録」ボタンを押下すると登録成功の場合に登録完了画面に遷移する。<br>
  失敗した場合は登録失敗画面に遷移する。<br>
  Register.java<br>
  登録完了画面または、登録失敗画面にフォワードするコントローラ。<br>
  RegisterDAO.java<br>
  登録処理のDAO。<br>
  メールアドレスがACCOUNT1テーブルにすでに登録されている場合、NULLを返す。<br>
  メールアドレスがACCOUNT1テーブルに存在しない場合、ACCOUNT1テーブルにRegister.jsp(ユーザ登録画面)で<br>
  入力した内容を登録する。登録する際にパスワードを暗号化する。<br>
  登録した内容を返す。<br>
  Registergamen.java<br>
  登録完了画面または、登録失敗画面にフォワードするコントローラ。<br>
  Login.java<br>
  トップ画面または、ログイン失敗画面にフォワードするコントローラ。<br>
  loginResult.jsp(トップ画面)<br>
  ログインに成功した場合、ログイン画面で入力したユーザ名を表示する。<br>
  パスワード変更はこちらリンクを押下した場合、パスワード変更画面に遷移する。<br>
  機能説明はこちらリンクを押下した場合、機能説明画面に遷移する。<br>
  ログアウトリンクを押下した場合、ログアウト画面に遷移する。<br>
  ログインに失敗した場合、ログインに失敗しました。と表示する。<br>
  PassChange.java<br>
  パスワード変更完了画面または、パスワード変更失敗画面に遷移する。<br>
  PassChangeDAO.java<br>
  更新処理のDAO。<br>
  パスワードがすでに登録されているものの場合NULLを返す。<br>
  登録されていない場合、ACCOUNT1テーブルのパスワードを更新する。<br>
  更新する際にパスワードを暗号化する。<br>
  PasswordChangecomplete.jsp(パスワード変更完了画面)<br>
  パスワードが変更できた場合に遷移する画面。<br>
  PassChangefailure(パスワード変更失敗画面)<br>
  パスワード更新に失敗した場合に遷移する画面<br>
  Featuredescription.jsp(機能説明)<br>
  ソースの説明を記載している。<br>
  Featuredescription.java<br>
  機能説明画面にフォワードするコントローラ<br>
  Logout.java<br>
  セッションスコープを破棄し、ログアウト画面にフォワードする<br>
  logout.jsp<br>
  ログアウトリンクを押下した場合に遷移する。<br>
  User.java<br>
  DTOのクラス。<br>
  Encryption.java<br>
  パスワードを暗号化するロジックが記載されているクラス。
</body>
</html>