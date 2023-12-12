import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int search = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = Arrays.stream(arr).filter(a->a < search).toArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
	}
}
