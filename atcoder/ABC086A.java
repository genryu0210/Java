package kentaworks.atcoder;
import java.util.Scanner;

public class ABC086A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = (a*b)%2;
		if (1<=a&&a<=10000&&1<=b&&b<=10000) {
			switch(c) {
			case 0:
				System.out.println("Even");
				break;
			case 1:
				System.out.println("Odd");
				break;
			}
			
		}

	}

}
