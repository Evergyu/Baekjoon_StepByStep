package Onedim_Array;

public class Test {

	public static void main(String[] args) {
		int i=1867;
		int length=(int)(Math.log10(i)+1);
		System.out.println(length);
		System.out.println(i%(length*10));
		
	}

}