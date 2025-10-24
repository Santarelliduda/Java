
public class Contap {

	public static void main(String[] args) {
		conta conta = new conta();
        conta.titular = "Fernanda";
        conta.saldo = 0;
        
        conta.mostrarSaldo();
        conta.depositar(500);
        conta.sacar(150);
        conta.mostrarSaldo();
    }

	}

