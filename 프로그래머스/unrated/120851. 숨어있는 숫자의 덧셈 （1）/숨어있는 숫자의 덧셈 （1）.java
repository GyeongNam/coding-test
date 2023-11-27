class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String match = "[^0-9]";
        String string = my_string.replaceAll(match, "");
        for(int i= 0; i<string.length(); i++){
            answer += Integer.parseInt(String.valueOf(string.charAt(i)));
        }
        return answer;
    }
}