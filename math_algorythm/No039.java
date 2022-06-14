package math_and_algorithm;

import java.util.Scanner;
public class No039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), Q = sc.nextInt(),B[] = new int [100009];
		B[0] = 0;
		int[] L = new int[Q+1], R = new int[Q+1], X = new int[Q+1];
		for(int i = 1;i<=Q;i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
			X[i] = sc.nextInt();
			B[L[i]] += X[i];
			B[R[i]+1] -= X[i];
			}
		for(int i=2;i<=N;i++) {
			if(B[i] >0) {System.out.print("<");}
			if(B[i] == 0) {System.out.print("=");}
			if(B[i] < 0) {System.out.print(">");}
		}
	}

}
