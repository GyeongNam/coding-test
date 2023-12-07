import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        for(int i = 0; i<discount.length-9; i++){
            int count = 0;
            String[] arr = Arrays.copyOfRange(discount, i, i+10 );
            Map<String, Integer> map = new HashMap<>();
            for(String a : arr){
                map.put(a, map.getOrDefault(a, 0) + 1);
            }
            
            for(int j = 0; j<want.length; j++){
                if(map.containsKey(want[j])){
                    if(map.get(want[j]) >= number[j]){
                        count++;
                    }
                }
            }
            if(want.length == count){
                answer++;
            }
        }
        return answer;
    }
}