package models;

/**
 * Clase que representa el efecto de curación de un item.
 * Implementa la interfaz EfectoItem.
 */
public class EfectoCuracion implements EfectoItem {

    private int cantidadCuracion;

    /**
     * Constructor para inicializar el efecto de curación con la cantidad especificada.
     * 
     * @param cantidadCuracion Cantidad de puntos de vida a curar.
     */
    public EfectoCuracion(int cantidadCuracion) {
        if (cantidadCuracion < 0) {
            throw new IllegalArgumentException("La cantidad de curación no puede ser negativa.");
        }
        this.cantidadCuracion = cantidadCuracion;
    }

    /**
     * Aplica el efecto de curación a un jugador.
     * 
     * @param jugador El jugador que recibirá el efecto.
     * @param nombre El nombre del ítem que aplicará el efecto.
     */
    @Override
    public void aplicarEfecto(Jugador jugador, String nombre) {
        if (jugador == null) {
            throw new IllegalArgumentException("El jugador no puede ser nulo.");
        }
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del ítem no puede ser nulo o vacío.");
        }

        jugador.curarse(cantidadCuracion, nombre);
    }
}
