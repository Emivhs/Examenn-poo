public class Main {
    public static void main(String[] args) {

        GestorReservas gestor = new GestorReservas(4);

        SalaTradicional s1 = new SalaTradicional("T1", "Matrix", 20.0, 120);
        SalaTradicional s2 = new SalaTradicional("T2", "Avatar", 18.0, 140);

        Sala3D s3 = new Sala3D("3D1", "Mario Bros", 22.0, 5.0);
        Sala3D s4 = new Sala3D("3D2", "Titanic 3D", 25.0, 7.0);

        gestor.agregarReserva(s1);
        gestor.agregarReserva(s2);
        gestor.agregarReserva(s3);
        gestor.agregarReserva(s4);

        for (Reserva r : gestor.getReservas()) {
            System.out.println(r.obtenerDetalles());
        }
    }
}