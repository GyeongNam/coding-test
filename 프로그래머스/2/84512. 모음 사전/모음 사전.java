import java.util.*;
class Solution {
    public int solution(String word) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        String[] strs = {"A","E","I","O","U"};
        for(int i = 0 ; i<word.length(); i++){
            dfs(list, strs, "", 0);
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }
        public static void dfs(ArrayList<String> list, String[] strs, String str, int depth){
        list.add(str);

        if(depth == 5) {
            return;
        }

        for (int i = 0; i < strs.length; i++) {
            dfs(list, strs, str + strs[i], depth + 1);
        }
    }
}