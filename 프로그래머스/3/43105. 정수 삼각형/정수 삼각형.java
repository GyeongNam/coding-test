import java.util.*;
class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int[][] dp = new int [triangle.length][];
        for(int i = 0; i<triangle.length; i++){
            dp[i] = new int[triangle[i].length];
            for (int j = 0; j < triangle[i].length; j++) {
                dp[i][j] += triangle[i][j];
            }
        }

        for(int i = 0; i<dp.length-1; i++){
            for (int j = 0; j < triangle[i].length; j++) {
                if(i == 0){
                    dp[i+1][j] += dp[i][j];
                    dp[i+1][j+1] += dp[i][j];
                }else{
                    if(dp[i+1][j] < dp[i][j] + triangle[i+1][j]){
                        dp[i+1][j] = dp[i][j] + triangle[i+1][j];
                    }
                    dp[i+1][j+1] += dp[i][j];
                }
            }
        }
        answer = Arrays.stream(dp[dp.length-1]).max().getAsInt();
        return answer;
    }
}