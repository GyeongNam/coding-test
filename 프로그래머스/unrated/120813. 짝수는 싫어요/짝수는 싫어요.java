class Solution {
    public int[] solution(int n) {
        int[] answer ={};
        if(n%2 ==0){
            answer = new int[n/2];
        }else{
            answer = new int[n/2+1];
        }
 
        int j=0;
        for(int i=0; i<=n; i++){
            if(i%2 !=0){
                answer[j] = i;
                j++;
            }
        }
        return answer;
    }
}