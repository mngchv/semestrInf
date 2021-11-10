<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../css/index.css">
    <meta charset="utf-8">
    <title>
        Give a Ride - Официальный Сайт | Знакомства ПОПУТЧИКОВ. Поиск Попутчика куда угодно, на чем удобно.
    </title>
</head>
<body>

<%--<div>--%>
<%--    <img src="https://kotone.net/wp/wp-content/uploads/2019/02/89b897950d08e8bb7605c867321de8dd_m.jpg">--%>
<%--</div>--%>

<div class="topnav">
    <a class="active" href="/index">Home</a>
    <a href="/registration">Quit</a>
    <div class="logo"><img src="https://a.radikal.ru/a14/2110/31/817d215d63e3.png"  width="181px" height="181px" alt="titleImg"></div>
</div>





<a href="/index"><img src="https://d.radikal.ru/d07/2110/1e/2196bf2925b4.png" width="300px" height="120px" alt="headImg"></a>


<%--    <p><a href="/CreateTrip">+ Создать поездку!</a>.</p>--%>
<form action="/CreateTrip">
    <button type="submit" class="createbtn">
         + Создать поездку!
    </button>
</form>




<%--<div id="footer">--%>
<%--    <a href="About.html"> О нас </a> <br>--%>
<%--    <a href="privacyPolicy.html">Политика конфиденциальности</a><br>--%>
<%--    <a href="paymentMethod.html">Способ оплаты</a><br>--%>
<%--</div>--%>

<ul class="social-icons">
    <li><a class="social-icon-fb" href="https://www.facebook.com/profile.php?id=100005315116478" title="facebook" target="_blank" rel="noopener"></a></li>
    <li><a class="social-icon-vk" href="https://vk.com/mngchv" title="VK" target="_blank" rel="noopener"></a></li>
    <li><a class="social-icon-telegram" href="#" title="Tg" target="_blank" rel="noopener"></a></li>
</ul>

<section class="grid">
    <article class="grid-item">
        <div class="image">
            <img src="https://mtdata.ru/u28/photo420A/20020120234-0/original.jpg"  alt=""/>
        </div>

            <div class="info-text">
                <p>Откуда:</p>
                <p>Куда:</p>
                <p>Места:</p>
                <p>Стоимость:</p>
                <p>Авто:</p>
                <p>Время:</p>

        </div>
    </article>


    <article class="grid-item">
        <div class="image">
            <img src="https://mtdata.ru/u28/photo420A/20020120234-0/original.jpg"  alt=""/>
        </div>

        <div class="info-text">
            <p>Откуда:</p>
            <p>Куда:</p>
            <p>Места:</p>
            <p>Стоимость:</p>
            <p>Авто:</p>
            <p>Время:</p>

        </div>
    </article>


    <article class="grid-item">
        <div class="image">
            <img src="https://mtdata.ru/u28/photo420A/20020120234-0/original.jpg"  alt=""/>
        </div>

        <div class="info-text">
            <p>Откуда:</p>
            <p>Куда:</p>
            <p>Места:</p>
            <p>Стоимость:</p>
            <p>Авто:</p>
            <p>Время:</p>

        </div>
    </article>

</section>


</body>
</html>
