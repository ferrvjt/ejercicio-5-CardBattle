public class CartaCatedratico extends Carta {
    private String departamento;
    private int llamadasAtencion;
    private int tiempoAtencion;
    private String materia;
    private int creditos;
    private int nivelDificultad;

    public CartaCatedratico(int id, String nombre, int costoEnergia,
            String descripcion, String departamento, int llamadasAtencion,
            int tiempoAtencion, String materia, int creditos, int nivelDificultad) {
        // super llama al constructor de Carta.
        super(id, nombre, costoEnergia, descripcion);
        this.departamento = departamento;
        this.llamadasAtencion = llamadasAtencion;
        this.tiempoAtencion = tiempoAtencion;
        this.materia = materia;
        this.creditos = creditos;
        this.nivelDificultad = nivelDificultad;
    }

    public String getDepartamento() { return departamento; }
    public int getLlamadasAtencion() { return llamadasAtencion; }
    public int getTiempoAtencion() { return tiempoAtencion; }
    public String getMateria() { return materia; }
    public int getCreditos() { return creditos; }
    public int getNivelDificultad() { return nivelDificultad; }

    @Override
    public String jugarCarta() {
        return getNombre() + " imparte " + materia + " y realiza "
            + llamadasAtencion + " llamadas de atencion."
            + "\nLa materia aporta " + creditos + " creditos y tiene dificultad "
            + nivelDificultad + ".";
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Catedratico"
            + "\nDepartamento: " + departamento
            + "\nLlamadas de atencion: " + llamadasAtencion
            + "\nTiempo de atencion (minutos): " + tiempoAtencion
            + "\nMateria: " + materia + "\nCreditos: " + creditos
            + "\nNivel de dificultad: " + nivelDificultad;
    }
}
