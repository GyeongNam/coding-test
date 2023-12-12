import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_size = sc.nextInt();
        int m_size = sc.nextInt();
        int[] arr = new int[n_size];
        for (int j = 0; j < m_size; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for(int k = a-1; k<=b-1; k++){
                arr[k] = c;
            }
        }
        for (int a : arr){
            System.out.println(a);
        }
	}
}
