class Solution {
    public int solution(String myString, String pat) {
        String text = "";
        for(int i = 0; i<myString.length(); i++){
            if('A' == myString.charAt(i)){
                text += "B";
            }else{
                text += "A";
            }
        }
        return text.contains(pat) ? 1 : 0;
    }
}