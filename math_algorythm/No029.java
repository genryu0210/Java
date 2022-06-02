package math_and_algorithm;

import java.util.Scanner;
public class No029 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println(dp(sc.nextInt()));
	}
	
	static long  dp(int N) {
		
		if(N==0) {return 1; }
		else if(N==1) {return 1; }
		else{return dp(N) + dp(N-1);}
		
	}
}
	
/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long[] dp = new long[N+1];
		
		for(int i=0;i<=N;i++) {
			if(i==0) {dp[0] = 1;
			}else if(i==1) {dp[1] = 1;
			}else {dp[i] = dp[i-1] + dp[i-2];}
		}
		System.out.println(dp[N]);
	}

}
*/