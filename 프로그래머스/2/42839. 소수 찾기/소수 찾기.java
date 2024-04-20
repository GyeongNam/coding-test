import java.util.*;

class Solution {
    
    static Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        boolean[] visited = new boolean[numbers.length()];
        
        int answer = 0;
        dfs(numbers, "", 0, visited);
        for (Integer num : set) {
            if (isPrime(num)) {
                answer++;
            }
        }
 
        return answer;
    }
    
    public static void dfs(String numbers, String str, int depth, boolean[] visited) {
        if(depth > numbers.length()){
            return;
        }
        for(int i = 0; i<numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                set.add(Integer.parseInt(str + numbers.charAt(i)));
                dfs(numbers ,str + numbers.charAt(i), depth + 1, visited); // depth++ 대신 depth + 1로 수정
                visited[i] = false;
            }
        }
    }
    
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
 
        return true;
    }
}