import java.util.*;
import java.time.*;
class Solution {
    public long[] solution(int[] fees, String[] records) {
        Map<String, List<Long>> map = new HashMap<>();
        Map<String, String> timeList = new HashMap<>();

        for(String str : records){
            String[] strArr = str.split(" ");
            if(strArr[2].equals("IN")){
                timeList.put(strArr[1] , strArr[0]);
            }else{
                LocalTime start = LocalTime.parse(timeList.get(strArr[1]));
                LocalTime end = LocalTime.parse(strArr[0]);
                List<Long> list = new ArrayList<>();
                if(map.containsKey(strArr[1])){
                    map.get(strArr[1]).add(Duration.between(start, end).toMinutes());
                }else{
                    list.add(Duration.between(start, end).toMinutes());
                    map.put(strArr[1], list);
                }
                timeList.remove(strArr[1]);
            }
        }
        // 00시 넘어가는것들 처리
        for( Map.Entry<String, String> entry : timeList.entrySet() ){
            String strKey = entry.getKey();
            LocalTime start = LocalTime.parse(timeList.get(strKey));
            LocalTime end = LocalTime.parse("23:59");
            List<Long> list = new ArrayList<>();
            if(map.containsKey(strKey)){
                map.get(strKey).add(Duration.between(start, end).toMinutes());
            }else{
                list.add(Duration.between(start, end).toMinutes());
                map.put(strKey, list);
            }
        }
        long[] answer = new long[map.size()];
        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        int index = 0;
        for (String key : keySet) {
            List<Long> lists = map.get(key);
            long num = 0;
            for (long a : lists){
                num += a;
            }

            if(fees[0]<num){
                answer[index] = fees[1] + (long)Math.ceil((((double) num-fees[0])/(double)fees[2])) * fees[3];
            }else{
                answer[index] = fees[1];
            }
            index++;
        }
        // System.out.println(Arrays.toString(answer));
        return answer;
    }
}