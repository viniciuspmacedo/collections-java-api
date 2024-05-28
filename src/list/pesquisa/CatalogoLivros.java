package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<Livro>();
    }

    public void adicionaLivros(String titulo, String autor, int anoPublicação) {
        listaLivros.add(new Livro(titulo, autor, anoPublicação));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosFiltrados = new ArrayList<>();

        if (!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros) {
                if (livro.getAutor() == autor) {
                    livrosFiltrados.add(livro);
                }
            }
        }
        return livrosFiltrados;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosFiltrados = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros) {
                if (livro.getAnoPublicação() >= anoInicial
                        && livro.getAnoPublicação() <= anoFinal) {
                            livrosFiltrados.add(livro);
                }
            }
        }
        return livrosFiltrados;
    }
    
    public Livro pesquisaPorTitulo(String titulo){
        Livro livro = null;

        for (Livro l : listaLivros) {
                if (l.titulo.equalsIgnoreCase(titulo)) {
                    livro = l;
                }
            }
            return livro;
        }
        
    }

