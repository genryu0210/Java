import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int [N];
		int[] B = new int[K];
		List<Integer> int_max = new ArrayList<>();
		
		for(int i = 0; i<N;i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0;i<K;i++) {
			B[i] = sc.nextInt();
		}
		
		int max = A[0];
		
		for(int i=0;i<N;i++) {
			if(max < A[i]) {
				max = A[i];
				int_max.clear();
				int_max.add(i+1);
			}else if(max == A[i]) {
				int_max.add(i+1);
			}
		}
		int YN_flag = 0;
		for(int i = 0;i<K;i++) {
			for(int j = 0;j<int_max.size();j++) {
				if(B[i] == int_max.get(j)) {
					YN_flag++;
				}
			}
		}
		if(YN_flag >0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
