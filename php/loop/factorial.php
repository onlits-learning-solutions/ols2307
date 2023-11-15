<?php
$fact = 1;
$n = readline("Enter a number: ");
for($i=$n; $i>=1; $i--)
    $fact *= $i;

echo "Factorial of $n is $fact.\n";