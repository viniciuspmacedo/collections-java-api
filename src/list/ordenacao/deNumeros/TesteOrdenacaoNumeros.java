package list.ordenacao.deNumeros;

public class TesteOrdenacaoNumeros {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(15);
        ordenacaoNumeros.adicionarNumero(12);
        ordenacaoNumeros.adicionarNumero(51);
        ordenacaoNumeros.adicionarNumero(1);

        System.out.println(ordenacaoNumeros.numeros);
        System.out.println("Ascendente");
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println("Descendente");
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
