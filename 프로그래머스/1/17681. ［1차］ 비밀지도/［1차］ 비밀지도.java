import java.util.*;
class Solution {
    public ArrayList solution(int n, int[] arr1, int[] arr2) {
        ArrayList answer = new ArrayList();
        
        for(int i = 0; i<arr1.length; i++){
            
            String binaryStr1 = Integer.toBinaryString(arr1[i]);
            String binaryStr2 = Integer.toBinaryString(arr2[i]);
            String str1 = "";
            String str2 = "";
            String str = "";
            for(int j = 0; j<binaryStr1.length(); j++){
                if(binaryStr1.charAt(j) == '1'){
                    str1 += "#";
                }else{
                    str1 += " ";
                }
            }
            
            if(binaryStr1.length()<n){
                String gapstr = "";
                for(int g = 0; g< n-binaryStr1.length(); g++){
                    gapstr += " ";
                }
                str1 = gapstr+str1;
            }
            
            for(int j = 0; j<binaryStr2.length(); j++){
                if(binaryStr2.charAt(j) == '1'){
                    str2 += "#";
                }else{
                    str2 += " ";
                }
            }
            
            if(binaryStr2.length()<n){
                String gapstr = "";
                for(int g = 0; g< n-binaryStr2.length(); g++){
                    gapstr += " ";
                }
                str2 = gapstr+str2;
            }
            
            for(int j = 0; j<str1.length(); j++){
                if(str1.charAt(j) == '#' || str2.charAt(j) == '#'){
                    str += "#";
                }else{
                    str += " ";
                }
            }
            
            answer.add(str);
        }
        return answer;
    }
}