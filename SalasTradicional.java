public class SalaTradicional extends Reserva {
    private int duracionMin;
    private int duracion;  

    public SalaTradicional(String codigo, String pelicula, double costoBase, int duracionMin) {
        super(codigo, pelicula, costoBase);
        this.duracionMin = duracionMin;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + " - Duración: " + duracionMin + " min";
    }
}