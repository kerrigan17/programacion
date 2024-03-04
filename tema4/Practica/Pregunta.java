package Practica;

class Pregunta {
    String enunciado;
    String respuestaCorrecta;
    boolean esMultipleChoice;
    String[] opciones;

    public Pregunta(String enunciado, String respuestaCorrecta, boolean esMultipleChoice, String[] opciones) {
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
        this.esMultipleChoice = esMultipleChoice;
        this.opciones = opciones;
    }

    public boolean verificarRespuesta(String respuesta) {
        if (esMultipleChoice) {
            return respuesta.equalsIgnoreCase(respuestaCorrecta);
        } else {
            return respuesta.trim().equalsIgnoreCase(respuestaCorrecta);
        }
    }

    public void mostrar() {
        System.out.println(enunciado);
        if (esMultipleChoice) {
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }
        }
    }
}
