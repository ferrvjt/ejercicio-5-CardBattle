// Clase padre: contiene lo que todas las cartas tienen en comun.
public abstract class Carta implements Comparable<Carta> {
    private int id;
    private String nombre;
    private int costoEnergia;
    private String descripcion;

    public Carta(int id, String nombre, int costoEnergia, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.costoEnergia = costoEnergia;
        this.descripcion = descripcion;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getCostoEnergia() { return costoEnergia; }
    public String getDescripcion() { return descripcion; }

    // Cada hija debe escribir su propia version de este metodo.
    public abstract String jugarCarta();

    @Override
    public int compareTo(Carta otra) {
        if (costoEnergia < otra.getCostoEnergia()) {
            return -1;
        } else if (costoEnergia > otra.getCostoEnergia()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNombre: " + nombre
            + "\nCosto de energia: " + costoEnergia
            + "\nDescripcion: " + descripcion;
    }
}
