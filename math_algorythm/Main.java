package kentaworks.math_algorythm;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[100009];
		int[] count = new int[100009];
		
		for(int i=1;i<=N;i++) {
			A[i] = sc.nextInt();
		}
		for(int i=1;i<=100000;i++) {
			count[i]=0;
		}
		for(int i=1;i<=N;i++) {
			count[A[i]]++;
		}
		int Ans = 0;
		for(int i=1;i<50000;i++) {
			Ans += count[i] * count[100000-i];
		}
		Ans += count[50000];
		System.out.println(Ans);
	}
}