package primeiroProjeto;

import java.util.Scanner;

public class Lista09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1 - Contador: 1 a 10
	        int contador1 = 1;
	        while (contador1 <= 10) {
	            System.out.println(contador1);
	            contador1++;
	        }
	

	        // 2 - Contagem regressiva: 10 a 1
	        int conta2 = 10;
	        while (conta2 >= 1) {
	            System.out.println(conta2);
	            conta2--;
	        }
	        

	        // 3 - Sequência numérica: de 0 a 100 de 5 em 5
	        int conta3 = 0;
	        while (conta3 <= 100) {
	            System.out.println(conta3);
	            conta3 += 5;
	        }
	     

	        // 4 - Mostrando mensagem 5 vezes
	        int conta4 = 1;
	        while (conta4 <= 5) {
	            System.out.println("Eu gosto de Java");
	            conta4++;
	        }
	 

	        // 5 - Soma de 5 números digitados
	        int soma = 0;
	        int cont5 = 1;
	        while (cont5 <= 5) {
	            System.out.println("Digite o " + cont5 + "º número: ");
	            int numero = scanner.nextInt();
	            soma += numero;
	            cont5++;
	        }
	        System.out.println("A soma dos números é: " + soma);
	     

	        // 6 - Validação de senha
	        System.out.println("Digite a senha: ");
	        int senha = scanner.nextInt();
	        while (senha != 1234) {
	            System.out.println("Senha incorreta, tente novamente: ");
	            senha = scanner.nextInt();
	        }
	        System.out.println("Senha correta! Acesso liberado.");
	      

	        // 7 - Contagem regressiva a partir de um número informado
	        System.out.println("Digite um número inteiro positivo: ");
	        int numero = scanner.nextInt();
	        while (numero >= 1) {
	            System.out.println(numero);
	            numero--;
	        }

	}

}
