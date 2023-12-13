import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i=0;i<phone_book.length-1;i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                answer = false;
                break;
            }
        }
        //     for (int i = 0; i<phone_book.length; i++) {
        //     for(int j = i+1; j<phone_book.length; j++){
        //         if (phone_book[i].startsWith(phone_book[j]) || phone_book[j].startsWith(phone_book[i])) {
        //             answer = false;
        //             break;
        //         }
        //     }
        // }
        return answer;
    }
}