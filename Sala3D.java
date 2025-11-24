public class Sala3D extends Reserva {
    private double valorLentes;

    public Sala3D(String codigo, String pelicula, double costoBase, double valorLentes) {
        super(codigo, pelicula, costoBase);
        this.valorLentes = valorLentes;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + " - Valor Lentes: " + (valorLentes * 2);
    }
}