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
		
		System.out.println("O valor da soma dos dois valores �: " + soma);
		System.out.println("O valor da subtra��o dos dois valores �: " + subtracao);
		System.out.println("O valor da divis�o dos dois valores �: " + divisao);
		System.out.println("O valor da multiplica��o dos dois valores �: " + multiplicacao);
		
	}

}
