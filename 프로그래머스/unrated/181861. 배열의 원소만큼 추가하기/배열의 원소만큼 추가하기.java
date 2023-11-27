import java.util.*;
class Solution {
    public ArrayList solution(int[] arr) {
        ArrayList answer = new ArrayList<>();
        for(int element: arr) {
            for(int i=0; i<element; i++){
                answer.add(element);
            }
        }
        return answer;
    }
}