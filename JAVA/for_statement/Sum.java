package for_statement;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,s=0;
		
		n=sc.nextInt();
		for(i=1;i<n+1;i++) s+=i;
		System.out.println(s);
	}

}
