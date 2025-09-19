package primeiroProjeto;

import java.util.Scanner;

public class Lista15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // 
        String[] frutas = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome da fruta " + (i + 1) + ":");
            frutas[i] = sc.next();
        }
        System.out.println("Frutas digitadas:");
        for (int i = 0; i < 5; i++) {
            System.out.println(frutas[i]);
        }
       

        // 
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Números digitados:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
     

        // 
        int[] nums7 = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            nums7[i] = sc.nextInt();
        }
        System.out.println("Números na ordem inversa:");
        for (int i = 6; i >= 0; i--) {
            System.out.println(nums7[i]);
        }
       

        //
        int[] nums10 = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número:");
            nums10[i] = sc.nextInt();
            if (nums10[i] > 100) {
                System.out.println("maior do que 100");
            }
        }
        

        //
        int[] nums8 = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite um número:");
            nums8[i] = sc.nextInt();
        }
        System.out.println("Digite um número para procurar:");
        int procurar = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < 8; i++) {
            if (nums8[i] == procurar) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Número encontrado no vetor!");
        } else {
            System.out.println("Número não encontrado no vetor!");
        }
       

        //
        String[] nomes = new String[5];
        int[] idades = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            nomes[i] = sc.next();
            System.out.println("Digite a idade de " + nomes[i] + ":");
            idades[i] = sc.nextInt();
        }
        System.out.println("Dados das pessoas:");
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i] + " tem " + idades[i] + " anos");
        }
       

        //
        int[] idadeVet = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a idade " + (i + 1) + ":");
            idadeVet[i] = sc.nextInt();
            if (idadeVet[i] < 18) {
                System.out.println("você é menor de idade");
            }
        }
        

        // 
        double[] salarios = new double[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("Digite o salário do funcionário " + (i + 1) + ":");
            salarios[i] = sc.nextDouble();
            if (salarios[i] <= 2500) {
                System.out.println("você receberá um aumento");
            }
        }
      
	}

}
