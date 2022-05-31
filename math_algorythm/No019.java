package kentaworks.math_algorythm;

import java.util.Scanner;
public class No019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int one = 0; int two =0; int three = 0;
		for(int i=0;i<N;i++) {
			int A = sc.nextInt();
			switch(A) {
			case 1:
				one++;
				break;
			case 2:
				two++;
				break;
			case 3:
				three++;
				break;
			}
		}
		sc.close();
		long a = method(one)+method(two)+method(three);
		System.out.println(a);
	}
	static long method(int x) {
		return ((x*(x-1))/2);
	}
}