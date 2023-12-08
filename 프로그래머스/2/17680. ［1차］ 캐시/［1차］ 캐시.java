import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> q = new LinkedList<>();
        for( String str : cities){
            str = str.toUpperCase();
            if(q.contains(str)){    // 큐에 있을경우
                q.remove(str);
                q.add(str);
                answer++;
                
            }else{  // 큐에 없을 경우
                if(q.size()<cacheSize){
                    q.add(str);
                }else{
                    q.add(str);
                    q.poll();
                }
                answer += 5;
            }
            //System.out.println(q);
        }
        return answer;
    }
}


