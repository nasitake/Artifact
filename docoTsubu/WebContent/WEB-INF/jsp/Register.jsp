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
  <script>
    window.addEventListener("beforeunload", function (event) {
      var confirmationMessage = "入力内容を破棄します。";

      event.returnValue = confirmationMessage;
      return confirmationMessage;
    });
  </script>
</head>
<body>
    <header>
        <div class="container">
            〇×システム
        </div>
    </header>
  <div class="container">
    <div class="navbar">
      <h1>申し込みフォーム (サンプル)</h1>
    </div>

    <form action ="/docoTsubu/Register" method="post">

      <div class="row mb-3">
        <label class="col-sm-3 col-form-label">お名前 <span class="badge bg-danger">必須</span></label>
        <div class="col-sm-9">

          <div class="row">
            <label class="col-form-label col-sm-1">姓</label>
            <div class="col-sm">
              <input type="text"
                     name="sei"
                     autocomplete="family-name"
                     class="form-control"
                     placeholder="田中"
                     required/>
            </div>
            <label class="col-form-label col-sm-1">名</label>
            <div class="col-sm">
              <input type="text"
                     name="mei"
                     autocomplete="given-name"
                     class="form-control"
                     placeholder="太郎"
                     required/>
            </div>
          </div>
        </div>
      </div>

      <div class="row">
        <label class="col-sm-3 col-form-label">電話番号 <span class="badge bg-danger">必須</span></label>
        <div class="col-sm-9">
          <p>
            <input type="tel" name="tel" autocomplete="tel" class="form-control" placeholder="090-0000-0000" required/>
          </p>
        </div>
      </div>

      <div class="row">
        <label class="col-sm-3 col-form-label">郵便番号 <span class="badge bg-danger">必須</span></label>
        <div class="col-sm-9">
          <p>
            <input type="text" name="post" autocomplete="postal-code" class="form-control" placeholder="郵便番号"
                   required/>
          </p>
        </div>
      </div>

      <div class="row">
        <label class="col-sm-3 col-form-label">ご自宅住所 <span class="badge bg-danger">必須</span></label>
        <div class="col-sm-9">
          <div class="row mb-3">
            <label class="col-form-label col-sm-4">都道府県</label>
            <div class="col-sm-8">
              <input type="text" name="zyuusho1"
                     autocomplete="address-level1"
                     class="form-control"
                     placeholder="東京都" required/>
            </div>
          </div>
          <div class="row mb-3">
            <label class="col-form-label col-sm-4">市区町村</label>
            <div class="col-sm-8">
              <input type="text" name="zyuusho2" autocomplete="address-level2" class="form-control"
                     placeholder="中央区" required/>
            </div>
          </div>

          <div class="row mb-3">
            <label class="col-form-label col-sm-4">番地等</label>
            <div class="col-sm-8">
              <input type="text" name="banchi" autocomplete="address-line1" class="form-control"
                     placeholder="◯丁目◯番"
                     required/>
            </div>
          </div>


          <div class="row mb-3">
            <label class="col-form-label col-sm-4">建物名・部屋番号等</label>
            <div class="col-sm-8">
              <input type="text" name="tatemono" autocomplete="address-line2" class="form-control"
                     placeholder="コーポ◯◯ 101号室"/>
            </div>
          </div>

        </div>
      </div>

      <div class="row">
        <label class="col-sm-3 col-form-label">メールアドレス <span class="badge bg-danger">必須</span></label>
        <div class="col-sm-9">
          <p>
            <input type="email" name="email" autocomplete="email" class="form-control" placeholder="yourname@example.com"
                   required/>
          </p>
        </div>
      </div>

      <div class="row">
        <label class="col-sm-3 col-form-label">お勤め先</label>
        <div class="col-sm-9">
          <p>
            <input type="text"
                   name="thutomesaki"
                   autocomplete="organization"
                   autocorrect="off"
                   autocapitalize="off"
                   class="form-control"
                   placeholder="お勤め先"/>
          </p>
        </div>
      </div>
          <div class="row">
        <label class="col-sm-3 col-form-label">ユーザ名 <span class="badge bg-danger">必須</span></label>
        <div class="col-sm-9">
          <p>
            <input type="text"
                   name="username"
                   autocomplete="organization"
                   autocorrect="off"
                   autocapitalize="off"
                   class="form-control"/>
          </p>
        </div>
      </div>
      <div class="row">
        <label class="col-sm-3 col-form-label">パスワード <span class="badge bg-danger">必須</span></label>
        <div class="col-sm-9">
          <p>
            <input type="password"
                   name="pass"
                   autocomplete="organization"
                   autocorrect="off"
                   autocapitalize="off"
                   class="form-control"/>
          </p>
        </div>
      </div>
      <div class="text-center my-5">
        <button type="submit" class="btn btn-primary">登録 </button>
      </div>
    </form>
  </div>
</body>
</html>