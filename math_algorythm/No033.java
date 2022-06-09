package math_and_algorithm;

import java.util.Scanner;

public class No033 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		long 	ax = sc.nextLong(),ay = sc.nextLong()
				,bx = sc.nextLong(),by = sc.nextLong()
				,cx = sc.nextLong(),cy = sc.nextLong();
		
		long 	BAx = (ax-bx),BAy = (ay-by),
				BCx = (cx-bx),BCy = (cy-by),
				CAx = (ax-cx),CAy = (ay-cy),
				CBx = (bx-cx),CBy = (by-cy);
		
		int pattern = 3;
		if(BAx*BCx + BAy*BCy < 0) {pattern = 1;}
		if(CAx*CBx + CAy*CBy < 0) {pattern = 2;}
		
		double Ans = 0;
		
		if(pattern == 1) {Ans = Math.sqrt((BAx*BAx + BAy*BAy));}
		if(pattern == 2) {Ans = Math.sqrt((CAx*CAx + CAy*CAy));}
		if(pattern == 3) {
			double S = BAx*CAy - BAy*CAx;
			double BC = Math.sqrt(BCx*BCx + BCy*BCy);
			Ans = Math.abs(S/BC);
		}
		
		System.out.println(Ans);
	}

}
