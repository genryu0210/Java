package math_and_algorithm;

import java.util.Scanner;

public class No035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt(), y1 = sc.nextInt(), r1 = sc.nextInt();
		int x2 = sc.nextInt(), y2 = sc.nextInt(), r2 = sc.nextInt();
		
		double sumrad = Math.abs(r1 + r2);
		double subrad = Math.abs(r1 - r2);
		double cx = x1 - x2,cy = y1 - y2;
		double clen = Math.sqrt((Math.pow(cx, 2) + Math.pow(cy, 2)));
		int flag = 0;
		if(subrad > clen) {flag = 1;}
		if(subrad == clen) {flag = 2;}
		if(subrad < clen && clen < sumrad) {flag = 3;}
		if(sumrad == clen) {flag = 4;}
		if(sumrad < clen) {flag = 5;}
		
		System.out.println(flag);
	}

}
