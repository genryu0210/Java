package math_and_algorithm;

import java.util.Scanner;
public class No036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt(), H = sc.nextInt(), M = sc.nextInt();
		//Θを求める
		double theta = (-30 * H + (6 - 0.5) * M) * 2 * Math.PI /360;
		//ルートの中身
		double inside = Math.pow(A, 2) + Math.pow(B, 2) - 2 * A * B * Math.cos(theta);
		
		double Ans = Math.sqrt(inside);
		
		System.out.println(Ans);
		
		
	}

}
