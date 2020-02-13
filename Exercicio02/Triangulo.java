package Exercicio02;

public class Triangulo {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Triangulo(){

    }

    public void calcularArea(){
        double area = this.base * this.altura / 2;
        System.out.println("Esse triângulo tem area de "+area);
    }
}
