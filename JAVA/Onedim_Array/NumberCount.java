package Onedim_Array;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,mul;
		int[]array=new int[10];
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		mul=a*b*c;
		
		while(mul>0) {
			int index=0;
			index=mul%10;
			mul=mul/10;
			array[index]++;
		}
			
		for(int i=0;i<10;i++) {
			System.out.println(array[i]);
		}

	}
}
