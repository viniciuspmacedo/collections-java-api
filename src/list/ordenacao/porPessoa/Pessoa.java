package list.ordenacao.porPessoa;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura ;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(idade, pessoa.getIdade());
    }
}
