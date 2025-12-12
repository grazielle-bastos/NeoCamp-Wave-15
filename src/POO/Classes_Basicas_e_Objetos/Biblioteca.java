package POO.Classes_Basicas_e_Objetos;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivros(Livro livro){
        livros.add(livro);
    }

    public void listarLivros() {
        for (Livro l : livros) {
            l.exibirDetalhes();
        }

        
    }

}
