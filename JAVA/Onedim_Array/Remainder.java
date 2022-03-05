package Onedim_Array;

import java.util.Scanner;

public class Remainder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array=new int[42];
		int number=10;
		for(int i=0;i<10;i++) {
			int num=sc.nextInt()%42;
			array[num]++;
		}
		for(int i=0;i<42;i++) {
			if(array[i]!=0&&array[i]!=1) {
				number=number-array[i]+1;
			}
		}
		System.out.println(number);
	}
}