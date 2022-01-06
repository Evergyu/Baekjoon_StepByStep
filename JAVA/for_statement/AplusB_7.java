package for_statement;

import java.util.Scanner;

public class AplusB_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i,a,b,n=sc.nextInt();
		
		for(i=0;i<n;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Case #"+(i+1)+": "+(a+b));
		}
	}

}
