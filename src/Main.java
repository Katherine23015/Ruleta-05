package cl.ufrontera.ruleta;

import cl.ufrontera.ruleta.modelo.Usuario;
import cl.ufrontera.ruleta.logica.Ruleta;
import cl.ufrontera.ruleta.vista.VistaHistorial;

public class Main {
    public static void main(String[] args) {
        Usuario jugador = new Usuario("Pepe");
        Ruleta ruleta = new Ruleta();

        System.out.println("--- Iniciando Juego ---");
        ruleta.girar(jugador, 500, "ROJO");
        ruleta.girar(jugador, 1000, "NEGRO");
        ruleta.girar(jugador, 200, "ROJO");


        int totalJugadas = jugador.getHistorial().size();
        System.out.println("Jugadas guardadas en memoria: " + totalJugadas);

        if (totalJugadas > 0) {
            System.out.println("Abriendo ventana con datos...");
            new VistaHistorial(jugador);
        } else {
            System.out.println("ERROR: No se puede abrir la vista porque no hay datos.");
        }
    }
}

