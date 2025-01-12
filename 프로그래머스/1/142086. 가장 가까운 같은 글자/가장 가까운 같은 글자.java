import java.util.*;
class Solution {
    public ArrayList solution(String s) {
        ArrayList answer = new ArrayList();
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i = 0; i<s.length(); i++){
            String key = s.charAt(i) + "";
            if (map.containsKey(key)) {
                Integer value = map.get(key) + 1;
                map.put(key, value);
            }else{
                map.put(key, 0);
            }
            
            if(map.get(key) == 0){
                answer.add(-1);
            }else{
                answer.add(map.get(key));
            }
            Set<String> keys = map.keySet();
            for (String key2 : keys) {
                Integer value = map.get(key2) + 1;
                map.put(key2, value);
            }
            map.put(key, 0);
        }
        return answer;
    }
}