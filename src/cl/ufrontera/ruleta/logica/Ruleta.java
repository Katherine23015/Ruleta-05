package cl.ufrontera.ruleta.logica;

import cl.ufrontera.ruleta.modelo.Resultado;
import cl.ufrontera.ruleta.modelo.Usuario;

public class Ruleta {

    public void girar(Usuario jugador, int apuesta, String colorElegido) {
        int nro = (int)(Math.random() * 37);
        String colorResultado = (nro % 2 == 0) ? "ROJO" : "NEGRO";
        boolean gano = colorElegido.equalsIgnoreCase(colorResultado);
        Resultado r = new Resultado(nro, colorResultado, gano, gano ? apuesta : -apuesta);
        jugador.agregarAlHistorial(r);
    }
}
