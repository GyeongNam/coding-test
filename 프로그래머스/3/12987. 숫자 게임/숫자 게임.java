import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        PriorityQueue<Integer> AQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> BQ = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i < A.length; i++){
            AQ.offer(A[i]);
            BQ.offer(B[i]);
        }

        for (int i = 0; i < A.length; i++) {
            if (AQ.peek() < BQ.peek()) {
                BQ.poll();
                AQ.poll();
                answer++;
            } else {
                AQ.poll();
            }
        }
        return answer;
    }
}