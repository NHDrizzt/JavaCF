package cFDiv2A;

import java.util.Scanner;

public class CF581div2A {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int r=ob.nextInt();
		int b=ob.nextInt();
		int max,min;
		if(r<b) {
		    max=b;
		    min=r;}
		else{
		    max=r;
		    min=b;
		}
		System.out.println(min);
		int x=max-min;
		System.out.println(x/2);
		

	}

}
