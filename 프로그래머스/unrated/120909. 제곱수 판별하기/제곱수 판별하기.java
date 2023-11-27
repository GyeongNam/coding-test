import java.lang.Math;

class Solution {
    public int solution(int n) {
        int answer = 1;
        double sqrt = Math.sqrt(n);
        if( sqrt % 1 != 0 ){
            answer = 2;
        }
        return answer;
    }
}