import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    // Una sola lista para los dos tipos de cartas.
    private ArrayList<Carta> cartas;

    public Mazo() {
        cartas = new ArrayList<Carta>();
    }

    public void cargarCartasIniciales() {
        // Evita duplicar las cartas si se vuelve a iniciar el juego.
        cartas.clear();
        agregarCarta(new CartaCatedratico(1, "Profe Ana", 4,
            "Experta en numeros", "Matematica", 3, 20, "Calculo", 5, 4));
        agregarCarta(new CartaCatedratico(2, "Profe Luis", 2,
            "Ensenia a programar", "Computacion", 2, 30, "Programacion", 4, 3));
        agregarCarta(new CartaCatedratico(3, "Profe Maria", 5,
            "Realiza experimentos", "Ciencias", 4, 15, "Fisica", 5, 5));
        agregarCarta(new CartaCatedratico(4, "Profe Carlos", 3,
            "Explica las reacciones", "Ciencias", 2, 25, "Quimica", 4, 3));
        agregarCarta(new CartaCatedratico(5, "Profe Sofia", 1,
            "Promueve la lectura", "Humanidades", 1, 40, "Literatura", 3, 2));
        agregarCarta(new CartaEventoCampus(6, "Semana de Parciales", 5,
            "Llegaron las evaluaciones", "Aumenta la dificultad del tablero", 2));
        agregarCarta(new CartaEventoCampus(7, "Feria de Clubes", 1,
            "Actividades estudiantiles", "Mejora el animo de los estudiantes", 1));
        agregarCarta(new CartaEventoCampus(8, "Hora Libre", 2,
            "Descanso entre clases", "Permite recuperar energia", 1));
        agregarCarta(new CartaEventoCampus(9, "Proyecto Final", 4,
            "Entrega del semestre", "Aumenta la carga academica", 3));
        agregarCarta(new CartaEventoCampus(10, "Tutoria", 3,
            "Apoyo para estudiar", "Reduce la dificultad del tablero", 2));
    }

    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    public List<Carta> listarCartas() {
        // Permite leer la lista, pero no modificarla desde Main.
        return Collections.unmodifiableList(cartas);
    }

    // Sobrecarga: mismo nombre, diferente tipo de parametro.
    public Carta buscarCarta(int id) {
        for (Carta carta : cartas) {
            if (carta.getId() == id) {
                return carta;
            }
        }
        return null;
    }

    public Carta buscarCarta(String nombre) {
        for (Carta carta : cartas) {
            if (carta.getNombre().equalsIgnoreCase(nombre.trim())) {
                return carta;
            }
        }
        return null;
    }

    public void ordenarPorCosto() {
        // sort utiliza el compareTo definido en Carta.
        Collections.sort(cartas);
    }
}
