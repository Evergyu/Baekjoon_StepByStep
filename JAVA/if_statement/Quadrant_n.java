package if_statement;

import java.util.Scanner;

public class Quadrant_n {

	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		if(x>0) {
			if(y>0) System.out.println("1");
			else System.out.println("4");
		}
		else {	
			if(y>0) System.out.println("2");
			else System.out.println("3");
		}
	}

}
