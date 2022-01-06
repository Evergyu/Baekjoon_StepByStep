package for_statement;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i=0;
		n=sc.nextInt();
		for(i=1;i<10;i++) System.out.println(n +" * "+ i+"= "+(n*i));
		sc.close();
	}

}
