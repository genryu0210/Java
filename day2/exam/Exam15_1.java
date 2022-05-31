package kentaworks.day2.exam;

public class Exam15_1 {

	public static void main(String[] args) {
		int count = 0;
		int count1 = 0;
		for(int month = 1; month <=12 ;month++) {
			int end = Integer.parseInt(args[month-1]);
			
			System.out.println("   <<2017年 "+month+ " 月>>");
			System.out.println("日 月 火 水 木 金 土");
			System.out.println("====================");
			count1 = count;
			while(! ((count) % 7 ==0)) {
				System.out.print("   ");
				count--;
			}
			//カレンダーに数字入れる
			for ( int day = 1; day <=end; day++) {
				//１０の位を合わせる
				if(day <10) {
					System.out.print(" ");
				}
				//日にち入れる
				System.out.print(day+" ");
				//７の倍数で改行
				if((count1+day) %7 ==0 ) {
					System.out.println();
				}
				//最後の日で終わりにする
				if(day == end) {
					System.out.println("\n");
					//dayを7で割ったあまり
					count = (count1+ day%7);
				}
				
			}
		}

	}

}
