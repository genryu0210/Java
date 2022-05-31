package kentaworks.atcoder;

public class abc057 {

	public static void main(String[] args) {
		
		int A =(int)(Math.random()*24);
		int B =(int)(Math.random()*24);
		
		System.out.println("現在"+A+"時です");
		System.out.println(B+"時間後に始まります");
		
		int C = A+B;
		if(A+B>=24) {
			C-=24;
		}
		System.out.println(C+"時です");
	}

}
