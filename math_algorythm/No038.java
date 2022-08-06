package math_and_algorithm;

import java.util.Scanner;
public class No038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), Q = sc.nextInt();
		int A[] = new int[N+1];
		A[0] = 0;
		int B[] = new int[N+1];
		for(int i=1;i<=N;i++) {
			A[i] = sc.nextInt();
			B[i] = A[i]+B[i-1];
		}
		int[] L = new int[Q+1],R = new int[Q+1];
		for(int i=1;i<=Q;i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		//AをBの階差のように扱い累積Bを求めることによってL to R のAの総和をB[R] - B[L]として求められる
		for(int i=1;i<=Q;i++) {
			 System.out.println(B[R[i]] - B[L[i]-1]);
		}
	}
}
		/*
		for(int i=1;i<=Q;i++) {
			int Ans = 0;
			for(int j=L[i];j<=R[i];j++) {
				Ans += A[j];
			}
			System.out.println(Ans);
		}
	}

}
*/