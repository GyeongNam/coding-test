import java.util.*;
class Solution {
    public long solution(int n) {
        long answer = 0;
        int[] arr = new int[n];
        
        if(n==1){
            return 1;
        }
        
        arr[0] = 1;
        arr[1] = 2;
        
        for(int i = 2; i<n; i++){
             arr[i] = (arr[i-1]+arr[i-2])%1234567;
        }
        System.out.println(Arrays.toString(arr));
        answer =  arr[n-1];
        return answer;
    }
}