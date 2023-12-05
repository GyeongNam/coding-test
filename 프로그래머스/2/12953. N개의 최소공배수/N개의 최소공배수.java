class Solution {
    public int solution(int[] arr) {
        // 소인수분해
        // 
        int answer = 0;
        int i = 0;
        while(answer == 0){
            int tmp = 0;
            for(int j = 0; j<arr.length; j++){
                if(i%arr[j] == 0){
                    tmp++;
                }
            }
            if(tmp == arr.length){
                answer = i;
            }
            i++;
        }
        return answer;
    }
}