package JOOPUdemy;

public class Funcionario {
	public String nome;
	public double salario;
	public double imposto;
	
	public double netSalary() {
		return salario-imposto;
	}
	
	public void increaseSalary(double percentage) {

		salario +=  ((percentage / 100)*salario);
	}
	
	public String toString() {
		return	nome +
				", $ "+
				String.format("%.2f", netSalary());
	}
}
