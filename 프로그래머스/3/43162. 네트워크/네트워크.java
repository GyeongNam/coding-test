import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                dfs(computers, i, visited);
            }
        }
        System.out.println(answer);
        return answer;
    }
        public static void dfs(int[][] computers, int i, boolean[] visited){
        visited[i] = true;

        for (int j = 0; j < computers.length; j++) {
            if (i != j && computers[i][j] == 1 && !visited[j]) {
                dfs(computers, j, visited);
            }
        }
    }
}