package Onedim_Array;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		int maxindex=0;
		double sum=0;
		for(int i=1;i<n;i++) {
			if(array[i]>array[maxindex]) {
				maxindex=i;
			}
		}
		for(int i=0;i<n;i++) {
			sum+=(double)array[i]/(double)array[maxindex]*100;
		}
		System.out.println(sum/n);
	}

}
