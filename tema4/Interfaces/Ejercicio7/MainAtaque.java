package Interfaces.Ejercicio7;

public class MainAtaque {
    public static void main(String[] args) {
        AtaqueMagico ataqueMagico =new AtaqueMagico();
        ataqueMagico.lanzar();
        ataqueMagico.coste();

        AtaqueFisico ataqueFisico = new AtaqueFisico();
        ataqueFisico.lanzar();
        ataqueFisico.coste();
        ataqueFisico.dano();

        AtaqueMagicoYFisico ataqueMF = new AtaqueMagicoYFisico();
        ataqueMF.lanzar();
        ataqueMF.coste();
    }
}