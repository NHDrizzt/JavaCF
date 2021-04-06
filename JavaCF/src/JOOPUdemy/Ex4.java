package JOOPUdemy;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculatorMan cm = new CalculatorMan();
		System.out.print("What is the dollar price? ");
		cm.a = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		cm.b= sc.nextDouble();
		System.out.println(cm);
	}
}
