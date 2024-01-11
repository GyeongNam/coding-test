import java.io.*;
import java.util.*;
class Balloon {
	int index; // 풍선 번호
	int value; // 적혀있는 값
	
	public Balloon(int index, int value) {
		this.index=index;
		this.value=value;
	}
}
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Deque<Balloon> dq=new ArrayDeque<>();
		StringBuilder sb=new StringBuilder();
		
		// 풍선의 번호를 늘려가며 적혀있는 번호 저장
		for(int i=1;i<=n;i++) {
			int value=sc.nextInt();
			dq.add(new Balloon(i,value));
		}
			
		while(!dq.isEmpty()) {
			sb.append(dq.getFirst().index+" ");
			int next=dq.poll().value; 
			
			if(dq.isEmpty())
				break;
			
			if(next>0) {
				for(int i=0;i<next-1;i++)
					dq.addLast(dq.pollFirst());
			}
			else {
				for(int i=0;i<Math.abs(next);i++)
					dq.addFirst(dq.pollLast());
			}
		}
		
		System.out.println(sb);
	}
}
