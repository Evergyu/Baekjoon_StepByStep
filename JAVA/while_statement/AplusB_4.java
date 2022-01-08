package while_statement;

import java.util.Scanner;

public class AplusB_4 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){	
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println(a+b);
		}
	}
}