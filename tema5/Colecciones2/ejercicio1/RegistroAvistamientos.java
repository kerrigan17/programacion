package Colecciones2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class RegistroAvistamientos {
    private List<AvistamientoAnimal> avistamientos;

    public RegistroAvistamientos() {
        this.avistamientos = new ArrayList<>();
    }

    public void agregarAvistamiento(AvistamientoAnimal avistamiento) {
        avistamientos.add(avistamiento);
    }

    public List<AvistamientoAnimal> avistamientosDesdeLasOcho() {
        List<AvistamientoAnimal> resultado = new ArrayList<>();
        for (AvistamientoAnimal avistamiento : avistamientos) {
            if (avistamiento.getHora() >= 8) {
                resultado.add(avistamiento);
            }
        }
        return resultado;
    }

    public List<AvistamientoAnimal> avistamientosNocturnos() {
        List<AvistamientoAnimal> resultado = new ArrayList<>();
        for (AvistamientoAnimal avistamiento : avistamientos) {
            if (avistamiento.getHora() < 8 || avistamiento.getHora() >= 20) {
                resultado.add(avistamiento);
            }
        }
        return resultado;
    }

    public List<AvistamientoAnimal> mostrarManadasLobos() {
        List<AvistamientoAnimal> resultado = new ArrayList<>();
        for (AvistamientoAnimal avistamiento : avistamientos) {
            if (avistamiento instanceof ManadaLobos) {
                resultado.add(avistamiento);
            }
        }
        return resultado;
    }

    public List<AvistamientoAnimal> mostrarSerpientes() {
        List<AvistamientoAnimal> resultado = new ArrayList<>();
        for (AvistamientoAnimal avistamiento : avistamientos) {
            if (avistamiento instanceof Serpiente) {
                resultado.add(avistamiento);
            }
        }
        return resultado;
    }

    public List<AvistamientoAnimal> mostrarPajaros() {
        List<AvistamientoAnimal> resultado = new ArrayList<>();
        for (AvistamientoAnimal avistamiento : avistamientos) {
            if (avistamiento instanceof Pajaro) {
                resultado.add(avistamiento);
            }
        }
        return resultado;
    }
}
