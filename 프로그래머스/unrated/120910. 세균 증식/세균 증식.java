class Solution {
    public long  solution(int n, int t) {
        long answer = 0;
        for(int i = 1; i<=t; i++){
            answer = n*2;
            n *= 2;
        }
        return answer;
    }
}