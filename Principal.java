package empresa;

import java.util.Scanner;

public class Principal {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		Empregado emp = new Empregado("", "", 0);
		Empregado emp2 = new Empregado("", "", 0);

		emp.setNome("Joao");
		emp.setSobrenome("Silva");
		emp.setSalario(1000);

		emp2.setNome("Paulo");
		emp2.setSobrenome("Santos");
		emp2.setSalario(2000);

		emp.mostrarEmpregado();
		emp2.mostrarEmpregado();

	}
}
