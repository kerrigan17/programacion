package vrepaso.ITV;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.time.LocalDateTime;

public class Registro {
    private List<Vehiculo> listaVehiculos;
    private String tipo;
    private Random random;

    public Registro (){
        listaVehiculos = new ArrayList<>();
        random = new Random();
    }
    
    public void agregarVehiculo(){
        LocalDateTime hora = LocalDateTime.now();
        
        int numeroTipo = random.nextInt(1,4);
        switch (numeroTipo) {
            case 1:
                tipo = "coche";
                break;
            case 2:
                tipo = "ciclimotor";
                break;
            case 3:
                tipo = "Camion";
                break;
            default:
            System.out.println("Ha habido un problema con el registro, lo siento");
                break;
        }
        String matricula = generarMatricula();
        if(listaVehiculos.contains(matricula)){
            while (listaVehiculos.contains(matricula)) {
                matricula = generarMatricula();                
            }
        }else{
            Vehiculo vehiculo = new Vehiculo(matricula,tipo,hora);
            listaVehiculos.add(vehiculo);
        }
    }

    public String generarMatricula(){
        random=new Random();
        int numeroRandom=random.nextInt(9000)+1000;
        String conversion = Integer.toString(numeroRandom);
        return conversion + "ADV";
    }

    public void mostrarTodosLosVehiculos() {
        if (listaVehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
        } else {
            for (Vehiculo vehiculo : listaVehiculos) {
                System.out.println(vehiculo);
            }
        }
    }

    public static void main(String[] args) {
        Registro registro = new Registro();
        for (int i = 0; i < 5; i++) {
            registro.agregarVehiculo();
        }
        registro.mostrarTodosLosVehiculos();
    }
}
