package kentaworks.atcoder;
 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ABC247A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		char[] S = s.toCharArray();
		List<String> list = new ArrayList<>();
		for(int i=0;i<4;i++) {
			list.add(Character.toString(S[i]));
		}
		list.remove(3);
		list.add(0, "0");
		for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i));
		}
	}
}
