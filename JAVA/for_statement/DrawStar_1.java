package for_statement;

import java.util.Scanner;

public class DrawStar_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,n=sc.nextInt();
		for(i=1;i<n+1;i++) {
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
