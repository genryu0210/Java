package kentaworks.math_algorythm;

import java.util.Scanner;
public class No042 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long[] G = new long[N+1];
		for(int i=1;i<=N;i++) {
			G[i] = 0;}
		
		for(int i=1;i<=N;i++) {
			for(int j=i;j<=N;j+=i) {
				G[j]+=1;
			}
		}
		long Ans = 0;
		for(int i=1;i<=N;i++) {
			Ans = Ans + i * G[i];
		}
		System.out.println(Ans);
	}
}
