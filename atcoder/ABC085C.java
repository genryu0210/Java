package kentaworks.atcoder;

import java.util.Scanner;
public class ABC085C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ret = "-1 -1 -1";
		int N = sc.nextInt();
		int Y = sc.nextInt();
			for(int x =N;x>=0;x--) {
				for(int y = N-x;y>=0;y--) {
					for(int z = N-(x+y);z>=0;z--) {
						if(N==(x+y+z)&&Y==(10000*x)+(5000*y)+(1000*z)) {
							ret = String.format("%d %d %d", x, y, z);
						}
					}
				}
			}
		System.out.println(ret);
	}
}
