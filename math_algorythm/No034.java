package math_and_algorithm;

import java.util.Scanner;
public class No034 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] x = new int [N];
		int[] y = new int [N];
		
		for(int i=0;i<N ;i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		double Ans = Double.MAX_VALUE;
		for( int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				double length = Math.sqrt(Math.pow((x[j] - x[i]),2) + Math.pow((y[j] - y[i]),2));
				Ans = Math.min(Ans, length);
			}
		}
		System.out.println(Ans);
		
	}

}
