import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int j = 0; j<s.length(); j++){
            if(j != 0){
                s = s.substring(1,s.length()) + s.charAt(0);
            }
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i< s.length(); i++){         
                if(s.charAt(i) == '('){
                    stack.push(s.charAt(i));
                } else if(s.charAt(i) == '{'){
                    stack.push(s.charAt(i));
                } else if(s.charAt(i) == '['){
                    stack.push(s.charAt(i));
                } else if(!stack.empty() && s.charAt(i) == ')' && stack.peek() == '('){
                    stack.pop();
                } else if(!stack.empty() && s.charAt(i) == '}' && stack.peek() == '{' ){
                    if(!stack.empty()){
                        stack.pop();
                    }
                    
                } else if( !stack.empty() && s.charAt(i) == ']' && stack.peek() == '['){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }
            if(stack.size() == 0){
                answer++;
            }
        }
        return answer;
    }
}