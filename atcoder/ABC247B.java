package kentaworks.atcoder;

import java.util.Scanner;
public class ABC247B {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		String[] s = new String[N];
		String[] t = new String[N];
		int flag = 0;
		for(int i=0;i<N;i++) {
			s[i] = sc.next();
			t[i] = sc.next();
		}
		for(int i=0;i<N;i++) {
			for(int l=0;l<N;l++) {
				if(i==l) {
				}else if(s[i].matches(s[l])) {
					for(int k=0;k<N;k++) {
						if(i==k) {
						}else if(t[i].matches(t[k])) {
							flag++;
						}
					}
				}else if(t[i].matches(t[l])) {
					for(int k=0;k<N;k++) {
						if(i==k) {
						}else if(s[i].matches(s[k])) {
							flag++;
						}
					}
				}else if(s[i].matches(t[l])) {
					for(int k=0;k<N;k++) {
						if(i==k) {
						}else if(t[i].matches(s[k])) {
							flag++;
						}
					}
				}else if(t[i].matches(s[l])) {
					for(int k=0;k<N;k++) {
						if(i==k) {
						}else if(s[i].matches(t[k])) {
							flag++;
						}
					}
				}
			}
		}
		if(flag==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
