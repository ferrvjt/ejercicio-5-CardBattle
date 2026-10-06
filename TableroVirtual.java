import java.util.List;

// Controlador: comunica Main con el modelo.
public class TableroVirtual {
    private Mazo mazo;

    public TableroVirtual() {
        mazo = new Mazo();
    }

    public void iniciarJuego() {
        mazo.cargarCartasIniciales();
    }

    public List<Carta> obtenerCartas() {
        return mazo.listarCartas();
    }

    public Carta buscarCarta(int id) {
        return mazo.buscarCarta(id);
    }

    public Carta buscarCarta(String nombre) {
        return mazo.buscarCarta(nombre);
    }

    public void ordenarMazo() {
        mazo.ordenarPorCosto();
    }

    public String jugarCarta(int id) {
        Carta carta = mazo.buscarCarta(id);
        if (carta == null) {
            return "No se encontro una carta con ese ID.";
        }
        // Polimorfismo: Java ejecuta la version de la clase hija.
        return carta.jugarCarta();
    }
}
