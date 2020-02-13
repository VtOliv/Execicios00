package exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Fulano", 14, "São Paulo - SP","4634732363");
        Funcionario funcionario = new Funcionario("Ciclano",14,"Serra Negra - SP",12345);

        cliente.mostrarDados();
        funcionario.mostrarDados();

    }
}
