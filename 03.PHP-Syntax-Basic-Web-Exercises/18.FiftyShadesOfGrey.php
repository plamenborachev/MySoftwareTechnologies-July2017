<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
    <style>
        div {
            display: inline-block;
            margin: 5px;
            width: 20px;
            height: 20px;
        }
    </style> 
</head>
<body>
    <?php
    for ($rows = 0; $rows < 5; $rows ++) {
        for ($cols = 0; $cols < 10; $cols++) {
            $color = $rows * 51 + $cols * 5;

            echo "<div style=\"background-color: rgb($color, $color, $color);\"></div>";

        }
        echo "<br>";
    }
    ?>
</body>
</html>