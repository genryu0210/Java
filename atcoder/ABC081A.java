package kentaworks.atcoder;
import java.util.Scanner;

public class ABC081A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		
		if(str.charAt(0) == '1') {
			count++;
		}
		if(str.charAt(1) == '1') {
			count++;
		}
		if(str.charAt(2) == '1') {
			count++;
		}
		System.out.println(count);
	}
}
//
//	public static void main(String[] args) throws Exception{
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		int num = Integer.parseInt(str);
//		
//		
//		if(num== 000) {
//			System.out.println(0);
//		}else if(num==100||num==010||num == 001) {
//			System.out.println(1);
//		}else if (num ==110||num==011||num ==101) {
//			System.out.println(2);
//		}else if (num ==111) {
//			System.out.println(3);
//		}else {
//			System.out.println(0);
//		}
//	}
//}