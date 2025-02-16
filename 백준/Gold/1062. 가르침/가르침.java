import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static ArrayList<String> words = new ArrayList<>();

    static int solution(int N, int K, List<String> words) {
        if (K < 5) return 0;
        Set<Character> basic = new HashSet<>(Arrays.asList('a', 'n', 't', 'i', 'c'));
        Set<Character> alpha = new HashSet<>();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                alpha.add(c);
            }
        }
        alpha.removeAll(basic);
        int maxReadable = 0;
        List<Character> alphaList = new ArrayList<>(alpha);
        int selectCount = Math.min(K - 5, alpha.size());
        maxReadable = generateCombinations(alphaList, selectCount, basic, words);
        return maxReadable;
    }

    static int generateCombinations(List<Character> alpha, int count, Set<Character> basic, List<String> words) {
        int maxCount = 0;
        if (count == 0) {
            return countReadableWords(basic, words);
        }
        for (int i = 0; i <= alpha.size() - count; i++) {
            Set<Character> newLearned = new HashSet<>(basic);
            newLearned.add(alpha.get(i));
            List<Character> remaining = new ArrayList<>(alpha.subList(i + 1, alpha.size()));
            maxCount = Math.max(maxCount, generateCombinations(remaining, count - 1, newLearned, words));
        }
        return maxCount;
    }

    static int countReadableWords(Set<Character> learned, List<String> words) {
        int count = 0;
        for (String word : words) {
            boolean canRead = true;
            for (char c : word.toCharArray()) {
                if (!learned.contains(c)) {
                    canRead = false;
                    break;
                }
            }
            if (canRead) count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            words.add(br.readLine());
        }
        System.out.println(solution(N, K, words));
    }
}
