package cl.ufrontera.ruleta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Resultado> historial = new ArrayList<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarAlHistorial(Resultado r) {
        this.historial.add(r);
    }

    public List<Resultado> getHistorial() {
        return historial;
    }
}