import java.util.List;
import java.util.Scanner;

public class Main {
    private TableroVirtual tablero = new TableroVirtual();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main programa = new Main();
        programa.iniciar();
    }

    public void iniciar() {
        tablero.iniciarJuego();
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    mostrarCartas(tablero.obtenerCartas());
                    break;
                case 2:
                    mostrarMensaje("Escribe el ID:");
                    int id = leerOpcion();
                    mostrarCarta(tablero.buscarCarta(id));
                    break;
                case 3:
                    mostrarMensaje("Escribe el nombre completo de la carta:");
                    String nombre = scanner.nextLine();
                    mostrarCarta(tablero.buscarCarta(nombre));
                    break;
                case 4:
                    tablero.ordenarMazo();
                    mostrarMensaje("Mazo ordenado de menor a mayor costo:");
                    mostrarCartas(tablero.obtenerCartas());
                    break;
                case 5:
                    mostrarMensaje("Escribe el ID de la carta que quieres jugar:");
                    int idJugar = leerOpcion();
                    mostrarMensaje(tablero.jugarCarta(idJugar));
                    break;
                case 0:
                    mostrarMensaje("Gracias por jugar.");
                    break;
                default:
                    mostrarMensaje("Opcion no valida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }

    public void mostrarMenu() {
        System.out.println("\n--- BATALLAS DE CARTAS ---");
        System.out.println("1. Listar cartas");
        System.out.println("2. Buscar por ID");
        System.out.println("3. Buscar por nombre");
        System.out.println("4. Ordenar por costo de energia");
        System.out.println("5. Jugar una carta");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opcion: ");
    }

    public int leerOpcion() {
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            mostrarMensaje("Debes escribir un numero entero:");
        }
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarCartas(List<Carta> cartas) {
        for (Carta carta : cartas) {
            mostrarCarta(carta);
        }
    }

    public void mostrarCarta(Carta carta) {
        if (carta == null) {
            mostrarMensaje("No se encontro la carta.");
        } else {
            mostrarMensaje("------------------------------");
            mostrarMensaje(carta.toString());
        }
    }
}
