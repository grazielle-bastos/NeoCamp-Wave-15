package POO.Heranca_e_Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca();

        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1615);
        Revista revista1 = new Revista("National Geographic", "Editora NG", 2023, 150);

        bib.adicionarLivros(livro1);
        bib.adicionarLivros(revista1);

        bib.listarItem();


        Livro encontrado = bib.buscarLivroPorTitulo("National Geographic");
        if (encontrado != null) {
            System.out.println("\nItem encontrado:");
            encontrado.exibirDetalhes();
        } else {
            System.out.println("\nItem não encontrado");
        }
    }
}
