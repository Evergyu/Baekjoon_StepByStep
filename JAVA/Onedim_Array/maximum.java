package Onedim_Array;

import java.util.Scanner;

public class maximum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array= new int[9];
		int maxindex=0;
		for(int i=0;i<9;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=1;i<9;i++) {
			if(array[i]>array[maxindex]) {
				maxindex=i;
			}
		}
		System.out.println(array[maxindex]);
		System.out.println(maxindex+1);
	}

}
