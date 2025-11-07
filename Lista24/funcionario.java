package Lista24;

public class funcionario {
	private String nome;
	private double salariobase;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalariobase() {
		return salariobase;
	}
	public void setSalariobase(double salariobase) {
		this.salariobase = salariobase;
	}
	
    public double calcularsalario() {
        return salariobase;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + calcularsalario());
    }

}
