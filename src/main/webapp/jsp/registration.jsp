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
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="primaryStyle.css">
    <title>Регистрация</title>
</head>
<body>
<form action="/registration" method="post" class="form">

    <div class="container">
        <h1>Регистрация</h1>
        <p>Пожалуйста, заполните поля ниже, чтобы зарегистрироваться.</p>


        <label><b>Логин</b></label>
        <input type="text" id="nickname" name="nickname" placeholder="Введите имя пользователя">

        <label><b>Пароль</b></label>
        <input type="password" id="password" name="password" placeholder="Введите пароль">





        <button type="submit">Зарегистрироваться</button>
    </div>


    <p>Уже есть аккаунт? <a href="login.jsp">Войти</a>.</p>


</form>

</body>
</html>
