class Solution {
    public int solution(int n) {
   
        
        int answer = 0;
        int counter = 1;
        while (true){
            if (n * counter % 6 == 0) {
                answer = n * counter / 6;
                break;
            }
            counter++;
        }
        return answer;
    }
}