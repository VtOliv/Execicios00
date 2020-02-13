package Exercicio01;

public class Bandas {

    private String banda;
    private String lugar;
    private String data;

    public Bandas(String banda, String lugar, String data) {
        this.banda = banda;
        this.lugar = lugar;
        this.data = data;
    }

    public void diaDeShow() {
        System.out.println("Hoje tem Show da "+banda+" no dia "+data+" no "+ lugar);
    }

    public void bandaPreferida(String banda){
        System.out.println(banda + " é minha banda preferida");
    }
}
