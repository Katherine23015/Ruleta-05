package cl.ufrontera.ruleta.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Usuario {
    private String nombre;
    private final List<Resultado> historial = new ArrayList<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAlHistorial(Resultado r) {
        this.historial.add(r);
    }

    public List<Resultado> getHistorial() {
        return Collections.unmodifiableList(historial);
    }
}