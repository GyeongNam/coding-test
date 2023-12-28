import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
        HashSet<Integer> list1= new HashSet<>();
        HashSet<Integer> list2= new HashSet<>();
        HashSet<Integer> list3= new HashSet<>();
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<A; i++) {
            int num = Integer.parseInt(st.nextToken());
            list1.add(num);
            list2.add(num);
        }
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<B; i++) {
            list3.add(Integer.parseInt(st.nextToken()));
        }
        list1.removeAll(list3);
        list3.removeAll(list2);
        System.out.println(list1.size() + list3.size());
	}
}
