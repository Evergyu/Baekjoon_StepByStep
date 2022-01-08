package while_statement;

import java.util.Scanner;

public class PlusCycle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0,Bef=sc.nextInt(),Aft=0,Temp=Bef,a=0,b=0;
		
		while(Bef!=Aft) {
			if(Temp<10) {a=0; b=Temp;	}
			else {a=Temp/10;b=Temp%10;}
			Aft=b*10 + (a+b)%10;
			Temp=Aft;
			count++;
		}
		System.out.println(count);
		
	}

}
