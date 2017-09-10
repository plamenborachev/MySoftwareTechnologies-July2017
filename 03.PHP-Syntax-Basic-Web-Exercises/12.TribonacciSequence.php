<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
<form>
    N: <input type="text" name="num" />
    <input type="submit" />
</form>
<?php
if (isset($_GET['num'])){
    $n = intval($_GET['num']);
    $n1 = 1;
    $n2 = 0;
    $n3 = 0;
    $result = 0;

    for ($i = 1; $i <= $n; $i++) {
        $result = $n1 + $n2 +$n3;
        $n1 = $n2;
        $n2 = $n3;
        $n3 = $result;

        echo "$result ";
    }
}
?>
</body>
</html>