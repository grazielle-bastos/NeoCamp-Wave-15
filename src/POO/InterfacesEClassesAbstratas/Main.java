package POO.InterfacesEClassesAbstratas;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes", 1615);
        Revista revista = new Revista("National Geographic", "Editora NG", 2023, 150);

        System.out.println("Detalhes do Livro:");
        livro.exibirDetalhes();

        System.out.println("\nDetalhes da Revista:");
        revista.exibirDetalhes();

        System.out.println("\nTipo do Livro: " + livro.getTipo() + ", " + revista.getTipo());
    }
}
