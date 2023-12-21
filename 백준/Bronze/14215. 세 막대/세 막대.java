import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        Arrays.sort(arr);
        if(arr[2]<arr[0]+arr[1]) {
            System.out.println(Arrays.stream(arr).sum());
        }else{
            System.out.println(((arr[0]+arr[1])*2)-1);
        }
	}
}
