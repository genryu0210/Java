package kentaworks.atcoder;

import java.util.Scanner;
public class ABC255B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[K];
		for(int i=0;i<K;i++) {
			A[i] = sc.nextInt()-1;
		}
		int[] X = new int [N],Y = new int[N];
		for(int i=0;i<N;i++) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}
		
		//点同士の距離を求める
		double[][] len = new double[N][N];
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				double Xsub = X[i]-X[j];
				double Ysub = Y[i]-Y[j];
				len[i][j] = Math.sqrt(Math.pow(Xsub, 2) + Math.pow(Ysub, 2));
			} 
		}
		//すべての点のライトまでの距離を計算
		double[] Len = new double[N];
		a: for(int i=0;i<N;i++) {
			for(int j=0;j<K;j++) {
				for(int k=j;k<K;k++) {
					if(i == A[j]|| i == A[k]) {
						continue a;
					}else if(j == k) {continue;}
					Len[i] = Math.min(len[i][A[j]], len[i][A[k]]);
				}
			}
		}
		double Ans = 0;
		for(int i=0;i<N;i++) {
			Ans = Math.max(Ans, Len[i]);
		}
		System.out.println(Ans);
	}
}
