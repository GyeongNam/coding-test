import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Character[][] str_arr = new Character[5][15];
        for (int i = 0; i < str_arr.length; i++) {
            String str_tmp  =  sc.nextLine();
            for (int j = 0; j < str_tmp.length(); j++) {
                str_arr[i][j] = str_tmp.charAt(j);
            }
        }
        String str = "";
        for (int i = 0; i < str_arr[0].length; i++) {
            for (int j = 0; j < str_arr.length; j++) {
                if(str_arr[j][i] != null){
                    str += str_arr[j][i];
                }
            }
        }
        System.out.println(str);
	}
}
