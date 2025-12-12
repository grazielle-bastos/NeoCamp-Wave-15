package POO.InterfacesEClassesAbstratas;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Item> itens = new ArrayList<>();

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void listarItens() {
        for (Item item : itens) {
            item.exibirDetalhes();
        }
    }
}
