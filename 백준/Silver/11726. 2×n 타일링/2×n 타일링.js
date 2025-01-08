const input = require("fs").readFileSync("/dev/stdin").toString().split('\n')
// const input = require("fs").readFileSync('./input.txt').toString().split('\n')
const n = Number(input[0]);
dp = [1,1]
for (let i = 2; i <= n; i++) {
    dp[i] = (dp[i-1] + dp[i-2]) % 10007
}

console.log(dp[n])