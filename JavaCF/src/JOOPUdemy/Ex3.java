package JOOPUdemy;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Aluno a = new Aluno();
		a.nome = sc.nextLine();
		a.a = sc.nextDouble();
		a.b = sc.nextDouble();
		a.c = sc.nextDouble();
		
		double d = a.calculoNota();
		if(d>60) {
			System.out.println("FINAL GRADE = " + a.calculoNota());
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.println("MISSING " + (60-d) + " POINTS");
		}

	}

}
