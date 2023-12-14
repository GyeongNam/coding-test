import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String binary = Integer.toString(n,k);
        binary = binary.replaceAll("0"," ");
        String[] str = binary.split("\\s+");
        System.out.println(Arrays.toString(str));
        for (String s: str){
            if(s.equals("1")){
                continue;
            }
            long num = Long.parseLong(s);
            boolean flag = true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    flag = false;
                }
            }
            if(flag){
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }
}