package kentaworks.math_algorythm;

import java.util.Scanner;
public class No016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextLong();
		}
		long GCD = 1;
		long Ans = 1;
		for(int i=0;i<N;i++) {
			if(i==0){
				Ans = A[i+1];
			}
				while(A[i]>=1&&Ans>=1){
					if(A[i]>Ans) {
						GCD = Ans;
						A[i] = A[i]%Ans;
					}else{
						GCD = A[i];
						Ans= Ans%A[i];
					}
				}
				Ans = GCD;
		}
		System.out.println(Ans);
	}
}