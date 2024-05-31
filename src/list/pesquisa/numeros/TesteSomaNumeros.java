package list.pesquisa.numeros;

public class TesteSomaNumeros {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

//        somaNumeros.adicionaNumeros(10);
//        somaNumeros.adicionaNumeros(11);
//        somaNumeros.adicionaNumeros(12);

        System.out.println(somaNumeros.numeros);

        System.out.printf("Soma dos números: %d: ", somaNumeros.calcularSoma());

        System.out.printf("Maior número: %d: ", somaNumeros.encontrarMaiorNumero());

        System.out.printf("Menor número: %d: ", somaNumeros.encontrarMenorNumero());
    }
}
