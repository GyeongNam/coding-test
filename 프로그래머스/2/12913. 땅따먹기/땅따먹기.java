import java.util.*; 
class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int[][] dp_list = land.clone();;
        
        for(int i = 0; i<land.length; i++){
            if(i+1 < land.length){
                dp_list[i+1][0] = Math.max(Math.max(land[i][1], land[i][2]), land[i][3]) + dp_list[i+1][0];
                dp_list[i+1][1] = Math.max(Math.max(land[i][0], land[i][2]), land[i][3]) + dp_list[i+1][1];
                dp_list[i+1][2] = Math.max(Math.max(land[i][1], land[i][0]), land[i][3]) + dp_list[i+1][2];
                dp_list[i+1][3] = Math.max(Math.max(land[i][1], land[i][2]), land[i][0]) + dp_list[i+1][3];
            }
        }
        
        answer = Arrays.stream(dp_list[dp_list.length-1]).max().getAsInt();
        return answer;
    }
}