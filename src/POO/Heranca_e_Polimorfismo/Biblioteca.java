package POO.Heranca_e_Polimorfismo;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivros(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        for (Livro l : livros) {
            l.exibirDetalhes();
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro l : livros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }

    public void adicionarItem(Livro livro) {
        livros.add(livro);
    }

    public void listarItem() {
        for (Livro l : livros) {
            l.exibirDetalhes();
        }
    }

}
