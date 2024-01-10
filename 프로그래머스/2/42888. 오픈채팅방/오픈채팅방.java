import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        // Map<Integer, String> index = new HashMap<>();
        // Map<String, String> userList = new HashMap<>();
        // for (int i = 0; i <record.length ; i++) {
        //     String[] strArr = record[i].split(" ");
        //     if(strArr[0].equals("Enter")){
        //         userList.put("in "+strArr[1], strArr[2]);
        //         index.put(+i,"in "+strArr[1]) ;
        //     }else if(strArr[0].equals("Change")){
        //         userList.put("in "+strArr[1],strArr[2]);
        //     } else{
        //         userList.put("out "+strArr[1],userList.get("in "+strArr[1]));
        //         index.put(i,"out "+strArr[1]);
        //     }
        // }
        // String[] answer = new String[index.size()];
        // for (int i = 0; i <index.size() ; i++) {
        //     String[] strArr = index.get(i).split(" ");
        //     System.out.println(Arrays.toString(strArr));
        //     if(strArr[0].equals("in")){
        //         answer[i] = userList.get("in "+strArr[1])+"님이 들어왔습니다.";
        //     }else{
        //         answer[i] = userList.get("in "+strArr[1])+"님이 나갔습니다.";
        //     }
        // }
        // return answer;
        Map<String,String> map = new HashMap<>();
        int sub_count = 0;
        for(int i=0; i<record.length; i++) {
            String[] strArr = record[i].split(" ");
            if(strArr[0].equals("Leave")){
                continue;
            }
            else if(strArr[0].equals("Change")){
                sub_count++;
            }
            map.put(strArr[1], strArr[2]);
        }

        String[] answer = new String[record.length - sub_count];
        int index = 0;
        for(int i=0; i<record.length; i++) {
            String[] strArr = record[i].split(" ");
            if(strArr[0].equals("Enter")) {
                answer[index++] = map.get(strArr[1]) + "님이 들어왔습니다.";
            }else if(strArr[0].equals("Leave")) {
                answer[index++] = map.get(strArr[1]) + "님이 나갔습니다.";
            }
        }
     
        return answer;
    }
}