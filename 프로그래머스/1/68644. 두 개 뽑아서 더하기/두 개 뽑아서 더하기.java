import java.util.*;
class Solution {
    public ArrayList solution(int[] numbers) {
        ArrayList answer = new ArrayList<Integer>();
    
        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                int num1 =numbers[i];
                int num2 =numbers[j];
                if(!answer.contains(num1+num2) ){
                    answer.add(num1+num2);
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }
}