package Practica;

import java.util.Scanner;

public class Concurso {

    private static final int TAMANO_CUADRICULA =5;
    private Pregunta[][] cuadricula;
    private String[][] premios;
    private boolean[][] respondido;

    public Concurso(){
        cuadricula=new Pregunta[TAMANO_CUADRICULA][TAMANO_CUADRICULA];
        premios = new String[TAMANO_CUADRICULA][TAMANO_CUADRICULA];
        respondido = new boolean[TAMANO_CUADRICULA][TAMANO_CUADRICULA];
        inicializarCuadricula();
        inicializarPremios();
        
    }

    private void inicializarCuadricula() {
        cuadricula[0][0] = new Pregunta("¿Cuál es la capital de Francia?", "Paris", false, null);
        cuadricula[0][1] = new Pregunta("¿Cuál es la capital de Alemania?", "Berlin", false, null);
        cuadricula[0][2] = new Pregunta("¿Cuál es la capital de Italia?", "Roma", false, null);
        // Preguntas sobre capitales
        cuadricula[0][3] = new Pregunta("¿Cuál es la capital de Rusia?", "Moscu", false, null);
        cuadricula[0][4] = new Pregunta("¿Cuál es la capital de China?", "Pekin", false, null);
        // Preguntas sobre matemáticas
        cuadricula[1][0] = new Pregunta("¿Cuánto es 2 + 2?", "4", false, null);
        cuadricula[1][1] = new Pregunta("¿Cuánto es 10 * 5?", "50", false, null);
        cuadricula[1][2] = new Pregunta("¿Cuánto es 100 / 10?", "10", false, null);
        // Preguntas sobre ciencia
        cuadricula[1][3] = new Pregunta("¿Cuál es el símbolo químico del agua?", "H2O", false, null);
        cuadricula[1][4] = new Pregunta("¿Cuál es el planeta más grande del sistema solar?", "Jupiter", false, null);
        // Preguntas sobre historia
        cuadricula[2][0] = new Pregunta("¿En qué año comenzó la Segunda Guerra Mundial?", "1939", false, null);
        cuadricula[2][1] = new Pregunta("¿Quién fue el primer presidente de Estados Unidos?", "George Washington", false, null);
        cuadricula[2][2] = new Pregunta("¿En qué año se firmó la Declaración de Independencia de Estados Unidos?", "1776", false, null);
        // Preguntas sobre literatura
        cuadricula[2][3] = new Pregunta("¿Quién escribió 'Cien años de soledad'?", "Gabriel García Márquez", false, null);
        cuadricula[2][4] = new Pregunta("¿Cuál es el protagonista de 'El ingenioso hidalgo Don Quijote de la Mancha'?", "Don Quijote", false, null);
        // Preguntas de verdadero/falso
        cuadricula[3][0] = new Pregunta("La Tierra es plana.", "falso", false, null);
        cuadricula[3][1] = new Pregunta("El agua hierve a 100 grados Celsius.", "verdadero", false, null);
        cuadricula[3][2] = new Pregunta("Los humanos pueden respirar bajo el agua.", "falso", false, null);
        // Preguntas de verdadero/falso
        cuadricula[3][3] = new Pregunta("El Sol es una estrella.", "verdadero", false, null);
        cuadricula[3][4] = new Pregunta("La Revolución Francesa ocurrió en el siglo XVIII.", "verdadero", false, null);
        // Preguntas de respuesta múltiple
        cuadricula[4][0] = new Pregunta("¿Cuál es la capital de Australia?","Canberra", true, new String[]{"Sídney", "Melbourne", "Canberra", "Brisbane"});
        cuadricula[4][1] = new Pregunta("¿Cuál es el río más largo del mundo?","Amazonas", true, new String[]{"Nilo", "Amazonas", "Yangtsé", "Mississippi"});
        cuadricula[4][2] = new Pregunta("¿Quién escribió 'Don Quijote de la Mancha'?","Miguel de Cervantes", true, new String[]{"Gabriel García Márquez", "Miguel de Cervantes", "Pablo Neruda", "Federico García Lorca"});
        // Preguntas de respuesta múltiple
        cuadricula[4][3] = new Pregunta("¿Cuál es el río más largo de Europa?","Volga", true, new String[]{"Danubio", "Volga", "Rin", "Támesis"});
        cuadricula[4][4] = new Pregunta("¿Quién pintó la Mona Lisa?","Leonardo da Vinci", true, new String[]{"Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Rembrandt"});
        
    }
    
    private void inicializarPremios() {
        String[] premiosPredeterminados = {
            "Libro", "Tarjeta de regalo", "Cámara", "Viaje", "Ordenador portátil",
            "Videojuego", "Reloj", "Auriculares", "Teléfono móvil", "Cena gratis",
            "Gafas de sol", "Funda para móvil", "Bolsa de deporte", "Paquete de vacaciones", "Tarjeta de gasolina",
            "Bufanda", "Agenda", "Llavero", "Planta de interior", "Entrada para concierto",
            "Kit de maquillaje", "Almohada de viaje", "Revista de cocina", "Botella de vino", "Set de herramientas"
        };
    
        int k = 0;
        for (int i = 0; i < TAMANO_CUADRICULA; i++) {
            for (int j = 0; j < TAMANO_CUADRICULA; j++) {
                premios[i][j] = premiosPredeterminados[k];
                k++;
            }
        }
    }
    
    

    public void iniciarConcurso (){
        Scanner scanner = new Scanner(System.in);
        String[][] premiosConseguidos = new String[TAMANO_CUADRICULA][TAMANO_CUADRICULA];
        boolean salir = false;

        System.out.println("¡Bienvenido al concurso!");
        while (!salir) {
            System.out.println("Ingrese la fila (1-" + TAMANO_CUADRICULA + "): ");
            int fila = scanner.nextInt() - 1;
            System.out.println("Ingrese la columna (1-" + TAMANO_CUADRICULA + "): ");
            int columna = scanner.nextInt() - 1;
            
            if (!respondido[fila][columna]) {
                Pregunta pregunta = cuadricula[fila][columna];
                pregunta.mostrar();
                System.out.println("Ingrese su respuesta: ");
                String respuesta = scanner.next();

                if (pregunta.verificarRespuesta(respuesta)) {
                    System.out.println("¡Respuesta correcta! Ha ganado: " + premios[fila][columna]);
                    premiosConseguidos[fila][columna] = premios[fila][columna];
                } else {
                    System.out.println("¡Respuesta incorrecta! Fin del concurso.");
                    salir = true;
                }
                respondido[fila][columna] = true;
            } else {
                System.out.println("Ya ha respondido a esta pregunta. Por favor, elija otra posición.");
            }
        }
    }
}