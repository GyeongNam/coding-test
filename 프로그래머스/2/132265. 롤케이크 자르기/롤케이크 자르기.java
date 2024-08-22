import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
    
        int[] leftCount = new int[topping.length];
        int[] rightCount = new int[topping.length];
        
        Set<Integer> leftSet = new HashSet<>();
        for (int i = 0; i < topping.length; i++) {
            leftSet.add(topping[i]);
            leftCount[i] = leftSet.size();
        }
        
        Set<Integer> rightSet = new HashSet<>();
        for (int i = topping.length - 1; i >= 0; i--) {
            rightSet.add(topping[i]);
            rightCount[i] = rightSet.size();
        }
        
        for (int i = 0; i < topping.length - 1; i++) {
            if (leftCount[i] == rightCount[i + 1]) {
                answer++;
            }
        }
        
        return answer;
    }
}