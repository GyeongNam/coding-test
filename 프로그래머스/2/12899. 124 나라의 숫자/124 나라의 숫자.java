import java.util.*;
class Solution {
    public String solution(int n) {
//         int[] values = {0,1,2,4};
//         List<Integer> list = new ArrayList<>();

//         while(n > 3){
//             int q = n/3;
//             int r = n%3;
//             if(r == 0){
//                 q = q-1;
//                 r = r+3;
//             }
//             n = q;
//             list.add(r);
//         }

//         if(n < 4){
//             list.add(n);
//         }
//         StringBuffer sb = new StringBuffer();
//         list.forEach(v -> sb.append(values[v]));

//         return sb.reverse().toString();
      String[] num = {"4","1","2"};
      String answer = "";

      while(n > 0){
          answer = num[n % 3] + answer;
          n = (n - 1) / 3;
      }
      return answer;
    }
}