class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int x = n*12000; 
        int y = 0;
        
        if(n/10 > 0){
            y = (k-(n/10)) * 2000;
        }else{
            y = k * 2000;
        }
        
        return x+y;
    }
}