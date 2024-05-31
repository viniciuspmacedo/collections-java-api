package list.ordenacao.deNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    public List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listaOrdenada = new ArrayList<>(numeros);
        
        if (!numeros.isEmpty()) {
            Collections.sort(listaOrdenada);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
        return listaOrdenada;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> listaOrdenada = new ArrayList<>(numeros);
        if (!numeros.isEmpty()) {
            Collections.sort(listaOrdenada);
            Collections.reverse(listaOrdenada);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
        return listaOrdenada;
    }
}
