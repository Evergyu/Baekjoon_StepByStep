package while_statement;

import java.util.Scanner;

public class AplusB_5 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		while(true){	
			a=sc.nextInt();
			b=sc.nextInt();
			if(a==0 && b==0) break; 
			else System.out.println(a+b);
		}
		sc.close();
	}
}