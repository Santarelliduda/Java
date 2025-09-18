package primeiroProjeto;

import java.util.Scanner;

public class Lista13 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - Contador: Mostre os números de 10 a 30 no console
        int cont1 = 10;
        do {
            System.out.println(cont1);
            cont1++;
        } while (cont1 <= 30);
        System.out.println("---------------------");

        // 2 - Classificação de Idades: 10 idades -> maior ou menor de idade
        int i2 = 1;
        do {
            System.out.print("Digite a idade " + i2 + ": ");
            int idade = sc.nextInt();
            if (idade >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
            i2++;
        } while (i2 <= 10);
        System.out.println("---------------------");

        // 3 - Eleição: 5 votos
        int votoNum = 1;
        do {
            System.out.print("Digite o voto " + votoNum + " (1-4 candidatos, 5 nulo, 6 branco): ");
            int voto = sc.nextInt();
            switch (voto) {
                case 1 -> System.out.println("Votou no candidato 1");
                case 2 -> System.out.println("Votou no candidato 2");
                case 3 -> System.out.println("Votou no candidato 3");
                case 4 -> System.out.println("Votou no candidato 4");
                case 5 -> System.out.println("Voto nulo");
                case 6 -> System.out.println("Voto em branco");
                default -> System.out.println("Código inválido");
            }
            votoNum++;
        } while (votoNum <= 5);
        System.out.println("---------------------");

        // 4 - Repetição de Frase
        System.out.print("Digite uma frase: ");
        sc.nextLine(); // consumir quebra de linha
        String frase = sc.nextLine();
        System.out.print("Digite um número: ");
        int vezes = sc.nextInt();

        int i4 = 1;
        do {
            System.out.println(frase);
            i4++;
        } while (i4 <= vezes);
        System.out.println("---------------------");

        // 5 - Sequência: 50 até 30
        int num5 = 50;
        do {
            System.out.println(num5);
            num5--;
        } while (num5 >= 30);
        System.out.println("---------------------");

        // 6 - Números Alternados: 1 a 50 pulando de 2 em 2
        int num6 = 1;
        do {
            System.out.println(num6);
            num6 += 2;
        } while (num6 <= 50);
        System.out.println("---------------------");

        // 7 - Aprovado ou Reprovado (5 notas, média >= 6 aprovado)
        int i7 = 1;
        do {
            System.out.print("Digite a nota " + i7 + ": ");
            double nota = sc.nextDouble();
            if (nota >= 6) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            i7++;
        } while (i7 <= 5);
        System.out.println("---------------------");

        // 8 - Categoria de Idade (5 pessoas)
        int i8 = 1;
        do {
            System.out.print("Digite a idade da pessoa " + i8 + ": ");
            int idade = sc.nextInt();
            if (idade <= 12) {
                System.out.println("Criança");
            } else if (idade <= 17) {
                System.out.println("Adolescente");
            } else if (idade <= 59) {
                System.out.println("Adulto");
            } else {
                System.out.println("Idoso");
            }
            i8++;
        } while (i8 <= 5);
        System.out.println("---------------------");

        // 9 - Número Positivo ou Negativo (7 números)
        int i9 = 1;
        do {
            System.out.print("Digite o número " + i9 + ": ");
            int num = sc.nextInt();
            if (num > 0) {
                System.out.println("Positivo");
            } else if (num < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }
            i9++;
        } while (i9 <= 7);

        sc.close();
    }

}

