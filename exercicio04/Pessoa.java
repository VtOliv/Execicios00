package exercicio04;

public class Pessoa {

    private String nome;
    private int idade;
    private String cidadeDeNasc;

    public Pessoa(String nome, int idade, String cidadeDeNasc) {
        this.nome = nome;
        this.idade = idade;
        this.cidadeDeNasc = cidadeDeNasc;
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

    public String getCidadeDeNasc() {
        return cidadeDeNasc;
    }

    public void setCidadeDeNasc(String cidadeDeNasc) {
        this.cidadeDeNasc = cidadeDeNasc;
    }
}
