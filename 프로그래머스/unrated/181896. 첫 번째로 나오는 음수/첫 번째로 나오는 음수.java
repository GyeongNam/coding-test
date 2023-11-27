class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        int i=0;
        for(int v : num_list){
            if(v<0){
                answer = i;
                break;
            }
            i++;
        }
        return answer;
    }
}