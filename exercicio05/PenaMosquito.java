package exercicio05;

public class PenaMosquito implements escrever {
    private String ehFeitoDe;
    private String escreveCom;

    public PenaMosquito(String ehFeitoDe, String escreveCom) {
        this.ehFeitoDe = ehFeitoDe;
        this.escreveCom = escreveCom;
    }

    @Override
    public void escreve() {
        System.out.println("Feito com "+this.ehFeitoDe+" e escrevendo com "+escreveCom);
    }
}
