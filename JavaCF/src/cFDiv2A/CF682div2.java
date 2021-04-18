package cFDiv2A;

import java.util.Scanner;

public class CF682div2 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long out = 0;
		for(int i = 1;i<=n;i++)
		{
			long num = i+m;
			out += (long)num/5-i/5;
		}
		System.out.println(out);
	}
}
