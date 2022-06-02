package math_and_algorithm;

import java.util.Scanner;

public class No028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long a1 = 0;long a2 = 0;
		long[] A = new long[N+1]; 
		int[] h = new int[N+1];
		for(int i=0;i<N;i++) {h[i] = sc.nextInt();}
		for(int i=0;i<N;i++) {
			if(i==0) {A[0] = 0;
			}else if(i==1) {A[1] = h[1]-h[0];
			}else{
				a1 = A[i-2] + Math.abs(h[i] - h[i-2]);
				a2 = A[i-1] + Math.abs(h[i] - h[i-1]);
				A[i] = Math.min(a1,a2);
			}
			
		}
		System.out.println(A[N-1]);
	}

}
