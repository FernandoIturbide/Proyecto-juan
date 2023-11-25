package Restaurante;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
public class Vista extends JFrame {//Vista con elementos pero sin eventos
    private JPanel Panel1;
    private JLabel lblBienvenida;
    private JButton btnIngreso;
    private JPanel panIngreso;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblPago;
    private JTextField txtPago;
    private JButton btnIngreso2dentro;
    private JLabel lblCobrototal;
    private JLabel lblSumacobrototal;
    private JPanel Panel2;
    private JList lstFila1;
    private JScrollPane spFila1;
    private JList lstFila2;
    private JScrollPane spFila2;
    private JLabel Fila1;
    private JLabel Fila2;
    private JLabel Clientesfila1;
    private JLabel NumClientes1;
    private JLabel SumaFila1;
    private JLabel NumSuma1;
    private JLabel Atendidosfila1;
    private JLabel NumAtendidos1;
    private JLabel Clientesfila2;
    private JLabel NumClientes2;
    private JLabel SumaFila2;
    private JLabel NumSuma2;
    private JLabel Atendidosfila2;
    private JLabel NumAtendidos2;
    private JButton Atender1;
    private JButton Atender2;
    private DefaultListModel Modelo;
    private JTextField Actu;
    private JTextField Actu2;
    private JTextField Actu3;
    private JTextField Actu4;
    private JTextField Actu5;
    private JTextField Actu6;

    String[] strings = {""};

    public Vista(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 800);

        //Panel inicial
        setLayout(null);
        Panel1 = new JPanel();
        Panel1.setBackground(new Color(190, 75, 27));
        Panel1.setSize(600,200);
        Panel1.setBounds(0, 0,800,60);
        btnIngreso = new JButton("Ingresar cliente");
        btnIngreso.setSize(20,80);
        btnIngreso.setBounds(10,10,100,100);
        lblCobrototal = new JLabel("Dinero Total: ");
        lblSumacobrototal = new JLabel(" 0 ");
        lblNombre = new JLabel("Nombre: ");
        txtNombre = new JTextField(15);
        lblPago = new JLabel("Cantidad a cobrar: ");
        txtPago = new JTextField(6);
        Panel1.add(lblNombre);
        Panel1.add(txtNombre);
        Panel1.add(lblPago);
        Panel1.add(txtPago);
        Panel1.add(btnIngreso);
        Panel1.add(lblCobrototal);
        Panel1.add(lblSumacobrototal);


        //Panel de filas

        Fila1 = new JLabel("FILA 1");
        Fila1.setBounds(230,110, 50, 20);
        Fila2 = new JLabel("FILA 2");
        Fila2.setBounds(530,110, 50, 20);



        lstFila1 = new JList(strings);
        spFila1 = new JScrollPane(lstFila1);
        spFila1.setBounds(170,150,160,350);
        spFila1.setBorder(new LineBorder(Color.orange,3,true));
        add(spFila1);


        lstFila2 = new JList(strings);
        spFila2 = new JScrollPane(lstFila2);
        spFila2.setBounds(470,150,160,350);
        spFila2.setBorder(new LineBorder(Color.orange, 3, true));
        add(spFila2);

        Clientesfila1 = new JLabel("Clientes: ");
        Clientesfila1.setBounds(170,520,80,11);
        NumClientes1 = new JLabel("0");
        NumClientes1.setBounds(225,520,50,11);
        Actu = new JTextField("0");
        Actu.setBounds(225,520,50,15);
        Actu.setEditable(false);
        Clientesfila2 = new JLabel("Clientes: ");
        Clientesfila2.setBounds(470, 520,80,11);
        NumClientes2 = new JLabel("0");
        NumClientes2.setBounds(525,520,50,11);
        Actu2 = new JTextField("0");
        Actu2.setBounds(525,520,50,15);
        Actu2.setEditable(false);
        SumaFila1 = new JLabel("Dinero total: ");
        SumaFila1.setBounds(170,540,80,15);
        NumSuma1 = new JLabel("0");
        NumSuma1.setBounds(245,540,50,15);
        Actu3 = new JTextField("0");
        Actu3.setBounds(245,540,50,15);
        Actu3.setEditable(false);
        SumaFila2 = new JLabel("Dinero Total: ");
        SumaFila2.setBounds(470,540,80,15);
        NumSuma2 = new JLabel("0");
        NumSuma2.setBounds(550,540,50,15);
        Actu4 = new JTextField("0");
        Actu4.setBounds(550,540,50,15);
        Actu4.setEditable(false);
        Atendidosfila1 = new JLabel("Clientes atendidos: ");
        Atendidosfila1.setBounds(170,565,120,11);
        NumAtendidos1 = new JLabel("0");
        NumAtendidos1.setBounds(285,565,50,11);
        Actu5 = new JTextField("0");
        Actu5.setBounds(285,565,50,15);
        Actu5.setEditable(false);
        Atendidosfila2 = new JLabel("Clientes atendidos: ");
        Atendidosfila2.setBounds(470, 565,120,11);
        NumAtendidos2 = new JLabel("0");
        NumAtendidos2.setBounds(585,565,50,11);
        Actu6 = new JTextField("0");
        Actu6.setBounds(585,565,50,15);
        Actu6.setEditable(false);
        Atender1 = new JButton("Atender clientes (:");
        Atender1.setBounds(180,595,150,50);
        Atender2 = new JButton("Atender clientes (:");
        Atender2.setBounds(480, 595, 150,50 );
        add(Fila1);
        add(Fila2);
        add(Clientesfila1);
        add(Clientesfila2);
        add(SumaFila1);
        add(SumaFila2);
        add(Atendidosfila1);
        add(Atendidosfila2);
        add(Atender1);
        add(Atender2);
        add(Actu);
        add(Actu2);
        add(Actu3);
        add(Actu4);
        add(Actu5);
        add(Actu6);

        this.getContentPane().add(Panel1, 0);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JPanel getPanel1() {
        return Panel1;
    }

    public void setPanel1(JPanel panel1) {
        Panel1 = panel1;
    }

    public JButton getBtnIngreso() {
        return btnIngreso;
    }

    public void setBtnIngreso(JButton btnIngreso) {
        this.btnIngreso = btnIngreso;
    }

    public JPanel getPanIngreso() {
        return panIngreso;
    }

    public void setPanIngreso(JPanel panIngreso) {
        this.panIngreso = panIngreso;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JLabel getLblPago() {
        return lblPago;
    }

    public void setLblPago(JLabel lblPago) {
        this.lblPago = lblPago;
    }

    public JTextField getTxtPago() {
        return txtPago;
    }

    public void setTxtPago(JTextField txtPago) {
        this.txtPago = txtPago;
    }

    public JButton getBtnIngreso2dentro() {
        return btnIngreso2dentro;
    }

    public void setBtnIngreso2dentro(JButton btnIngreso2dentro) {
        this.btnIngreso2dentro = btnIngreso2dentro;
    }

    public JLabel getLblCobrototal() {
        return lblCobrototal;
    }

    public void setLblCobrototal(JLabel lblCobrototal) {
        this.lblCobrototal = lblCobrototal;
    }

    public JLabel getLblSumacobrototal() {
        return lblSumacobrototal;
    }

    public void setLblSumacobrototal(JLabel lblSumacobrototal) {
        this.lblSumacobrototal = lblSumacobrototal;
    }

    public JList getLstFila1() {
        return lstFila1;
    }

    public void setLstFila1(JList lstFila1) {
        this.lstFila1 = lstFila1;
    }

    public JScrollPane getSpFila1() {
        return spFila1;
    }

    public void setSpFila1(JScrollPane spFila1) {
        this.spFila1 = spFila1;
    }

    public JList getLstFila2() {
        return lstFila2;
    }

    public void setLstFila2(JList lstFila2) {
        this.lstFila2 = lstFila2;
    }

    public JScrollPane getSpFila2() {
        return spFila2;
    }

    public void setSpFila2(JScrollPane spFila2) {
        this.spFila2 = spFila2;
    }

    public JLabel getFila1() {
        return Fila1;
    }

    public void setFila1(JLabel fila1) {
        Fila1 = fila1;
    }

    public JLabel getFila2() {
        return Fila2;
    }

    public void setFila2(JLabel fila2) {
        Fila2 = fila2;
    }

    public JLabel getClientesfila1() {
        return Clientesfila1;
    }

    public void setClientesfila1(JLabel clientesfila1) {
        Clientesfila1 = clientesfila1;
    }

    public JLabel getNumClientes1() {
        return NumClientes1;
    }

    public void setNumClientes1(JLabel numClientes1) {
        NumClientes1 = numClientes1;
    }

    public JLabel getSumaFila1() {
        return SumaFila1;
    }

    public void setSumaFila1(JLabel sumaFila1) {
        SumaFila1 = sumaFila1;
    }

    public JLabel getNumSuma1() {
        return NumSuma1;
    }

    public void setNumSuma1(JLabel numSuma1) {
        NumSuma1 = numSuma1;
    }

    public JLabel getAtendidosfila1() {
        return Atendidosfila1;
    }

    public void setAtendidosfila1(JLabel atendidosfila1) {
        Atendidosfila1 = atendidosfila1;
    }

    public JLabel getNumAtendidos1() {
        return NumAtendidos1;
    }

    public void setNumAtendidos1(JLabel numAtendidos1) {
        NumAtendidos1 = numAtendidos1;
    }

    public JLabel getClientesfila2() {
        return Clientesfila2;
    }

    public void setClientesfila2(JLabel clientesfila2) {
        Clientesfila2 = clientesfila2;
    }

    public JLabel getNumClientes2() {
        return NumClientes2;
    }

    public void setNumClientes2(JLabel numClientes2) {
        NumClientes2 = numClientes2;
    }

    public JLabel getSumaFila2() {
        return SumaFila2;
    }

    public void setSumaFila2(JLabel sumaFila2) {
        SumaFila2 = sumaFila2;
    }

    public JLabel getNumSuma2() {
        return NumSuma2;
    }

    public void setNumSuma2(JLabel numSuma2) {
        NumSuma2 = numSuma2;
    }

    public JLabel getAtendidosfila2() {
        return Atendidosfila2;
    }

    public void setAtendidosfila2(JLabel atendidosfila2) {
        Atendidosfila2 = atendidosfila2;
    }

    public JLabel getNumAtendidos2() {
        return NumAtendidos2;
    }

    public void setNumAtendidos2(JLabel numAtendidos2) {
        NumAtendidos2 = numAtendidos2;
    }

    public JButton getAtender1() {
        return Atender1;
    }

    public void setAtender1(JButton atender1) {
        Atender1 = atender1;
    }

    public JButton getAtender2() {
        return Atender2;
    }

    public void setAtender2(JButton atender2) {
        Atender2 = atender2;
    }

    public DefaultListModel getModelo() {
        return Modelo;
    }

    public void setModelo(DefaultListModel modelo) {
        Modelo = modelo;
    }

    public JTextField getActu() {
        return Actu;
    }

    public void setActu(JTextField actu) {
        Actu = actu;
    }

    public JTextField getActu2() {
        return Actu2;
    }

    public void setActu2(JTextField actu2) {
        Actu2 = actu2;
    }

    public JTextField getActu3() {
        return Actu3;
    }

    public void setActu3(JTextField actu3) {
        Actu3 = actu3;
    }

    public JTextField getActu4() {
        return Actu4;
    }

    public void setActu4(JTextField actu4) {
        Actu4 = actu4;
    }

    public JTextField getActu5() {
        return Actu5;
    }

    public void setActu5(JTextField actu5) {
        Actu5 = actu5;
    }

    public JTextField getActu6() {
        return Actu6;
    }

    public void setActu6(JTextField actu6) {
        Actu6 = actu6;
    }

    public void limpiar(){
        NumClientes1.setText("");
        NumClientes2.setText("");
    }

}

