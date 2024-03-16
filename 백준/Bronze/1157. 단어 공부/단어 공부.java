import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next().toUpperCase(); // 입력 받은 단어를 모두 대문자로 변환
        Map<Character, Integer> map = new HashMap<>();

        // 각 알파벳의 등장 횟수를 Map에 저장
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int maxFrequency = Collections.max(map.values()); // 가장 많이 등장한 알파벳의 등장 횟수

        // 등장 횟수가 가장 높은 알파벳들을 찾음
        List<Character> maxChars = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                maxChars.add(entry.getKey());
            }
        }

        // 가장 많이 등장한 알파벳이 여러 개인 경우 "?" 출력
        // 그렇지 않으면 등장 횟수가 가장 높은 알파벳 출력
        char result = maxChars.size() > 1 ? '?' : maxChars.get(0);
        System.out.println(result);
    }
}