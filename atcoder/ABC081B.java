package kentaworks.atcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class ABC081B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		int count = -1;
		int N = sc.nextInt();
		boolean bool = true;
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<N;i++) {
			list.add(sc.nextInt());
		}
		
		while(bool) {
			count++;
			for(int i= 0; i<N;i++) {
				if(list.get(i)%2 ==0) {
					list.set(i, list.get(i)/2);
				}else {
					bool = false;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
//		Scanner sc = new Scanner(System.in);
//		List<Long> list = new ArrayList<Long>();
//		int count = -1;
//		int button = 0;
//		int input = sc.nextInt();
//		 while(input>200) {
//			 input = sc.nextInt();
//		 }
//		 for(int i= 1;i<=input;i++) {
//			 long num = sc.nextLong();
//			 list.add(num);
//		 }
//		 System.out.println(list);
//		 while(button == 0) {
//			 count+= 1;
//			 for(int i = 0;i<input;i++) {
//				 if(list.get(i)%2 == 0) {
//					 list.set(i, list.get(i)/2);
//				 }else {
//					 button = 1;
//					 break;
//				 }
//			 }
//		 }
//		 System.out.println(count);
//		 
//		 
