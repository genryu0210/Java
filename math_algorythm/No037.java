
//難しくてできてない
package math_and_algorithm;

import java.util.Scanner;
public class No037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x[] = new int[5];
		int y[] = new int[5];
		for(int i=1;i<=4;i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		//傾き点１，２に３，４，を代入
		double t[] = {0,0};
		for(int i=0;i<2;i++) {
			t[i] = (x[1]-x[2])*(y[3+i]-y[1])+(y[1]-y[2])*(x[1]-x[3+i]);
		}
		int flag1 = 0;
		if(t[0]*t[1] <0) {flag1 ++;}
		
		//傾き３，４，に点１，２を代入
		double s[] = {0,0};
		for(int i=0;i<2;i++) {
			s[i] = (x[3]-x[4])*(y[1+i]-y[4])+(y[3]-y[4])*(x[3]-x[1+i]);
		}
		int flag2 = 0;
		if(s[0]*s[1] <0) {flag2 ++;}

		if(flag1 ==1 && flag2 ==1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
