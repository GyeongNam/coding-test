import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_size = sc.nextInt();
        int m_size = sc.nextInt();
        int[] arr = new int[n_size];
        for (int i = 0; i < n_size; i++) {
            arr[i] = i+1;
        }
        for (int i = 0; i < m_size; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;

            while (a < b) {
                int temp = arr[a];
                arr[a++] = arr[b];
                arr[b--] = temp;
            }
        }
        for (int a : arr){
            System.out.print(a + " ");
        }
	}
}
