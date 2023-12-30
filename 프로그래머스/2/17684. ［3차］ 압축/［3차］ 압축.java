import java.util.*;
class Solution {
    public int[] solution(String msg) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
 
        char word = 'A';
        for (int i = 1; i <= ('Z' - 'A') + 1; i++) {
            map.put(word + "", i);
            word += 1;
        }
 
        int idx = 0;
        while (idx < msg.length()) {
            String str = "";
            while (idx < msg.length()) {
                if (!map.containsKey(str + msg.charAt(idx))) {
                    break;
                } else {
                    str += msg.charAt(idx);
                }
                idx++;
            }
            list.add(map.get(str));
 
            if (idx < msg.length()) {
                map.put(str + msg.charAt(idx), map.size() + 1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}