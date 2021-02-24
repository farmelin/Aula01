import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double primeiroValor;
		double segundoValor;
		double soma;
		double subtracao;
		double divisao;
		double multiplicacao;
		
		System.out.println("Por favor, digite um valor: ");
		primeiroValor = leitor.nextDouble();
		System.out.println("Por favor, digite o segundo valor: ");
		segundoValor = leitor.nextDouble();
		
		leitor.close();		
		
		soma = primeiroValor + segundoValor;
		subtracao = primeiroValor - segundoValor;
		divisao = primeiroValor / segundoValor;
		multiplicacao = primeiroValor * segundoValor;
		
		System.out.println("O valor da soma dos dois valores é: " + soma);
		System.out.println("O valor da subtração dos dois valores é: " + subtracao);
		System.out.println("O valor da divisão dos dois valores é: " + divisao);
		System.out.println("O valor da multiplicação dos dois valores é: " + multiplicacao);
		
	}

}
