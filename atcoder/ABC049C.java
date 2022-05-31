package kentaworks.atcoder;

import java.util.Scanner;
public class ABC049C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		if (S.matches("^(eraser|dreamer|erase|dream)+$")) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
	}

}
