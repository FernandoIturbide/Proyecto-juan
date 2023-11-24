package Restaurante;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private Vista vista;
    private final Cola Clientes = new Cola();
    private final Cola Clientes2 = new Cola();
    private Cola cola;
    private Cola cola2;
    private  Fondita fondita;
    private Cliente cliente;
    private JList<String> clientesList; // Cambiado a JList<String>
    private JList<String> clientesList2; // Cambiado a JList<String>
    private JScrollPane spFila1; // Agregado para acceder al JScrollPane
    private JScrollPane spFila2; // Agregado para acceder al JScrollPane
    private JLabel NumClientes1;
    private JLabel NumClientes2;

    private int contador=0,contador2=0;
    public Controlador(Vista vista) {
        this.vista = vista;
        this.vista.getBtnIngreso().addActionListener(this); // Agregado para registrar ActionListener
        this.vista.getAtender1().addActionListener(this);
        this.vista.getAtender2().addActionListener(this);
        this.vista.getAtender2();
        this.vista.getAtender1();
        this.cola = new Cola();
        this.cola2 = new Cola();

        NumClientes1=new JLabel();
        NumClientes2=new JLabel();
        this.cola2.ColaVacia();
        this.cola.ColaVacia();
        this.fondita=new Fondita();

        NumClientes1 = new JLabel();
        NumClientes2 = new JLabel();

        // Otros códigos...

        // Asignar los JLabel a la vista
        this.vista.setNumClientes1(NumClientes1);
        this.vista.setNumClientes2(NumClientes2);

        clientesList = new JList<>(); // Cambiado a JList<String>
        spFila1 = this.vista.getSpFila1(); // Asumiendo que tienes un método para obtener el JScrollPane
        spFila1.setViewportView(clientesList);

        clientesList2 = new JList<>(); // Cambiado a JList<String>
        spFila2 = this.vista.getSpFila2(); // Asumiendo que tienes un método para obtener el JScrollPane
        spFila2.setViewportView(clientesList2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.getBtnIngreso()) {
            String temp = this.vista.getTxtNombre().getText();
            int temp2 = Integer.parseInt(this.vista.getTxtPago().getText());
            this.cliente = new Cliente(temp, temp2);
            this.vista.getTxtNombre().setText("");
            this.vista.getTxtPago().setText("");
            ClientesLlegando(cliente);
        }
        if (e.getSource()==this.vista.getAtender1()){
            CobraryEntregar();
        }
        if (e.getSource()==this.vista.getAtender2()){
            CobraryEntregar2();
        }
    }
    public void ClientesLlegando(Cliente cliente) {
        if (Clientes.Contar() <= Clientes2.Contar()) {
            Clientes.Agregar(cliente);
            System.out.println("Se ingreso al 1");
            this.cola.Agregar(cliente);
            cola.Visualizar(clientesList);
            this.vista.getActu().setText(String.valueOf(cola.Contar()));
            this.vista.getActu3().setText(String.valueOf(cola.Cobro()));

        } else {
            Clientes2.Agregar(cliente);
            System.out.println("Se ingreso al 2");
            this.cola2.Agregar(cliente);
            cola2.Visualizar(clientesList2);
            this.vista.getActu2().setText(String.valueOf(cola2.Contar()));
            this.vista.getActu4().setText(String.valueOf(cola2.Cobro()));
        }
    }
    public void CobraryEntregar() {
        boolean eliminado = this.cola.Eliminar();
        if (eliminado) {
            contador++;
            cola.Visualizar(clientesList);
            this.vista.getActu5().setText(String.valueOf(contador));
            this.vista.getActu().setText(String.valueOf(cola.Contar()));
            this.vista.getActu3().setText(String.valueOf(cola.Cobro()));
        } else {
            JOptionPane.showMessageDialog(vista, "No hay clientes por atender", "Sin clientes", JOptionPane.WARNING_MESSAGE);
        }
    }
    public void CobraryEntregar2() {
        boolean eliminado = this.cola2.Eliminar();
        if (eliminado) {
            contador2++;
            cola2.Visualizar(clientesList2);
            this.vista.getActu6().setText(String.valueOf(contador2));
            this.vista.getActu2().setText(String.valueOf(cola2.Contar()));
            this.vista.getActu4().setText(String.valueOf(cola2.Cobro()));
        } else {
            JOptionPane.showMessageDialog(vista, "No hay clientes por atender", "Sin clientes", JOptionPane.WARNING_MESSAGE);
        }
    }

}

