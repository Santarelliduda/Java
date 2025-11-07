package Lista24;

public class gato extends animal {
	private String cor;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	 public void subirNoMuro() {
	        System.out.println("O gato " + cor + " está em cima do muro.");
	    }

}
