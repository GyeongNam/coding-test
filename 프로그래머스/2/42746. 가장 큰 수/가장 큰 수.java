import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
                String[] str =  Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        answer = Arrays.stream(str).collect(Collectors.joining(""));
        
        return answer.startsWith("0") ? "0" : answer;
    }
}