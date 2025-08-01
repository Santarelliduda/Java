
public class MyClass {
  public static void main(String args[]) {
  
    //variaveis
        int idade = 16; //numeros inteiros 
        double salario = 1.75; //numeros quebrados
        char letra = 'M'; // letra ou simbolo
        boolean estudante = true; //verdadeiro ou falso
        String nome = "Santarelli"; //texto
        
        System.out.println(idade);
        System.out.println("Minha idade é " + idade);
        System.out.println("O salario é " + salario);
        System.out.println("A letra é " + letra);
        System.out.println("Você estuda? " + estudante);
        System.out.println("Meu nome é " + nome);
        
        // Operadores aritimeticos
        int num1 = 5;
        int num2 = 3;
        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        double div = div = num1 / num2;
        System.out.println("soma" + soma );
        System.out.println("subtraçao" +sub );
        System.out.println("divisão" + div );
        System.out.println("multiplicação" + mult);
        
        /*Cálculo da área de um retângulo*/
    /*largura*comprimento*/
    
    double largura = 7.5;
    double compri = 3.0;
    double area = largura * compri;
    System.out.println("Área " + area);
    
    //Cálculo do desconto 
    double valor = 100;
    double desconto = 15; //%
    double vaDesc = valor * (desconto / 100);
    double valorFi = valor - vaDesc;
    System.out.println ("A pagar " + valorFi);
        
  
  }
}