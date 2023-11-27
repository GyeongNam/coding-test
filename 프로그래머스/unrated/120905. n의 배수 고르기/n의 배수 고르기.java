import java.util.*;
class Solution {
    public ArrayList solution(int n, int[] numlist) {
        ArrayList numlist2 = new ArrayList();
        for(int i = 0; i<numlist.length; i++){
            if(numlist[i]%n == 0){
                numlist2.add(numlist[i]);
            }
        }
        return numlist2;
    }
}