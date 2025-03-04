import java.io.*;
import java.util.*;

public class Main {
    public static int countCoinCases(int n, int k, int[] coins) {
        int[] dp = new int[k + 1];
        dp[0] = 1;  

        for (int coin : coins) {
            for (int j = coin; j <= k; j++) {
                dp[j] += dp[j-coin];  
            }
        }

        return dp[k];  
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(countCoinCases(n, k, coins));
    }
}