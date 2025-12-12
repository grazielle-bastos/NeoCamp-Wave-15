package POO.Classes_Basicas_e_Objetos;

public class Main {
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca();

        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1615);
        Livro livro2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);

        bib.adicionarLivros(livro1);
        bib.adicionarLivros(livro2);
        bib.listarLivros();
    }
}
