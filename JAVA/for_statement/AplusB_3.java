package for_statement;

import java.util.Scanner;

public class AplusB_3 {

	public static void main(String[] args) {
		int i,n,a,b;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println(a+b);
		}
	}

}
