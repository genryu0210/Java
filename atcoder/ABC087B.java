package kentaworks.atcoder;

import java.util.Scanner;

public class ABC087B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int a = sc.nextInt();	
		int b = sc.nextInt();	
		int c = sc.nextInt();
		int X = sc.nextInt();
		//iはcの量、jはbの量、lはaの量
		for(int i = 0;i<=c;i++) {
			for(int j = 0; j<=b;j++) {
				for(int l = 0;l<=a;l++) {
					int C = i*50;
					int B = j*100;
					int A = l*500;
					if(X == A+B+C) {
					count++;
					}
					
				}
			}
		}
		System.out.println(count);
	}
}
