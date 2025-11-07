package Lista24;

public class manimal {
    public static void main(String[] args) {

        cachorro c = new cachorro();
        c.setNome("Thor");
        c.setIdade(5);
        c.setRaca("Labrador");

        gato g = new gato();
        g.setNome("Mimi");
        g.setIdade(2);
        g.setCor("branco");

        System.out.println("--- Cachorro ---");
        c.mostrarInfo();
        c.abanarRabo();

        System.out.println("\n--- Gato ---");
        g.mostrarInfo();
        g.subirNoMuro();
    }
}
