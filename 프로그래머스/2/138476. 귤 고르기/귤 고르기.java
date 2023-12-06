import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int tmp = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : tangerine){
             map.put(i, map.getOrDefault(i, 0) + 1);
        }
  
         List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        for(int i = 0; i<keySet.size(); i++){
            if(tmp<k){
                answer++;
                tmp += map.get( keySet.get(i) );
            }
        }

        return answer;
    }
}