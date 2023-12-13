import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> q = new PriorityQueue<>();
        for(int n : scoville){
            q.add(n);
        }
        while (q.peek()<K){
            if(q.size() ==1){
                return  -1;
            }
            q.add(q.poll()+q.poll()*2);
            answer++;
        }
        return answer;
        
        // // 배열 풀이 효율성 탈락.
        // int answer = 0;
        // for (int i = 0; i<scoville.length-1; i++){
        //     Arrays.sort(scoville);
        //     if (Arrays.stream(scoville).filter(a->a!=-1).min().getAsInt() >= K){
        //         break;
        //     }
        //     scoville[i+1] = scoville[i] + scoville[i+1]*2;
        //     scoville[i] = -1;
        //     answer++;
        // }
        // if(scoville.length-1 == answer && scoville[scoville.length-1] < K){
        //     return -1;
        // }
        // return answer;
        
        // // 리스트 풀이 효율성 탈락.
        // int answer = 0;
        // List<Integer> list = new ArrayList<>();
        // for(int n : scoville){
        //     list.add(n);
        // }
        // while (Collections.min(list) < K){
        //     if(list.size() < 2){
        //         return -1;
        //     }
        //     Collections.sort(list);
        //     list.add(list.get(0) + list.get(1)*2);
        //     list.remove(0);
        //     list.remove(0);
        //     answer++;
        // }
        // System.out.println(answer);
        // return answer;
    }
}