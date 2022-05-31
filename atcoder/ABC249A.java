package kentaworks.atcoder;

import java.util.Scanner;
public class ABC249A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();
		int X = sc.nextInt();
	
		
		int Takalen = 0;
		int Aokilen = 0;
		int Ttim = X/(A+C);
		int Atim = X/(D+F);
		int Ttim1 = X%(A+C);
		int Atim1 = X%(D+F);
		
		Takalen = Ttim*A*B;
		Aokilen = Atim*D*E;
		
		if(Ttim1<=A) {
			Takalen += X*B;
		}else if(A<Ttim1) {
			Takalen += A*B;
		}
		
		if(Atim1<=D) {
			Aokilen += Atim1*E;
		}else if(D<Atim1) {
			Aokilen += D*E;
		}
		
		if(Takalen>Aokilen) {
			System.out.println("Takahashi");
		}else if (Takalen<Aokilen) {
			System.out.println("Aoki");
		}else {
			System.out.println("Draw");
		}
	}

}
