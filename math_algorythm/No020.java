package kentaworks.math_algorythm;

import java.util.Scanner;

public class No020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int count= 0;
		
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				for(int k=j+1;k<N;k++) {
					for(int l=k+1;l<N;l++) {
						for(int m=l+1;m<N;m++) {
							if(A[i]+A[j]+A[k]+A[l]+A[m]==1000) {
								count+=1;
								}
							
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}