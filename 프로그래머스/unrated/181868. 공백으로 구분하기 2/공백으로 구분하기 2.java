class Solution {
    public String[] solution(String my_string) {
        my_string = my_string.replaceAll("\\s+" , " ");
        String[] answer = my_string.trim().split("\\s");
     
        return answer;
    }
}