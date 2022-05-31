package kentaworks.day2.exam;

public class Exam11 {

	public static void main(String[] args) {
		for (int i=1; i<10;i++) {
			System.out.print(i+"の段：");
			
			for(int j =1;j<10;j++) {
				if(i*j<10) {
					System.out.print(" ");
				}
				System.out.print(i*j+ " ");
			}
			System.out.println();
		}

	}

}
