package kentaworks.atcoder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ABC085B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for (int i =1; i<=N;i++) {
			list.add(sc.nextInt());
		}
		List<Integer> listed = new ArrayList<>(new HashSet<>(list));
		System.out.println(listed.size());
	}

}
