import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,k,l;
        sc.close();
        for(i=0;i<n;i++) {
            for(j=i+1;j<n;j++) {
                System.out.print(" ");
            }
            for(k=i;k>=0;k--) {
                System.out.print("*");
            }
            for(l=i;l>0;l--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<n;i++) {
            for(j=i;j>0;j--) {
                System.out.print(" ");
            }
            for(k=i;k<n;k++) {
                System.out.print("*");
            }
            for(l=i+1;l<n;l++) { 
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
