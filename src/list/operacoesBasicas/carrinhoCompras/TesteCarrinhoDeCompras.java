package list.operacoesBasicas.carrinhoCompras;

public class TesteCarrinhoDeCompras {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("pão", 1, 2);
        carrinhoDeCompras.adicionarItem("peito de frango", 22.33, 1);

        double valorTotal = carrinhoDeCompras.calcularValorTotal();
        System.out.println("Valor total: R$ " + valorTotal);

        carrinhoDeCompras.exibirItens();

        System.out.println("removendo pão da lista");
        carrinhoDeCompras.removeItem("pão");
        carrinhoDeCompras.exibirItens();
    }
}
