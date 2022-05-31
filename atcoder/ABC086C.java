package kentaworks.atcoder;

import java.util.Scanner;
public class ABC086C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] location = {0,0};
		int n = Integer.valueOf(sc.next());
		int x1 = 0;
		int x2 = 0;
		for(int i= 0; i<n;i++) {
			int t = Integer.valueOf(sc.next());
			x1 = Integer.valueOf(sc.next());
			x2 = Integer.valueOf(sc.next());
			location[0]=0;
			location[1]=0;
			for(int j = 1;j<=t;j++) {
				if(location[0]<x1&&location[1]<x2) {
					location[0]+=1;
				}else if(location[0]<x1&&location[1]==x2) {
					location[0]+=1;
				}else if(location[0]<x1&&location[1]>x2) {
					location[0]+=1;
				}else if(location[0]>x1&&location[1]<x2) {
				location[1]+=1;
				}else if(location[0]>x1&&location[1]==x2) {
					location[0]-=1;
				}else if(location[0]>x1&&location[1]>x2){
					location[0]-=1;
				}else if(location[0]==x1&&location[1]<x2){
					location[1]+=1;
				}else if(location[0]==x1&&location[1]==x2){
					location[0]-=1;
				}else if(location[0]==x1&&location[1]>x2){
					location[1]-=1;
				}
			}
			if(location[0]==x1&&location[1]==x2) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
		}
		}
	}
}
