const input = require("fs").readFileSync("/dev/stdin").toString().split('\n');
// const input = require("fs").readFileSync('./input.txt').toString().split('\n');
const [N, M, V] = input[0].split(" ").map(Number);
let graph = [];
let result = '';

function dfs(v, visited) {
  if (visited[v]) {
    return;
  }
  result += v + ' ';
  visited[v] = true;
  for (let i = 1; i <= N; i++) {
    if (!visited[i] && graph[v][i] === 1) {
      dfs(i, visited);
    }
  }
}

function bfs(v, visited) {
  let queue = [v];
  visited[v] = true;
  while (queue.length > 0) {
    v = queue.shift();
    result += v + ' ';
    for (let i = 1; i <= N; i++) {
      if (!visited[i] && graph[v][i] === 1) {
        queue.push(i);
        visited[i] = true;
      }
    }
  }
}

for (let i = 0; i <= N; i++) {
  graph[i] = Array(N + 1).fill(0);
}

for (let i = 1; i <= M; i++) {
  const [x, y] = input[i].split(" ").map(Number);
  graph[x][y] = graph[y][x] = 1;
}

dfs(V, Array(N + 1).fill(false));
result += '\n';
bfs(V, Array(N + 1).fill(false));

console.log(result);
