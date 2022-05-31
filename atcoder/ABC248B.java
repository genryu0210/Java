package kentaworks.atcoder;

import java.util.Scanner;
public class ABC248B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		//A*K*n>=B
		int n =0;
		while(B>(A*(Math.pow(K, n)))) {
			n++;
		}
		System.out.println(n);
	}

}
