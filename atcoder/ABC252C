import java.util.Scanner;
public class ABC252C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] S[] = new int[N][10];
		
		for (int i = 0;i<N;i++) {
			String str = sc.next();
				for(int j = 0;j<10;j++) {
				S[i][j] = str.charAt(j)-'0';
			}
		}
		//ある数字が何個目にあるかを調べる
		int time = 0;
		int Ans = 1000;
		for(int i=0;i<10;i++) {
			int y = 0;
			int x = -1;
			for(int j=0;j<N;j++) {
				for(int k=0;k<10;k++) {
					if(S[j][k] == i) {
						x =Math.max(k, x);
						for(int a = j;a<N;a++) {
							if(S[j][k] == S[a][k]&&a!=j) {
								y+=10;
								break;
							}
						}
						break;
					}
				}
			}
			time = x+y;
			Ans = Math.min(time, Ans);
		}
		System.out.println(Ans);
	}

}
