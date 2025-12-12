package POO.InterfacesEClassesAbstratas;

public abstract class Item implements ItemBiblioteca {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    public Item(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Título = " + titulo + "\nAutor = " + autor + "\nAno de publicação = " + anoPublicacao);
    }

    public abstract String getTipo();
}
