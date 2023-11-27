import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";

        for(char a : my_string.toCharArray()){
            if(Character.isLowerCase(a)){
                answer += Character.toUpperCase(a);
            }else{
                answer += Character.toLowerCase(a);
            }
        }
        return answer;
    }
}