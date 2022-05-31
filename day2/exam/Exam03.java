package kentaworks.day2.exam;

public class Exam03 {

	public static void main(String[] args) {
		int num1,num2;
		num1 = (int)(Math.random()*9);
		/*ここに式を記述*/
		num2 =  (int)(Math.random()*9);/*ここに式を記述*/

	       System.out.println("num1 = " + num1);
	       System.out.println("num2 = " + num2);
	       System.out.println("値を入れ替えます。");
	       
	       int subnum = num1;
	       num1 = num2;
	       num2 = subnum;
	       System.out.println("num1 = " + num1);
	       System.out.println("num2 = " + num2);
	}
}
