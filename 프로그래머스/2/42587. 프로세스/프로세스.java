import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
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


//     public int solution(int[] priorities, int location) {
//         int answer = 0;
//         Queue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
//             @Override
//             public int compare(int[] o1, int[] o2) {
//                 return o2[1] - o1[1];
//             }
//         });
        
//         List<int[]> polledList = new ArrayList<>();
//         for (int i = 0; i < priorities.length; i++) {
//             pq.offer(new int[]{i, priorities[i]});
//         }
//         int size = pq.size();
//         int[] polled = new int[1];
//         while(!pq.isEmpty()) {
//             polledList.add(pq.poll());
//         }
//         for (int i = 0; i < polledList.size(); i++) {
//             if (polledList.get(i)[0] == location) {
//                 answer = i + 1;
//             }
//         }
     
//         return answer;
//     }
}