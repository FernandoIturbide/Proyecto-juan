package Restaurante;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista("Prueba");
        Controlador controlador = new Controlador(vista);
    }
}
