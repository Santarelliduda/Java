public class MyClass {
  public static void main(String args[]) {
   //Lista de Exercícios - Operadores Aritméticos
   //1 - Cálculo para empresa 
   int inst = 300;
   int limp = 150;
   double manu = 499.99;
   double quanto = inst + limp + manu;
   System.out.println ("o cliente deverá pagar: " + quanto );
   
   //2 - Cálculo de salário 
   int hora = 8;
   int money = 35;
   double mult = hora * money;
   System.out.println ("ele deve receber " +mult);
   
   //3 - Caixas de bombons
   int caixa = 27;
    int bombom = 16;
    int caixasPam = caixa * bombom;
    System.out.println("Quantidade de bombons de Pamela: " + caixasPam);
  
   //4 - Garrafas de água
       int garrafa = 300;
    int cx = 20;
    int vendidas = garrafa/cx;
    System.out.println("A quantidade de caixas ultilizadas foram: " + vendidas);

   //5 - Cálculo para camisetas 
        int estoqueinicial = 120;
        int camisetasvenda = 80;
        int novacompra = 50;
        double preco = 30.00;

        
        int estoqueatual = estoqueinicial - camisetasvenda + novacompra;

        
        double faturamento = camisetasvenda * preco;

       
        System.out.println("Estoque atual: " + estoqueatual);
        System.out.println("Faturamento: R$" + faturamento);
   
   //6 - Dobro e Metade
    int yakult = 500;
   int queijo = 2;
   int half = yakult/queijo;
   int dobro = yakult * queijo;    // Changed variable name from mult
   System.out.println("O número é:  " + yakult);
   System.out.println("O seu dobro é:  " + dobro);
   System.out.println("A sua metade é:  " + half);

  }
}