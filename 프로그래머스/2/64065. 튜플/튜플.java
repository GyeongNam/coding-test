import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.replaceAll("[}{]","");
        String[] str = s.split(",");
        HashMap<String, Integer> map = new HashMap ();
        for(String st : str){
            map.put(st, map.getOrDefault(st, 0)+1);
        }
        int[] answer = new int[map.size()];
        List<String> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        for (int i = 0; i<keySet.size(); i++) {
             answer[i] = Integer.parseInt(keySet.get(i));
        }
        return answer;
    }
}