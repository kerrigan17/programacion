package matrices;

import java.util.Scanner;

public class empresa {
    static Scanner scanner = new Scanner(System.in);
    static int totalNinos = 0;
    static int totalAdultos = 0;
    static double totalValoresProduccionNinos = 0;
    static int cantidadMayorTipo = 0;
    static String tipoMayorCantidad = "";

    public static void main(String[] args) {
        while (true) {
            ingresarProducto();
            System.out.print("¿Desea ingresar otro producto? (S/N): ");
            String continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }

        mostrarInformeGeneral();
    }

    public static void ingresarProducto() {
        System.out.println("Ingrese los datos del producto:");
        System.out.print("Tipo (N/A): ");
        String tipo = scanner.next();
        System.out.print("Código numérico: ");
        int codigo = scanner.nextInt();
        System.out.print("Costo de fábrica: ");
        double costoFabrica = scanner.nextDouble();

        // Calculando la variedad, valor de producción y precio de venta al público
        String variedad = calcularVariedad(codigo);
        double valorProduccion = calcularValorProduccion(tipo, variedad, costoFabrica);
        double precioVentaPublico = calcularPrecioVentaPublico(costoFabrica, valorProduccion);

        // Mostrar el informe del producto
        mostrarInformeProducto(tipo, codigo, variedad, costoFabrica, valorProduccion, precioVentaPublico);

        // Actualizar totales y mayor cantidad de tipo de producto
        actualizarTotalesYMayorCantidad(tipo);

        // Actualizar valores de producción para niños
        if (tipo.equalsIgnoreCase("N")) {
            totalValoresProduccionNinos += valorProduccion;
        }
    }

    public static String calcularVariedad(int codigo) {
        return (codigo < 11) ? "salado" : "dulce";
    }

    public static double calcularValorProduccion(String tipo, String variedad, double costoFabrica) {
        double porcentajeBeneficio = (tipo.equalsIgnoreCase("A")) ? 0.2 : 0.1;
        double factorVariedad = (variedad.equalsIgnoreCase("salado")) ? 2 : 4;
        return factorVariedad * costoFabrica * (1 + porcentajeBeneficio);
    }

    public static double calcularPrecioVentaPublico(double costoFabrica, double valorProduccion) {
        return costoFabrica + valorProduccion;
    }

    public static void mostrarInformeProducto(String tipo, int codigo, String variedad, double costoFabrica,double valorProduccion, double precioVentaPublico) {
        System.out.println("\n-- Informe del producto --");
        System.out.println("Tipo: " + tipo);
        System.out.println("Código: " + codigo);
        System.out.println("Variedad: " + variedad);
        System.out.println("Costo de fábrica: " + costoFabrica);
        System.out.println("Valor de producción: " + valorProduccion);
        System.out.println("Precio de venta al público: " + precioVentaPublico);
    }

    public static void actualizarTotalesYMayorCantidad(String tipo) {
        if (tipo.equalsIgnoreCase("N")) {
            totalNinos++;
        } else {
            totalAdultos++;
        }

        if (tipo.equalsIgnoreCase(tipoMayorCantidad)) {
            cantidadMayorTipo++;
        } else if (totalNinos > totalAdultos) {
            cantidadMayorTipo = totalNinos;
            tipoMayorCantidad = "N";
        } else {
            cantidadMayorTipo = totalAdultos;
            tipoMayorCantidad = "A";
        }
    }

    public static void mostrarInformeGeneral() {
        System.out.println("\n-- Informe General --");
        System.out.println("Cantidad de productos para niños: " + totalNinos);
        System.out.println("Cantidad de productos para adultos: " + totalAdultos);
        System.out.println("Total valores de producción de productos para niños: " + totalValoresProduccionNinos);
        System.out.println("Promedio de valores de producción de productos para niños: " +
                (totalValoresProduccionNinos / totalNinos));
        System.out.println("Tipo de producto fabricado mayor cantidad de veces: " + tipoMayorCantidad +
                " (" + cantidadMayorTipo + " veces)");
    }
}

