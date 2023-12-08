import java.util.*;
class Solution {
    public ArrayList solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        for(int i = 0; i<progresses.length; i++){
            int speeds_count = 0;
            for(int j = progresses[i]; j<100; j+=speeds[i]){
                speeds_count++;
            }
            list1.add(speeds_count);
        }
        int count = 1;
        int tmp = list1.get(0);
        for(int i = 1; i<list1.size(); i++){
            if(tmp < list1.get(i)){
                tmp = list1.get(i);
                list2.add(count);
                count = 1;
            }else{
                count++;
            }
            if(i+1 == list1.size()){
                list2.add(count);
            }
        }

        return list2;
    }
}