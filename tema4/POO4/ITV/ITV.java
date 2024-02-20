package ITV;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ITV {
private List<Vehiculo> registro;

    public ITV() {
        registro = new ArrayList<>();
    }

    public void llegadaVehiculo() {
        Random random = new Random();
        int tipoAleatorio = random.nextInt(3); // 0 para turismo, 1 para camión, 2 para ciclomotor

        String tipoVehiculo;
        switch (tipoAleatorio) {
            case 0:
                tipoVehiculo = "Turismo";
                break;
            case 1:
                tipoVehiculo = "Camión";
                break;
            case 2:
                tipoVehiculo = "Ciclomotor";
                break;
            default:
                tipoVehiculo = "Desconocido";
        }

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Fecha y hora actual: " + dateTime);
        Vehiculo vehiculo = new Vehiculo(tipoVehiculo, dateTime);
        registro.add(vehiculo);
        System.out.println("Vehículo llegado: " + vehiculo);
    }

    public void mostrarRegistro() {
        System.out.println("\nRegistro de vehículos en la ITV:");
        for (Vehiculo vehiculo : registro) {
            System.out.println(vehiculo);
        }
    }
}
