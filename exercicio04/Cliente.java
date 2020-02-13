package exercicio04;

public class Cliente extends Pessoa {

    private String cpf;

    public Cliente(String nome, int idade, String cidadeDeNasc, String cpf) {
        super(nome, idade, cidadeDeNasc);
        this.cpf = cpf;
    }
    public void mostrarDados(){
        String nome = getNome();
        int idade = getIdade();
        String cidade = getCidadeDeNasc();
        System.out.println("nome:"+nome +" "+
                "idade: "+idade+" "+
                "cidade: "+cidade+" "+
        "CPF :"+cpf);
    }
}
