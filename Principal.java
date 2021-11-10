package empresa;

import java.util.Scanner;

public class Principal {

	static Empregado[] vetor = new Empregado[2];

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i <= 1; i++) { // criando duas instancias do objeto empregado;
			vetor[i] = new Empregado();
		}
		for(int i = 0; i <= 1; i++) {
			System.out.println("Informe o nome do empregado: ");
			vetor[i].nome = entrada.nextLine();
			System.out.println("Informe o sobrenome empregado: ");
			vetor[i].sobrenome = entrada.nextLine();
			System.out.println("Informe o salário anual do empregado: ");
			vetor[i].salario = entrada.nextDouble();
			
			System.out.println("O empregado " + vetor[i].nome + " terá um aumento de " + vetor[i].aumentarSalario());
			System.out.println("Salário anual: "+(vetor[i].salario + vetor[i].aumentarSalario()));
		}
	}
}