package Herencia.Ejercicio3;
import tema4.Figura2D;

public class Cuadrado extends Figura2D {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

}