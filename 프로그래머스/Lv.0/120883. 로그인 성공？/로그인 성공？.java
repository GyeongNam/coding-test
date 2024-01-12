import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> Map = new HashMap<String, String>();
        for (String[] strings : db) {
            Map.put(strings[0], strings[1]);
        }
        if (Map.containsKey(id_pw[0])) {
            if (Map.get(id_pw[0]).equals(id_pw[1])) {
                return "login";
            } else {
                return "wrong pw";
            }
        } else {
            return "fail";
        }
        // String answer = "";       
        // for(int i = 0; i<db.length; i++){
        //     if(db[i][0].equals(id_pw[0])){
        //         if(db[i][1].equals(id_pw[1])){
        //             answer = "login";
        //         }else{
        //             answer = "wrong pw";
        //         }
        //     }else{
        //         answer = "fail";
        //     }
        // }
        // return answer;
    }
}