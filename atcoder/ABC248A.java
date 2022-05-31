package kentaworks.atcoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class ABC248A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		char[] Num = number.toCharArray();
		int[] num = new int[9];
		for(int i=0;i<9;i++) {
			num[i] = Integer.parseInt(Character.toString(Num[i]));
		}
		List<Integer> Int = new ArrayList<>(Arrays.asList(
				0,1,2,3,4,5,6,7,8,9));
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<Int.size();j++) {
				if(num[i] == Int.get(j)) {
					Int.remove(j);
				}
			}
		}
		System.out.println(Int.get(0));
	}
}
