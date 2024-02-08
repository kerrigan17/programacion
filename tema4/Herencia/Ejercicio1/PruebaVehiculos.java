
public class PruebaVehiculos {
    public static void main(String[] args) {
        Turismo turismo = new Turismo(4, "Rojo", "Toyota", 5, "Particular");
        Camion camion = new Camion(8, "Blanco", "Volvo", 1500, false);
        Ciclomotor ciclomotor = new Ciclomotor(2, "Negro", "Honda", 100);

        System.out.println("Turismo:");
        System.out.println("Marca: " + turismo.marca);
        System.out.println("Color: " + turismo.color);
        System.out.println("Ruedas: " + turismo.ruedas);
        System.out.println("Número de plazas: " + turismo.numPlazas);
        System.out.println("Tipo de uso: " + turismo.tipoUso);

        System.out.println("\nCamión:");
        System.out.println("Marca: " + camion.marca);
        System.out.println("Color: " + camion.color);
        System.out.println("Ruedas: " + camion.ruedas);
        System.out.println("Peso máximo autorizado: " + camion.pesoMaximo + " kg");
        System.out.println("¿Mercancía peligrosa?: " + camion.mercanciaPeligrosa);

        System.out.println("\nCiclomotor:");
        System.out.println("Marca: " + ciclomotor.marca);
        System.out.println("Color: " + ciclomotor.color);
        System.out.println("Ruedas: " + ciclomotor.ruedas);
        System.out.println("Cilindrada: " + ciclomotor.cilindrada + " cc");
        System.out.println("¿Necesita carnet?: " + ciclomotor.necesitaCarnet());
    }    
}