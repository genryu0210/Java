package math_and_algorithm;

import java.util.Scanner;
public class No041 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(),N = sc.nextInt();
		int[] L = new int[N],R = new int[N],Tnum = new int[T+1];
		
		for(int i=0;i<N;i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
			Tnum[L[i]]++;
			Tnum[R[i]]--;
		}
		Ans(T,Tnum);
	}
	public static  void Ans(int T,int Tnum[]) {
		int Ans = 0;
		for(int i=0;i<T;i++) {
			Ans += Tnum[i];
			System.out.println(Ans);
		}
	}
}
