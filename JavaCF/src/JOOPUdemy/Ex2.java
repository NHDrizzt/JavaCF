package JOOPUdemy;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario f = new Funcionario();
		System.out.print("Nome: ");
		f.nome = sc.nextLine();
		System.out.print("Salario: ");
		f.salario = sc.nextDouble();
		System.out.print("Imposto: ");
		f.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: "+ f);
		
		System.out.println("Which percentage to increase salary? " );
		double percentage = sc.nextDouble();
		f.increaseSalary(percentage);
		System.out.print("Update data: " + f);

		
	}
}
