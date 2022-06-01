package math_and_algorithm;

import java.util.Scanner;
public class No023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] B = new double[N];
		double[] R = new double[N];
		
		for(int i = 0;i<N;i++) B[i] = sc.nextDouble();
		for(int i = 0;i<N;i++) R[i] = sc.nextDouble();
		
		double B_ans = 0;
		double R_ans = 0;
		for(int i = 0 ;i<N;i++) {
			B_ans += B[i]/N;
			R_ans += R[i]/N;
		}
		
		double Ans = B_ans+R_ans;
		
		System.out.println(Ans);
	}
}
