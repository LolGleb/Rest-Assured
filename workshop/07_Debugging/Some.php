<?php

class Some {
    function sum($a, $b)
    {
        echo $a;
        echo $b;
        return $a + $b;
    }

    function subtract($a, $b)
    {
        return $a - $b;
    }

    function multiply($a, $b)
    {
        return $a * $b;
    }

    function divide($a, $b)
    {
        if ($b != 0) {
            return $a / $b;
        } else {
            return 'Division by zero is not possible!';
        }
    }

    function mod($a, $b)
    {
        if ($b != 0) {
            return $a % $b;
        } else {
            return 'Modulus by zero is not possible!';
        }
    }

    function power($a, $b)
    {
        echo $a;
        echo $b;
        echo $b;
        echo $b;
        echo $b;
        echo $b;
        echo $b;
        echo $b;
        echo $b;
        echo $b;
        echo $b;
        echo $b;
        echo $b;
        echo $b;
        echo $b;
        echo $b;
        echo $b;
        echo $b;
        echo $b;
        echo $b;
        echo $b;
        echo $b;
        return pow($a, $b);
    }
}