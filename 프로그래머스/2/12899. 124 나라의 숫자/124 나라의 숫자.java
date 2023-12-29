import java.util.*;
class Solution {
    public String solution(int n) {
        int[] values = {0,1,2,4};
        List<Integer> list = new ArrayList<>();

        while(n > 3){
            int q = n/3;
            int r = n%3;
            if(r == 0){
                q = q-1;
                r = r+3;
            }
            n = q;
            list.add(r);
        }

        if(n < 4){
            list.add(n);
        }
        StringBuffer sb = new StringBuffer();
        list.forEach(v -> sb.append(values[v]));

        return sb.reverse().toString();
    }
}