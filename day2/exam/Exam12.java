package kentaworks.day2.exam;

import java.util.Scanner;

public class Exam12 {
//	Scanner scanner = new Scanner();
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str =" ";
		
		while(!str.equals("!")) {
			System.out.println("アルファベットの小文字を入力してください：");
			str = scan.next();
			if (! str.matches("^[a-z]+$")){
				System.out.println("入力が不正です。");
			}else {
				System.out.println(str+"の大文字は"+str.toUpperCase()+"です。");
			}
		}
		System.out.println("終了します。");

	}

}
