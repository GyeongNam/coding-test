import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder answerBuilder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int len = number.length();
        
        for (int i = 0; i < len; i++) {
            char currentChar = number.charAt(i);
            
            while (!stack.isEmpty() && k > 0 && stack.peek() < currentChar) {
                stack.pop();
                k--;
            }
            
            stack.push(currentChar);
        }
        
        while (k > 0) {
            stack.pop();
            k--;
        }
        
        while (!stack.isEmpty()) {
            answerBuilder.append(stack.pop());
        }
        
        return answerBuilder.reverse().toString();
    }
}
