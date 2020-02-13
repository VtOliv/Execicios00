package Exercicio02;

public class Execicio02 {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(4.5,3.5);
        Triangulo triangulo1 = new Triangulo(9.1,7.4);
        Triangulo triangulo2 = new Triangulo(5.2,6.1);

        System.out.println("--------------------------------");
        triangulo.calcularArea();
        System.out.println("--------------------------------");
        triangulo1.calcularArea();
        System.out.println("--------------------------------");
        triangulo2.calcularArea();
        System.out.println("--------------------------------");



    }
}
