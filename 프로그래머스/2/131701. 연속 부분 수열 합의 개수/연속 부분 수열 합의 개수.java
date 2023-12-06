import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 1; i <= elements.length; i++){  
            for (int j = 0; j < elements.length; j++) {
                int tmp = 0;
                for(int k = j; k < i+j; k++){
                    tmp += elements[k%elements.length];
                }
                set.add(tmp);
            }  
        }
        answer = set.size();
        return answer;
    }
}