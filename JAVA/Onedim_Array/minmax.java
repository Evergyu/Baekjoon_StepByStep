package Onedim_Array;

import java.util.Scanner;

public class minmax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int MinIndex=0,MaxIndex=0;
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++) {
			if(array[i]>array[MaxIndex]) {
				MaxIndex=i;
			}
			if(array[i]<array[MinIndex]) {
				MinIndex=i;
			}
		}
		System.out.println(array[MinIndex]+" "+array[MaxIndex]);
	}

}
