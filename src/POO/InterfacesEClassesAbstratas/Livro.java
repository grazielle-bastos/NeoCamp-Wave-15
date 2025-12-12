package POO.InterfacesEClassesAbstratas;

public class Livro extends Item {

    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao); // Chama o construtor da classe abstrata
    }

    @Override
    public String getTipo() {
        return "Livro";
    }
}
