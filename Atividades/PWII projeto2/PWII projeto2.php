<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aula</title>
</head>
<body>
    <?php 
    if (isset($_GET['oper']) && ($_GET['n1']) && ($_GET['n2'])){
        if ($_GET['oper'] == "add") {
            echo "adição ";
            echo $_GET['n1'] + $_GET['n2'];
        }else if ($_GET['oper'] == "sub") {
            echo "subtração ";
            echo $_GET['n1'] - $_GET['n2'];
        }else if ($_GET['oper'] == "multi") {
            echo "multiplicação ";
            echo $_GET['n1'] * $_GET['n2'];
        }else if ($_GET['oper'] == "div") {
            echo "divisão ";
            echo $_GET['n1'] / $_GET['n2'];
        }else{
            echo "inválido";
        }
    }
    ?>
</body>
</html>