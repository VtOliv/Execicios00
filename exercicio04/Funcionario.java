package exercicio04;

public class Funcionario extends Pessoa {

    private double numeroDeMatricula;

    public Funcionario(String nome, int idade, String cidadeDeNasc, double numeroDeMatricula) {
        super(nome, idade, cidadeDeNasc);
        this.numeroDeMatricula = numeroDeMatricula;
    }
    public void mostrarDados(){
        String nome = getNome();
        int idade = getIdade();
        String cidade = getCidadeDeNasc();
        System.out.println("Nome:"+nome +" | "+
                "Idade: "+idade+" | "+
                "Cidade: "+cidade+" | "+
                "Matricula :"+numeroDeMatricula);
    }
}
