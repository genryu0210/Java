package kentaworks.day2.exam;

public class Exam15 {

	public static void main(String[] args) {
		//１月分
		System.out.println("   <<2017年１月>>");
		System.out.println("日 月 火 水 木 金 土");
		System.out.println("====================");
		for (int num = 1; num <=31; num++) {
			if(num <10) {
				System.out.print(" ");
			}
			System.out.print(num+" ");
			if(num %7 ==0 ) {
				System.out.println();
			}
		}
		
	}

}
