import java.util.Scanner;

public class Calculadora {
	public static double valor1 = 0;
	public static double valor2 = 0;
	//public static double soma;
	//public static double subtracao;
	public static double divisao;
	public static double multiplicacao;
	public static void exibirResultado (double resultado) {
		System.out.println("o resultado foi" + resultado+ "!\n");
	}
	public static void somar(double valorA, double valorB) {
		double soma;
		System.out.println("\n\nRealizando a soma entre " + valorA + " e " + valorB);
		soma = valorA + valorB;
      exibirResultado (soma);		
	}
    public static void subtrair (double valorA, double valorB) {
    	double subtracao;

    	 System.out.println("\n\nRealizando a subtração entre " + valorA + " e " + valorB);
			subtracao = valorA - valorB;
exibirResultado(valorA - valorB);	
     }
    public static void dividir (double valorA, double valorB) {
    	System.out.println("\n\nRealizando a divisão entre " + valor1 + " e " + valor2);
		divisao = valorA / valorB;
exibirResultado(divisao);    }
    public static void multiplicar(double valorA, double valorB) {
    	System.out.println("\n\nRealizando a multiplicação entre " + valorA + " e " + valorB);
		multiplicacao = valorA * valorB;
exibirResultado(multiplicacao);    }
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1 = 0, valor2=0;
		double subtracao, divisao, multiplicacao;
		int opcao = 0;
		
		while (opcao!=6) {
			System.out.println("PROGRAMA CALCULADORA");
			System.out.println("Escolha sua opção!");
			System.out.println("1 - Digitar valores");
			System.out.println("2 - Realizar soma");
			System.out.println("3 - Realizar subtração");
			System.out.println("4 - Realizar divisão");
			System.out.println("5 - Realizar multiplicação");
			System.out.println("6 - Sair");
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("\n\nDigite o 1º valor:");
				valor1 = leitor.nextDouble();
				System.out.println("\n\nDigite o 2º valor:");
				valor2 = leitor.nextDouble();
				
				System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");
				
				break;
			case 2:
				somar(valor1, valor2);	
				break;
			case 3:
				subtrair(valor1, valor2);
				break;
			case 4:
				dividir(valor1, valor2);
				break;
			case 5:
				multiplicar(valor1, valor2);
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}
			
		}
		leitor.close();
		

	}

}
