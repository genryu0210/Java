package kentaworks.atcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class ABC088B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		for(int i =1;i<=N;i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list, Collections.reverseOrder());
		
		int A = 0;
		int B = 0;
		
		for(int i = 0;i<N;i++) {
			if (i%2 == 0) {
				A +=list.get(i);
			}else if(i%2 ==1) {
				B +=list.get(i);
			}
		}
		System.out.println(A-B);
	}
	

}
