package POO.Classes_Basicas_e_Objetos;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirDetalhes() {
        System.out.println("\nTitulo = " + titulo + "\nAutor = " + autor + "\nAno de publicacao = " + anoPublicacao);
    }
}
