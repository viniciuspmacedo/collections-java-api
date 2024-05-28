package list.pesquisa;

public class TestePesquisaLivro {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionaLivros("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionaLivros("Livro 1", "Autor 2", 2022);
        catalogoLivros.adicionaLivros("Livro 2", "Autor 2", 2021);
        catalogoLivros.adicionaLivros("Livro 3", "Autor 3", 2019);
        catalogoLivros.adicionaLivros("Livro 4", "Autor 1", 1896);

        System.out.println(catalogoLivros.pesquisaPorAutor("Autor 1"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(1800, 2020));

    }
}
