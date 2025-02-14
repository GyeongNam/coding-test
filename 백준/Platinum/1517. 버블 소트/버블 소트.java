import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countSwaps(arr));
    }

    public static long countSwaps(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        return mergeSort(arr, temp, 0, n - 1);
    }

    public static long mergeSort(int[] arr, int[] temp, int left, int right) {
        // (A) 병합 정렬의 종료 조건을 나타내는 코드
        if ( left >= right) {
            return 0;
        }

        int mid = (left + right) / 2;
        long invCount = 0;

        // 왼쪽과 오른쪽을 나누어 정렬하고 swap 횟수를 계산
        invCount += mergeSort(arr, temp, left, mid);
        invCount += mergeSort(arr, temp, mid + 1, right);

        // 병합 과정에서 swap 횟수를 계산
        invCount += merge(arr, temp, left, mid, right);

        return invCount;
    }

    public static long merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        long invCount = 0;

        // 병합 과정에서 swap 횟수를 계산
        while (i <= mid && j <= right) {
            // (B) 왼쪽 배열과 오른쪽 배열의 요소를 비교하여 작은 값을 temp 배열에 삽입하기 위한 조건
            if ( arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                // (C) 왼쪽 배열의 남아있는 요소 개수만큼 swap 발생
                invCount += (mid - i + 1);
            }
        }

        // 남아있는 요소들을 병합
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // temp의 내용을 원래 배열로 복사
        System.arraycopy(temp, left, arr, left, right - left + 1);

        return invCount;
    }
}