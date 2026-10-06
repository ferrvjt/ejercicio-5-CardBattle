public class CartaEventoCampus extends Carta {
    private String efecto;
    private int duracionTurnos;

    public CartaEventoCampus(int id, String nombre, int costoEnergia,
            String descripcion, String efecto, int duracionTurnos) {
        super(id, nombre, costoEnergia, descripcion);
        this.efecto = efecto;
        this.duracionTurnos = duracionTurnos;
    }

    public String getEfecto() { return efecto; }
    public int getDuracionTurnos() { return duracionTurnos; }

    @Override
    public String jugarCarta() {
        return "Se activa el evento " + getNombre() + ".\nEfecto: " + efecto
            + "\nDuracion: " + duracionTurnos + " turnos.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Evento Campus"
            + "\nEfecto: " + efecto + "\nDuracion en turnos: " + duracionTurnos;
    }
}
