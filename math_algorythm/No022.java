package math_and_algorithm;

import java.util.Scanner;
public class No022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		
		//100000までのリストを作る
		long[] vol = new long[100001];
		for(int i=0;i<vol.length;i++) {
			vol[i] = 0;
		}
		//マッチした数字を上のリストにカウントする
		for(long i=0;i<N;i++) {
			vol[sc.nextInt()] ++;
		}
		//1の量×99999の量　＝100000になる組み合わせなので
		long Ans =0;
		for(int i=1;i<=49999;i++) {
			Ans +=(vol[i]*vol[100000-i]);
		}
		Ans += vol[50000]*(vol[50000]-1)/2;
		System.out.println(Ans);
		
	}
}
