package kentaworks.atcoder;

import java.util.Scanner;
public class ABC083B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int result = 0;
		//iをばらして和を作る
			for(int i =1;i<=N;i++) {
				int value=0;
				if(10<=i) {
					int j = i;
					int wari = j/10;
					int amari = j%10;
					while(amari>0||wari>0) {
						value +=amari;
						amari = wari%10;
						wari = wari/10;
					}
				}else {
					value = i;
				}
				
				if (A<=value&&value<=B) {
					result+= i;
			}
		}
	System.out.println(result);
	sc.close();
	}
}

