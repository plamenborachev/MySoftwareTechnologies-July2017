<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        N: <input type="text" name="num1" />
		M: <input type="text" name="num2" />
        <input type="submit" />
    </form>
    <?php
        if (isset($_GET['num1']) && isset($_GET['num2'])){
            $n1 = intval($_GET['num1']);
            $n2 = intval($_GET['num2']);

            if ($n2 >= $n1){
                $n3 = $n1 * $n2;
            }
            else{
                $n3 = $n1 / $n2;
            }

            echo $n3;
        }
    ?>
</body>
</html>