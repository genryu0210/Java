package math_and_algorithm;

import java.util.Scanner;
public class No040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//CはAの累積和
		int N = sc.nextInt(), A[] = new int[N+1]; long C[] = new long[N+1];
		C[0] = 0;
		for(int i=1;i<N;i++) {
			A[i] = sc.nextInt();
			C[i] = C[i-1] + A[i];
		}
		
		int M = sc.nextInt(), B[] = new int[M+1], L, R;long Ans = 0;
		long Blen;
		B[0] = 0;
		for(int i=1;i<=M;i++) {
			B[i] = sc.nextInt();
			if(i == 1) {continue;}
			L = Math.min(B[i-1], B[i]);
			R = Math.max(B[i-1], B[i]);
			Blen = C[R-1] - C[L-1];
			Ans += Blen;
		}
		System.out.println(Ans);
	}

}