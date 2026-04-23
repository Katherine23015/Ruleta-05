package cl.ufrontera.ruleta.modelo;

public class Resultado {
    private int numero;
    private String color;
    private boolean gano;
    private int monto;

    public Resultado(int numero, String color, boolean gano, int monto) {
        this.numero = numero;
        this.color = color;
        this.gano = gano;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return String.format("N° %d (%s) - %s: $%d",
                numero, color, gano ? "GANASTE" : "PERDISTE", monto);
    }
}
