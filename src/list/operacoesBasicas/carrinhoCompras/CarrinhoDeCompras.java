package list.operacoesBasicas.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> carrinhoDeCompra;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompra.add(new Item(nome, preco, quantidade));
    }

    public void removeItem(String nome){
        carrinhoDeCompra.removeIf(i -> i.getNome().equalsIgnoreCase(nome));
    }

    public double calcularValorTotal(){
        double total = 0.0;
        for(Item i : carrinhoDeCompra){
            total += (i.getPreco() * i.getQuantidade());
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(carrinhoDeCompra);
    }
}
