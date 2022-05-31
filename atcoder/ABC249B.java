package kentaworks.atcoder;

import java.util.Scanner;
public class ABC249B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		char c[] = S.toCharArray();
		
		int aflag = 0;
		int Aflag = 0;
		int same  = S.length() ;//- S.length();
		for (int i =0; i<S.length();i++) {
			if(Character.isLowerCase(c[i]) == true) {
				aflag++;
			}
			if(Character.isUpperCase(c[i])==true) {
				Aflag++;
			}
			for(int j = 0;j<S.length();j++) {
				if(c[i] == c[j]) {
					same --;
				}
			}
		}
		if(aflag> 0 &&Aflag > 0 && same == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
