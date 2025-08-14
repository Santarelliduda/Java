package primeiroProjeto;

import java.util.Scanner;

public class Lista02 {

	public static void main(String[] args) {
		//1 - Resultado de dois números
		Scanner scanner = new Scanner(System.in);
                                          
		
		int num;
		System.out.println("Informe um número: ");
		num = scanner.nextInt();
		int num2;
		System.out.println("Informe outro número: ");
		num2 = scanner.nextInt();
		int soma = num + num2;
		int sub = num - num2;
		int mult = num * num2;
		int div = num / num2;
		System.out.println("A soma desses números é: " + soma);
		System.out.println("A subtração desses números é: " + sub);
		System.out.println("A multiplicação desses números é: " + mult);
		System.out.println("A divisão desses números é: " + div);
		
		//2 - Cálculo de temperatura
		int cel;
		System.out.println("\n\nMe fale uma temperatura em graus Celsius: ");
		cel = scanner.nextInt();
		double fah = cel * 1.8;
		double fahr = fah + 32;
		System.out.println("A temperatura em graus Fahrenheit é: " + fahr);
		System.out.println("A temperatura em graus Celsius é: " + cel);
		
		//3 - Conversão de valor
		double real;
		System.out.println("Qual é o valor em real? ");
		real = scanner.nextDouble(); 
		double divs = real / 5.70;
		System.out.println("O valor em dollar é: " + div);
		
		//4 - Área do retângulo
		System.out.println();
		System.out.println();
		System.out.println("Informe a base do seu retângulo: ");
		double base;
		base = scanner.nextDouble();
		System.out.println("Informe a altura: ");
		double altura;
		altura = scanner.nextDouble();
		double area = base * altura;
		System.out.println("A área do retângulo é: " + area);
		
		//5 - Conversor de idade
		System.out.println();
		System.out.println();
		System.out.println("Informe sua idade em anos: ");
		int idade;
		idade = scanner.nextInt();
		int idMes = idade * 12;
		System.out.println("Você já viveu " + idMes + " meses!");
		
		//6 - Conversor de minutos para segundos
		System.out.println();
		System.out.println();
		System.out.println("Fale um determinado tempo em minutos: ");
		double minutes;
		minutes = scanner.nextDouble();
		double seconds = minutes * 60;
		System.out.println("Isso esquivale a " + seconds + "segundos!");
		
		//7 - Custo da compra
		System.out.println();
		System.out.println();
		System.out.println("Informe o preço de um produto: ");
		double produto;
		produto = scanner.nextDouble();
		System.out.println("Agora, informe quantos produtos foram comprados: ");
		int quantidade;
		quantidade = scanner.nextInt();
		double custo = produto * quantidade;
		System.out.println("O custo total foi: " + custo);

		//8 - Divisão de uma conta de restaurante
		System.out.println();
		System.out.println();
		System.out.println("Informe o valor da conta do restaurante: ");
		double conta;
		conta = scanner.nextDouble();
		System.out.println("Quantas pessoas vão dividir está conta? ");
		int pessoas;
		pessoas = scanner.nextInt();
		double pagar = conta / pessoas;
		System.out.println("cada pessoa deve pagar R$: " + pagar);
		
		//9 - Cálculo de troco
		System.out.println();
		System.out.println();
		System.out.println("Informe o valor de uma compra: ");
		double compra;
		compra = scanner.nextDouble();
		System.out.println("Qual foi o valor pago? ");
		double pago;
		pago = scanner.nextDouble();
		double troco = pago - compra;
		System.out.println("O troco é R$: " + troco);

	}

}
