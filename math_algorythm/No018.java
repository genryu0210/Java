package kentaworks.math_algorythm;

import java.util.Scanner;
public class No018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] count = {0,0,0,0};
		int[] A = new int[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			switch(A[i]) {
			case 100:
				count[0]++;
				break;
			case 200:
				count[1]++;
				break;
			case 300:
				count[2]++;
				break;
			case 400:
				count[3]++;
				break;
				
			}
		}
		System.out.println((count[0]*count[3])+(count[1]*count[2]));
	}
}