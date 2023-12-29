class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] dp = new int[n][m];
        for(int[] a : puddles){
            dp[a[1]-1][a[0]-1] = -1;
        }
        dp[0][0] = 1;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (dp[i][j] != -1) {
                    if (i >= 1 && dp[i - 1][j] != -1) {
                        dp[i][j] += dp[i - 1][j];
                    }
                    if (j >= 1 && dp[i][j - 1] != -1) {
                        dp[i][j] += dp[i][j - 1];
                    }
                    if (dp[i][j] > 1000000007) {
                        dp[i][j] %= 1000000007;
                    }
                }
            }
        }
        answer = dp[n-1][m-1];
        System.out.println(answer);
        return answer;
    }
}