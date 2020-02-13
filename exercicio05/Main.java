package exercicio05;

public class Main {
    public static void main(String[] args) {
        Caneta caneta = new Caneta("Plástico","Tinta");
        Lapis lapis = new Lapis("Madeira","Grafite");
        PenaMosquito penaMosquito = new PenaMosquito("Penas","Tinta");

        System.out.println("-------------------------------------");
        lapis.escreve();
        System.out.println("-------------------------------------");
        caneta.escreve();
        System.out.println("-------------------------------------");
        penaMosquito.escreve();
    }
}
