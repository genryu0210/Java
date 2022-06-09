package math_and_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class No032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long X = sc.nextLong();
		
		int flag = 0;
		
		long[] A = new long[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);
		
		int left = 0,right = N;
		while(left<=right) {
			int mid = (left + right)/2;
			
			if(A[mid] == X) {System.out.println("Yes");flag++;break;
			}else if(A[mid]>X) {right = mid-1;
			}else if(A[mid]<X) {left = mid+1;}
		}
		if(flag==0) {System.out.println("No");}
	}
}
