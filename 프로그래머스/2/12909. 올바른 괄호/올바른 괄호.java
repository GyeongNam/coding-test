class Solution {
    boolean solution(String s) {
        int stack = 0;
        
        if(s.charAt(0) == ')'){
            return false;
        }
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack++;
            }else{
                if(stack == 0){
                    return false;
                }
                stack--;
            }
        }
        return stack == 0 ? true : false;
    }
}