<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Caculator</title>
  </head>
  <body>
  <h2 style="color: darkblue">Caculator</h2>
  <form action="/calculator" method="post">
    <input type="number" name="input">
    <input type="number" name="input2">
    <input type="submit" name="calcul" value="+">
    <input type="submit" name="calcul" value="-">
    <input type="submit" name="calcul" value="*">
    <input type="submit" name="calcul" value="/">
  </form>

  <h3>Result : ${result}</h3>
  </body>
</html>
