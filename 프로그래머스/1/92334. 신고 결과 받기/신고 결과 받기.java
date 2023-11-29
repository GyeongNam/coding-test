import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        int[] answer = new int[id_list.length];
        
        Map<String, HashSet<String>> map = new HashMap<>(); 
        Map<String, Integer> map2 = new HashMap<>();    
        
        for(int i = 0; i<id_list.length; i++){      
            map.put(id_list[i], new HashSet<>());   // 누가 
            map2.put(id_list[i], i);                // 몇번 당했는지
        }
  
        for(String s : report) {
            String[] str = s.split(" ");				
            map.get(str[1]).add(str[0]);        // 누가에 누구를 set으로 추가까지
        }
        
        for(int i = 0 ; i<id_list.length; i++){
            HashSet<String> set = map.get(id_list[i]); 
            if (set.size() >= k) {      // 신고 당한 사람이 k보다 클때 
                for (String s : set) {
                    answer[map2.get(s)]++;  // 각 인원에 신고추가
                }
            }
        }
        return answer;
    }
}