<%--
  Created by IntelliJ IDEA.
  User: rming
  Date: 16.10.2021
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="primaryStyle.css">
    <title>Авторизация</title>
</head>
<body>


<form action="/login" method="post" class="form">

    <div class="container">
        <h1>Авторизация</h1>
        <p>Пожалуйста, заполните поля ниже, чтобы войти.</p>


        <label><b>Email</b></label>
        <input type="text" id="nickname" name="nickname" placeholder="Введите Email-адрес">

        <label><b>Пароль</b></label>
        <input type="password" id="password" name="password" placeholder="Введите пароль">





        <button type="submit">Войти</button>
    </div>

<%--   <p>Забыли пароль? <a href="resetPassword.html">Восстановить пароль</a>.</p>&ndash;%&gt;--%>
</form>


</body>
</html>
