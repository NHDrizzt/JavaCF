package PackageA;
import java.util.*;
import java.util.Scanner;

public class Night_at_the_Museum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		char a='a';
		int soma=0;
		s = scan.next();
		char arr[] = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(Math.abs(arr[i]-a)>13) 
				soma += 26%Math.abs(arr[i]-a);
			
			else 
				soma+= Math.abs(arr[i]-a);
			
			a = arr[i];
		}
		System.out.println(soma);
	}
}

/* 
	String output = "";

		for(char alphabet = 'a'; alphabet <='z'; alphabet++ )
		{
		        output += alphabet;
		        System.out.println(output);
		}
		
*/