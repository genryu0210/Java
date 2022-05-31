package kentaworks.math_algorythm;

import java.util.Scanner;

public class No021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		float top = 1;
		float bottom = 1;
		int Ans = 1;
		for(int i=r;i>=1;i--) {
			top *= (n+1-i);
			bottom *= i;
			Ans = (int) (top/bottom);
		}
		System.out.println(Ans);
	}
}