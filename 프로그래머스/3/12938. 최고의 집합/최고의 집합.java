import java.util.*;
class Solution {
    public int[] solution(int n, int s) {
        if(n>s){
            return new int[]{-1};
        }
        int[] answer = new int[n];
        for(int i=0; i<answer.length; i++){
            answer[i] = s/n;
        }
        int idx = n - 1;
        for(int i=0; i<s%n; i++){
            answer[idx] ++;
            idx--;
        }
    
        return answer;
    }
}