import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        // int answer = 0;
        // int max = 0;
        // int max_index = 0;
        // for(int i = 0; i<priorities.length; i++){
        //     if(max < priorities[i]){
        //         max = priorities[i];
        //         max_index = i;
        //     }
        // }
        // int count = 0;
        // int tmp = 0;
        // while(true){
        //     if(max_index == location){
        //         count++;
        //         break;
        //     }else{
        //         if(max_index<priorities.length){
        //             max_index++;
        //             count++;
        //         }else if (max_index == priorities.length) {
        //             max_index = 0;
        //         }
        //     }
        // }
        // answer = count;
        // return answer;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i : priorities) {
            q.offer(i);
        }

        while (!q.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (q.peek() == priorities[i]) {
                    q.poll();
                    answer++;

                    if (location == i) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}