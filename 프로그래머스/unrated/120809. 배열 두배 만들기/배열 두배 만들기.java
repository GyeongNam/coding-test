class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int j =0;
        for(int i : numbers){
            answer[j] = i*2;
            j++;
        }
        return answer;
    }
}