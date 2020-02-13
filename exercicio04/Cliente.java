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
        System.out.println("Nome:"+nome +" | "+
                "Idade: "+idade+" | "+
                "Cidade: "+cidade+" | "+
        "CPF :"+cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
