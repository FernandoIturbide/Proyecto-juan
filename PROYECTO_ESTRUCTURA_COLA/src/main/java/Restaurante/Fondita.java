package Restaurante;

import javax.swing.*;

public final class Fondita {//No se usó directamente
    private final Cola Clientes = new Cola();
    private final Cola Clientes2 = new Cola();

    private  int Atendidos;
    private int Atendidos2;

    public Fondita(){
        Atendidos = 0;
        Atendidos2 = 0;
    }

    public void Mostrar(JList Fila1, JList Fila2){
        Clientes.Visualizar(Fila1);
        Clientes2.Visualizar(Fila2);
    }

    public void CobraryEntregar(JLabel atendidos){
        if(Clientes.Eliminar()){
            Atendidos++;
        }
        atendidos.setText(" " + Atendidos);
    }

    public void CobraryEntregar2(JLabel atendidos){
        if(Clientes2.Eliminar()){
            Atendidos2++;
        }
        atendidos.setText(" " + Atendidos2);
    }

    public float SumarGananciasTotales(){
        return Clientes.Cobro() + Clientes2.Cobro();
    }

    public void ClientesLlegando(Cliente cliente){
        if (Clientes.Contar() <= Clientes2.Contar()) {
            Clientes.Agregar(cliente);
            System.out.println("Se ingreso al 1");
        } else {
            Clientes2.Agregar(cliente);
            System.out.println("Se ingreso al 2");
        }
    }

    void VerDinero(JLabel saldo1, JLabel saldo2){
        saldo1.setText(" " + Clientes.Cobro());
        saldo2.setText(" " + Clientes2.Cobro());
    }

    void VerClientes(JLabel custom1, JLabel custom2){
        custom1.setText(" " + Clientes.Contar());
        custom2.setText(" " + Clientes2.Contar());
    }
}
