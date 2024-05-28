package list.pesquisa;

public class Livro {
    String titulo;
    String autor;
    int anoPublicação;

    public Livro(String titulo, String autor, int anoPublicação) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicação = anoPublicação;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicação() {
        return anoPublicação;
    }

    @Override
    public String toString() {
        
        return String.format("Titulo: %s, autor: %s, ano de publicação: %d.", titulo, autor, anoPublicação);
    }
    
}
