package kentaworks.atcoder;
import java.util.Scanner;
public class ABC249D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		
		int count =0;
		for(int i=0;i<N;i++) {
			for(int j=1;j<=A[i];j++) {
				if(A[i]%j==0) {
					for(int a:A) {
						if(j==a) {
							for(int b:A) {
								if(A[i]/j==b) {
									count++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}

}
//
//for(int i=0;i<N;i++) {
//	for(int j=0;j<N;j++) {
//		for(int k=0;k<N;k++) {
//			if(i ==j||i==k||k==j) {	
//			}else if(A[i]== (A[k]*A[j])) {
//				count++;
//			}
//			
//		}
//	}
//}
//System.out.println(count);
//}
//
//}
