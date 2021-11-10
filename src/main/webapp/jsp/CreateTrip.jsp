<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="../css/CreateTrip.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Создание поездки</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/CreateTrip" method="post" class="form">

    <div class="container">
        <h1>Создание поездки</h1>
        <p>Заполните поля, чтобы создать поездку.</p>


        <label><b>Откуда?</b></label>
        <input type="text" placeholder="Введите стартовую точку" name="From" required>

        <label><b>Куда?</b></label>
        <input type="text" placeholder="Введите конечную точку" name="To" required>

        <label><b>Сколько будет стоить поездка?</b></label>
        <input type="text" placeholder="Стоимость поездки" name="cost" required>



        <button type="submit" class="createTripbtn">Поехали!</button>
    </div>
</form>



</form>

</body>
</html>