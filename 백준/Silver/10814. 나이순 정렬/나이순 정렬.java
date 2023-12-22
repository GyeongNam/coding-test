import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String [][] arr = new String[size][2];
        for(int i = 0; i<size; i++){
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (String[] l :arr){
            System.out.println(l[0] + " "+ l[1]);
        }
	}
}
