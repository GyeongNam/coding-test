import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int[] length = new int[strArr.length];
        int count = 0;
        for(String s : strArr){
            length[count] = s.length();
            count++;
        }
     

        Arrays.sort(length);

        int max = 1;
        int temp = 1;
        for(int i = 1 ; i<length.length; i++){
            if(length[i]==length[i-1]){
                temp++;
            }else{
                temp = 1;
            }
            if(temp >= max){
                max = temp;
            }
        }

        return max;

//         HashMap<Integer,Integer> map = new HashMap<>();
//         for (String str : strArr) {
// 			int length = str.length();
// 			map.put(length, map.getOrDefault(length, 0) + 1);
// 		}

//         int answer = 0;
// 		for (int count : map.values()) {
// 			answer = Math.max(answer, count);
// 		}
//         return answer;
    }
}