<?php

function dfs($graph, &$visited, $node) {
    echo $node . " ";
    $visited[$node] = true;
    
    foreach ($graph[$node] as $neighbor) {
        if (!$visited[$neighbor]) {
            dfs($graph, $visited, $neighbor);
        }
    }
}

function bfs($graph, $start) {
    $visited = array_fill(0, count($graph), false);
    $queue = [];
    array_push($queue, $start);
    $visited[$start] = true;
    
    while (!empty($queue)) {
        $node = array_shift($queue);
        echo $node . " ";
        
        foreach ($graph[$node] as $neighbor) {
            if (!$visited[$neighbor]) {
                $visited[$neighbor] = true;
                array_push($queue, $neighbor);
            }
        }
    }
}

list($n, $m, $v) = explode(" ", trim(fgets(STDIN)));

$graph = array_fill(0, $n + 1, []);

for ($i = 0; $i < $m; $i++) {
    list($a, $b) = explode(" ", trim(fgets(STDIN)));
    $graph[$a][] = $b;
    $graph[$b][] = $a;
}

for ($i = 1; $i <= $n; $i++) {
    sort($graph[$i]);
}

$visited = array_fill(0, $n + 1, false);
dfs($graph, $visited, $v);
echo "\n";

bfs($graph, $v);
echo "\n";
?>
