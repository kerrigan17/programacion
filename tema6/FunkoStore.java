package tema6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunkoStore{
    private List<Funko> funkos = new ArrayList<>();
    private final String filePath = "/home/celia/programacion/tema6/funkos.csv";

    public void cargarFunkos() {
        try (Stream<String> contenidoFichero = Files.lines(Path.of(filePath))) {
            funkos = contenidoFichero.skip(1).map(linea -> Funko.fromCSV(linea)).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarFunkos() {
        List<String> lines = new ArrayList<>();
        lines.add("COD,NOMBRE,MODELO,PRECIO,FECHA_LANZAMIENTO");
        for (Funko funko : funkos) {
            lines.add(funko.toString());
        }
        try {
            Files.write(Path.of(filePath), lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Funko> getFunkos() {
        return funkos;
    }

    public void mostrar() {
        funkos.forEach(System.out::println);
    }

    public void añadirFunko(Funko funko) {
        funkos.add(funko);
    }

    public void eliminarFunko(String cod) {
        funkos.removeIf(p -> p.getCod().equals(cod));
    }

    public void mostrarMasCaro() {
        Funko masCaro = funkos.stream().max((f1, f2) -> Double.compare(f1.getPrecio(), f2.getPrecio())).orElse(null);
        if (masCaro != null) {
            System.out.println(masCaro);
        } else {
            System.out.println("No hay funkos en la colección.");
        }
    }

    public void mostrarMedia() {
        double media = funkos.stream().mapToDouble(Funko::getPrecio).average().orElse(0.0);
        System.out.println("Precio medio: " + media);
    }

    public void mostrarFunkosPorModelo() {
        funkos.stream().collect(Collectors.groupingBy(Funko::getModelo)).forEach((modelo, lista) -> {
            System.out.println("Modelo: " + modelo);
            lista.forEach(System.out::println);
        });
    }

    public void mostrarFunkosDe2023() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        funkos.stream().filter(f -> sdf.format(f.getFecha()).equals("2023")).forEach(System.out::println);
    }
}
