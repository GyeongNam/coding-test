import java.util.*;

public class Main {
    public static int longestIncreasingSubsequence(int[] arr) {
        List<Integer> lis = new ArrayList<>();
        
        for (int num : arr) {
            // 이진 탐색을 이용하여 lis에서 적절한 위치를 찾는다.
            int pos = Collections.binarySearch(lis, num);
            
            // binarySearch는 값이 없으면 음수 위치를 반환하므로 이를 처리
            if (pos < 0) pos = -(pos + 1);
            
            // 위치가 이미 있으면 값을 바꿔준다.
            if (pos < lis.size()) {
                lis.set(pos, num);
            } else {
                // 새롭게 추가한다.
                lis.add(num);
            }
        }
        
        // lis의 크기가 가장 긴 증가하는 부분 수열의 길이
        return lis.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 결과 출력
        System.out.println(longestIncreasingSubsequence(arr));
    }
}
