package for_statement;

import java.util.Scanner;

public class DrawStar_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,k,n=sc.nextInt();
		for(i=1;i<n+1;i++) {
			for(j=1;j<n+1-i;j++) 	System.out.print(" ");	
			for(k=1;k<i+1;k++)	System.out.print("*");
			System.out.println();
		}
	}
}
