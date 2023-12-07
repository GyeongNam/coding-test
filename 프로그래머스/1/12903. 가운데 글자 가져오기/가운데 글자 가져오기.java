class Solution {
    public String solution(String s) {
        String answer = s.substring((s.length()-1)/2, s.length()/2 + 1);
        // if(s.length()%2==0){
        //     answer = ""+s.charAt(s.length()/2-1) + s.charAt(s.length()/2);
        // }else{
        //     answer = ""+s.charAt(s.length()/2);
        // }
        return answer;
    }
}