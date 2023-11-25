package Restaurante;

public class Main {
    public static void main(String[] args) {//Se inicializa el programa
        Vista vista = new Vista("Prueba");
        Controlador controlador = new Controlador(vista);
    }
}
