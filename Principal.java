package empresa;

import java.util.Scanner;

public class Principal {
	
	static Empregado[] vetor = new Empregado[2];
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int y = 0;
		for (int i = 0; i <= 1; i++) { // criando duas instancias do objeto empregado;
		 vetor[i] = new Empregado();
		}

		while(y<2){
		System.out.println("Informe o nome do empregado: ");
		vetor[y].nome = entrada.next();
		// COM NEXTLINE() ESTAVA DUPLICANDO, 
		//NÃO SENDO POSSIVEL COLOCAR O NOME NA POSIÇÃO 1, PULAVA O NOME[1], 
		//SÓ CONSEGUIA O SOBRENOME DA POSIÇÃO 1 
		//NOME[0] E SOBRENOME[0] ESTAVA OK

		System.out.println("Informe o sobrenome empregado: ");
		vetor[y].sobrenome = entrada.next();
		//COM NEXTLINE() ESTAVA DUPLICANDO, 
		//NÃO SENDO POSSIVEL COLOCAR O NOME NA POSIÇÃO 1, PULAVA O NOME[1], 
		//SÓ CONSEGUIA O SOBRENOME DA POSIÇÃO 1
		//NOME[0] E SOBRENOME[0] ESTAVA OK

		System.out.println("Informe o salário anual do empregado: ");
		vetor[y].salario = entrada.nextDouble();

		y++;
		}
		for (int i = 0; i <= 1; i++) {
			System.out.println("O empregado " + vetor[i].nome + " " + vetor[i].sobrenome + " terá um aumento de "
					+ vetor[i].aumentarSalario());
			System.out.println("Salário anual: " + vetor[i].retornarAumento());
		}
	}
}