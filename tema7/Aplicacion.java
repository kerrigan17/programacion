package tema7;

import java.util.List;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Crear piloto");
            System.out.println("2. Leer piloto");
            System.out.println("3. Leer todos los pilotos");
            System.out.println("4. Actualizar piloto");
            System.out.println("5. Eliminar piloto");
            System.out.println("6. Mostrar clasificación de pilotos");
            System.out.println("7. Mostrar clasificación de equipos");
            System.out.println("8. Insertar pilotos y equipo");
            System.out.println("9. Obtener resultados por piloto");
            System.out.println("10. Obtener clasificación de pilotos");
            System.out.println("11. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del piloto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Ingrese el nombre del piloto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el código del piloto: ");
                    String codigo = scanner.nextLine();
                    Piloto nuevoPiloto = new Piloto(id, nombre, codigo);
                    PilotsCRUD.createPilot(nuevoPiloto);
                    break;
                case 2:
                    System.out.print("Ingrese el ID del piloto: ");
                    int idBuscar = scanner.nextInt();
                    Piloto piloto = PilotsCRUD.readPilot(idBuscar);
                    if (piloto != null) {
                        System.out.println(piloto);
                    } else {
                        System.out.println("Piloto no encontrado.");
                    }
                    break;
                case 3:
                    List<Piloto> pilotos = PilotsCRUD.readPilots();
                    for (Piloto p : pilotos) {
                        System.out.println(p);
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el ID del piloto a actualizar: ");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine();   
                    System.out.print("Ingrese el nuevo nombre del piloto: ");
                    String nombreActualizar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo código del piloto: ");
                    String codigoActualizar = scanner.nextLine();
                    Piloto pilotoActualizar = new Piloto(idActualizar, nombreActualizar, codigoActualizar);
                    PilotsCRUD.updatePilot(pilotoActualizar);
                    break;
                case 5:
                    System.out.print("Ingrese el ID del piloto a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    Piloto pilotoEliminar = new Piloto(idEliminar, null, null);
                    PilotsCRUD.deletePilot(pilotoEliminar);
                    break;
                case 6:
                    PilotsCRUD.showPilotClassification();
                    break;
                case 7:
                    PilotsCRUD.showBuildersClassification();
                    break;
                case 8:
                    PilotsCRUD.insertPilotAndTeam();
                    break;
                case 9:
                    System.out.print("Ingrese el código del piloto: ");
                    scanner.nextLine();   
                    String codigoPiloto = scanner.nextLine();
                    PilotsCRUD.getResultsByDriver(codigoPiloto);
                    break;
                case 10:
                    PilotsCRUD.getDriversStandings();
                    break;
                case 11:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 11);

        scanner.close();
    }
}
