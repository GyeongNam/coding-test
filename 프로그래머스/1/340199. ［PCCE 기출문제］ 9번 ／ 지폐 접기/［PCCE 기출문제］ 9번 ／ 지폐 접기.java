import java.lang.*;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while(true){
            int Wmin = Math.min(wallet[0],wallet[1]);
            int Wmax = Math.max(wallet[0],wallet[1]);
            int Bmin = Math.min(bill[0],bill[1]);
            int Bmax = Math.max(bill[0],bill[1]);
            if(!(Bmin>Wmin || Bmax>Wmax)){
                break;
            }
            if(bill[0]>bill[1]){
                bill[0]/=2;
            }else{
                bill[1]/=2;
            }
            answer++;
        }
        return answer;
    }
}