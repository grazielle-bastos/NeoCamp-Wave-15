package POO.Encapsulamento_e_Metodos;

public class Main {
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca();

        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1615);
        Livro livro2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);

        bib.adicionarLivros(livro1);
        bib.adicionarLivros(livro2);

        bib.listarLivros();

        Livro livroEncontrado = bib.buscarLivroPorTitulo("Dom Quixote");
        if (livroEncontrado != null) {
            System.out.println("\nLivro encontrado:");
            livroEncontrado.exibirDetalhes();
        } else {
            System.out.println("\nLivro não encontrado");
        }
    }
}
