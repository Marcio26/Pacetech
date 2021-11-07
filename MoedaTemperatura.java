import java.util.Scanner;

public class MoedaTemperatura {

	static double celsius, conversaoCelsius, fahrenheit, conversaoFahrenheit;
	static double cotacaoDolar, conversaoDolar, valorDolar;
	static double conversaoReal;
	static double valorReal;
	static double cotacaoReal;

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		int valorDigitado;
		do {
			System.out.println("O que você deseja fazer");
			System.out.println(" ");
			System.out.println("1 - Converter dolar para real");
			System.out.println("2 - Converter real para dolar");
			System.out.println("3 - Converter celsius para fahrenheit");
			System.out.println("4 - Converter fahrenheit para celsius ");
			System.out.println("0 - Sair");
			System.out.println(" ");
			Scanner leia = new Scanner(System.in);
			valorDigitado = leia.nextInt();

			switch (valorDigitado) {
			case 1:
				dolarToReal();
				break;

			case 2:
				realToDolar();
				break;

			case 3:
				celsiusToFahrenheit();
				break;

			case 4:
				fahrenheitToCelsius();
				break;

			default:
				if (valorDigitado == 0) {
					System.exit(0);
					break;
				} else {
					System.out.println("Opção inválida");
					menu();
				}
			}
		} while (valorDigitado != 0);
	}

	public static void dolarToReal() {
		Scanner leitor = new Scanner(System.in);

		/*
		 MÉTODO PARA SABER A COTAÇÃO ATUAL DO DOLAR CONFORME A VISÃO DOS BRASILEIROS
		 EX: HOJE 07/11/2021 O DOLAR ESTA VALENDO 5,54 REAIS.(CINCO REAIS E CINQUENTA
		 E QUATRO CENTAVOS) O PROGRAMA VAI PERGUNTAR QUAL O VALOR ATUAL DO DOLAR QUE
		 HOJE DIA 07/11/2021 VALE 5,54, ENTÃO TU COLOCA O VALOR DE 5,54 REAIS.
		 (CINCO E CINQUENTA E QUATRO) 
		 O PROGRAMA VAI FAZER A CONVERSÃO
		 */
		System.out.println("Qual o valor atual do Dolar?(Comparando com o real)");
		double cotacaoDolar = leitor.nextDouble();
		System.out.println("Quantos dolares voce precisa?");
		double valorDolar = leitor.nextDouble();
		double conversaoDolar = valorDolar * cotacaoDolar;
		System.out.println("Hoje para comprar U$" + valorDolar + ", preciso de R$" + conversaoDolar);
	}

	public static void realToDolar() {
		Scanner leitor = new Scanner(System.in);
		/*MÉTODO PARA SABER A COTAÇÃO ATUAL DO REAL 
		* EX: HOJE 07/11/2021 O REAL ESTA VALENDO 0,18 CENTAVOS DE DOLAR.(DEZOITO CENTAVOS)
		* O PROGRAMA VAI PERGUNTAR QUAL O VALOR ATUAL DO REAL QUE HOJE DIA 07/11/2021 VALE 0,18 CENTAVOS DE DOLAR,
		* ENTÃO TU COLOCA O VALOR DE 0,18 CENTAVOS DE DOLAR.(DEZOITO CENTAVOS)
		* O PROGRAMA VAI FAZER A CONVERSÃO
		*/

		System.out.println("Qual o valor atual do real?(Comparando com o Dolar)");
		double cotacaoReal = leitor.nextDouble();
		System.out.println("Quantos reais você precisa?");
		double valorReal = leitor.nextDouble();
		double conversaoReal = valorReal * cotacaoReal;
		System.out.println("Hoje para comprar R$" + valorReal + ", preciso de U$" + conversaoReal);
	}

	public static void celsiusToFahrenheit() {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Qual temperatura em Celsius você quer converter?");
		double celsius = leitor.nextDouble();
		double conversaoCelsius = (celsius * 1.8) + 32;
		System.out.println(celsius + "°C é " + conversaoCelsius + " graus Fahrenheit");

	}

	public static void fahrenheitToCelsius() {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Qual temperatura em Fahrenheit você quer converter?");
		double fahrenheit = leitor.nextDouble();
		double conversaoFahrenheit = (fahrenheit - 32) * (5 / 9);
		System.out.println(fahrenheit + "°F é " + conversaoFahrenheit + " graus Celsius");
	}
}