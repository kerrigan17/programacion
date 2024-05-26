package tema6.serializable;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TratamientoSerializado {
    private final Path fichero = Path.of("funkos.dat");

    public void crearFichero() throws IOException {
        if (!Files.exists(fichero)) {
            Files.createFile(fichero);
        }
    }

    public List<Funko> recargarLista() {
        List<Funko> funkos = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(fichero.toFile());
            ObjectInputStream input = new ObjectInputStream(fis)) {
            while (fis.available() > 0) {
                Funko funkoFichero = (Funko) input.readObject();
                funkos.add(funkoFichero);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return funkos;
    }

    public void crearFunko(Funko funko) {
        List<Funko> funkos = recargarLista();
        funkos.add(funko);
        try (FileOutputStream fos = new FileOutputStream(fichero.toFile());
            ObjectOutputStream output = new ObjectOutputStream(fos)) {
            for (Funko funkoSerial : funkos) {
                output.writeObject(funkoSerial);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public void borrarFunko(String cod) {
        List<Funko> funkos = recargarLista();
        funkos.removeIf(funko -> funko.getCod().equals(cod));
        try (FileOutputStream fos = new FileOutputStream(fichero.toFile());
            ObjectOutputStream output = new ObjectOutputStream(fos)) {
            for (Funko funkoSerial : funkos) {
                output.writeObject(funkoSerial);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public void leerFunkos() {
        try (FileInputStream fis = new FileInputStream(fichero.toFile());
            ObjectInputStream input = new ObjectInputStream(fis)) {
            while (fis.available() > 0) {
                Funko funko = (Funko) input.readObject();
                System.out.println(funko.toString());
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public void funkoCaro() {
        Funko funkoCaro = null;
        try (FileInputStream fis = new FileInputStream(fichero.toFile());
            ObjectInputStream input = new ObjectInputStream(fis)) {
            while (fis.available() > 0) {
                Funko funko = (Funko) input.readObject();
                if (funkoCaro == null || funko.getPrecio() > funkoCaro.getPrecio()) {
                    funkoCaro = funko;
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        System.out.println(funkoCaro);
    }

    public void mediaFunko() {
        double precioTotal = 0.0;
        int contador = 0;
        try (FileInputStream fis = new FileInputStream(fichero.toFile());
            ObjectInputStream input = new ObjectInputStream(fis)) {
            while (fis.available() > 0) {
                Funko funko = (Funko) input.readObject();
                precioTotal += funko.getPrecio();
                contador++;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        System.out.println(precioTotal / contador);
    }

    public void mostrarModelos() {
        List<String> modelos = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(fichero.toFile());
            ObjectInputStream input = new ObjectInputStream(fis)) {
            while (fis.available() > 0) {
                Funko funko = (Funko) input.readObject();
                if (!modelos.contains(funko.getModelo())) {
                    modelos.add(funko.getModelo());
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        for (String modelo : modelos) {
            System.out.println(modelo);
            mostrarFunkosModelo(modelo);
        }
    }

    public void mostrarFunkosModelo(String modelo) {
        try (FileInputStream fis = new FileInputStream(fichero.toFile());
            ObjectInputStream input = new ObjectInputStream(fis)) {
            while (fis.available() > 0) {
                Funko funko = (Funko) input.readObject();
                if (modelo.equals(funko.getModelo())) {
                    System.out.println(funko);
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public void mostrar2023() {
        try (FileInputStream fis = new FileInputStream(fichero.toFile());
            ObjectInputStream input = new ObjectInputStream(fis)) {
            while (fis.available() > 0) {
                Funko funko = (Funko) input.readObject();
                if (funko.getFecha().toString().contains("2023")) {
                    System.out.println(funko);
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
