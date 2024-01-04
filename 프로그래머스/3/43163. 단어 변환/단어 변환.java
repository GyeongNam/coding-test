import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
int answer = 0;
        boolean[] visited = new boolean[words.length];
        Queue<String> q = new LinkedList<>(); 
        Set<String> set = new HashSet<>(Arrays.asList(words));
        if(!set.contains(target)){
            return 0;
        }
        q.offer(begin);
        set.remove(begin);
        while (!q.isEmpty()){
            for (int i=0; i<q.size(); i++){
                String temp = q.poll();
                if (temp.equals(target)){
                    return answer;
                }
                for (String word : set.toArray(new String[set.size()])){
                    if(convert(temp,word)){
                        q.offer(word);
                        set.remove(word);
                    }
                }
            }
            answer++;
        }
        return 0;
    }
        static private boolean convert(String word1, String word2){
        int diffCnt = 0;
        for (int i = 0; i<word1.length(); i++){
            if (word1.charAt(i) != word2.charAt(i)){
                diffCnt++;
            }
        }
        return diffCnt == 1;
    }
}
