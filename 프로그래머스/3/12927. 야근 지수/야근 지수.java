import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : works){
            q.offer(num);
        }
        for (int i =0; i<n; i++){
            q.offer(q.poll()-1);
        }
        if(q.peek() <= 0){
            return 0;
        }else{
            for(int num :q){
                answer += (long) Math.pow(num,2);
            }
        }
        System.out.println(answer);
        return answer;
    }
}