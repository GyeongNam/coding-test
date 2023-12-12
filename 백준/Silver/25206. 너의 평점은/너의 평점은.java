import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map <String, Double> map = new HashMap<>();
        map.put("A+",4.5);
        map.put("A0",4.0);
        map.put("B+",3.5);
        map.put("B0",3.0);
        map.put("C+",2.5);
        map.put("C0",2.0);
        map.put("D+",1.5);
        map.put("D0",1.0);
        map.put("F",0.0);

        ArrayList<Double> list = new ArrayList<>();
        double score = 0;
        double sum = 0;
        for (int i = 0; i < 20; i++) {
            String str = sc.nextLine();
            String [] strarr = str.split(" ");
            if(!strarr[2].equals("P")){
                list.add(Double.parseDouble(strarr[1])*map.get(strarr[2]));
                sum+=Double.parseDouble(strarr[1]);
            }
        }

        for (double d:list){
            score += d;
        }
        System.out.printf("%.6f", score/sum);
	}
}
