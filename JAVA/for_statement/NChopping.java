package for_statement;
// BufferedReader / Writer
/* 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class NChopping {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int i,n=Integer.parseInt(br.readLine());
		
		for(i=0;i<n;i++) {
			bw.write(i+1+"\n");
			bw.flush();
		}
		br.close();
		bw.close();	
	}

}
*/ 
//Scanner
import java.util.Scanner;

public class NChopping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n=sc.nextInt();
		for(i=0;i<n;i++) System.out.println(i+1);
	}
}