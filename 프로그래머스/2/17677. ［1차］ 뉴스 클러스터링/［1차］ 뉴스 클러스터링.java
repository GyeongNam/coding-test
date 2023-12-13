import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        List<String> sc1 = new ArrayList<>();
        List<String> sc2 = new ArrayList<>();
        for (int i = 0; i < str1.length()-1; i++) {
            String str = str1.charAt(i) +""+ str1.charAt(i+1);
            if(str.matches("^[A-Z]*$")){
                sc1.add(str);
            }
        }
        for (int i = 0; i < str2.length()-1; i++) {
            String str = str2.charAt(i) +""+ str2.charAt(i+1);
            if(str.matches("^[A-Z]*$")){
                sc2.add(str);
            }
        }
        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();
        Collections.sort(sc1);
        Collections.sort(sc2);

        for(String s : sc1){
            if(sc2.remove(s)){
                intersection.add(s);
            }
            union.add(s);
        }

        union.addAll(sc2);

        if(union.isEmpty()){
            answer = 65536;
        }else{
            answer =(int) ( (double)intersection.size()/(double)union.size() * 65536 );
        }
        return answer;
    }
}