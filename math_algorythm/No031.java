package math_and_algorithm;

import java.util.Scanner;

public class No031 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int A[] = new int[N+1];
		for(int i=1;i<=N;i++) {
			A[i] = sc.nextInt();
		}
		
		long[] dp = new long[N+2];
		

		dp[1] = A[1];
		for(int i=2;i<=N;i++) {
			dp[i] = Math.max(dp[i-1], dp[i-2]+A[i]);
		}
		System.out.println(dp[N]);

	}
}
		