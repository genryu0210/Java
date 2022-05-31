package kentaworks.day2.exam;

public class Exam02 {

	public static void main(String[] args) {
		int chokin = 0;
		int month = 1;
		
		for (int i =0;chokin<=100000;month++) {
			
			chokin = chokin+ month*1000;
			System.out.println(month + "カ月目："+ chokin+ "円");
			
			if(chokin >100000) {
				System.out.println("10万円貯めるのに"+ month+"ヵ月かかりました。");
			}
		}
	}
}
