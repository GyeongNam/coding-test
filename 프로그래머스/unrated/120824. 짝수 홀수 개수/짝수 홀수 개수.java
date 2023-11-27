class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int i : num_list){
            if(i%2==0){
                answer[0] += 1; // 짝수
            }else{
                answer[1] += 1; // 홀수
            }
        }
        return answer;
    }
}