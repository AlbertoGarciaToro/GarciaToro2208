package vista;

import javax.swing.*;
import java.awt.*;

public class VentanaHoroscopo extends JFrame {
    private JButton botonEliminar;
    private JButton botonActualizar;
    private JLabel lblId;
    private JLabel lblHoroscopo;
    private JLabel lblMesInicio;
    private JLabel lblMesFinal;
    private JLabel lblCompatible;
    private JLabel lblUrlImagen;
    private JTextField txtId;
    private JTextField txtHoroscopo;
    private JTextField txtMesInicio;
    private JTextField txtMesFinal;
    private JTextField txtCompatible;
    private JTextField txtUrlImagen;
    private JButton botonAdd;
    private JButton btnCargar;
    private JTable tabla;
    private JScrollPane scrollPane;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel imagenHoroscopo;

    public VentanaHoroscopo(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        layout = new GridLayout(2, 2);
        this.getContentPane().setLayout(layout);

        //Panel 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(0xF5B5CC));
        lblId = new JLabel("Id:");
        lblHoroscopo = new JLabel("Horoscopo:");
        lblMesInicio = new JLabel("Mes de inicio:");
        lblMesFinal = new JLabel("Mes de finalizacion:");
        lblCompatible = new JLabel("Compatible con:");
        lblUrlImagen = new JLabel("Url de imagen:");
        txtId = new JTextField(10);
        txtHoroscopo = new JTextField(10);
        txtMesInicio = new JTextField(10);
        txtMesFinal = new JTextField(10);
        txtCompatible = new JTextField(15);
        txtUrlImagen = new JTextField(15);
        botonAdd = new JButton("Agregar");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblHoroscopo);
        panel1.add(txtHoroscopo);
        panel1.add(lblMesInicio);
        panel1.add(txtMesInicio);
        panel1.add(lblMesFinal);
        panel1.add(txtMesFinal);
        panel1.add(lblCompatible);
        panel1.add(txtCompatible);
        panel1.add(lblUrlImagen);
        panel1.add(txtUrlImagen);
        panel1.add(botonAdd);


        //Panel 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(0x66EDB2));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tabla = new JTable();
        scrollPane = new JScrollPane(tabla);
        panel2.add(scrollPane);


        //Panel 3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(0xBCDADF));
        imagenHoroscopo = new JLabel("...");
        panel3.add(imagenHoroscopo);


        //Panel 4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(0x72A1A1));
        botonActualizar=new JButton("Acuatizar");
        botonEliminar=new JButton("Eliminar");
        panel4.add(botonActualizar);
        panel4.add(botonEliminar);




        this.getContentPane().add(panel1, 0);
        this.getContentPane().add(panel2, 1);
        this.getContentPane().add(panel3, 2);
        this.getContentPane().add(panel4, 3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblHoroscopo() {
        return lblHoroscopo;
    }

    public void setLblHoroscopo(JLabel lblHoroscopo) {
        this.lblHoroscopo = lblHoroscopo;
    }

    public JLabel getLblMesInicio() {
        return lblMesInicio;
    }

    public void setLblMesInicio(JLabel lblMesInicio) {
        this.lblMesInicio = lblMesInicio;
    }

    public JLabel getLblMesFinal() {
        return lblMesFinal;
    }

    public void setLblMesFinal(JLabel lblMesFinal) {
        this.lblMesFinal = lblMesFinal;
    }

    public JLabel getLblCompatible() {
        return lblCompatible;
    }

    public void setLblCompatible(JLabel lblCompatible) {
        this.lblCompatible = lblCompatible;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JLabel getImagenHoroscopo() {
        return imagenHoroscopo;
    }

    public void setImagenHoroscopo(JLabel imagenHoroscopo) {
        this.imagenHoroscopo = imagenHoroscopo;
    }

    public JLabel getLblUrlImagen() {
        return lblUrlImagen;
    }

    public void setLblUrlImagen(JLabel lblUrlImagen) {
        this.lblUrlImagen = lblUrlImagen;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtHoroscopo() {
        return txtHoroscopo;
    }

    public void setTxtHoroscopo(JTextField txtHoroscopo) {
        this.txtHoroscopo = txtHoroscopo;
    }

    public JTextField getTxtMesInicio() {
        return txtMesInicio;
    }

    public void setTxtMesInicio(JTextField txtMesInicio) {
        this.txtMesInicio = txtMesInicio;
    }

    public JTextField getTxtMesFinal() {
        return txtMesFinal;
    }

    public void setTxtMesFinal(JTextField txtMesFinal) {
        this.txtMesFinal = txtMesFinal;
    }

    public JTextField getTxtCompatible() {
        return txtCompatible;
    }

    public void setTxtCompatible(JTextField txtCompatible) {
        this.txtCompatible = txtCompatible;
    }

    public JTextField getTxtUrlImagen() {
        return txtUrlImagen;
    }

    public void setTxtUrlImagen(JTextField txtUrlImagen) {
        this.txtUrlImagen = txtUrlImagen;
    }

    public JButton getBotonAdd() {
        return botonAdd;
    }

    public void setBotonAdd(JButton botonAdd) {
        this.botonAdd = botonAdd;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JButton getBotonEliminar() {
        return botonEliminar;
    }

    public void setBotonEliminar(JButton botonEliminar) {
        this.botonEliminar = botonEliminar;
    }

    public JButton getBotonActualizar() {
        return botonActualizar;
    }

    public void setBotonActualizar(JButton botonActualizar) {
        this.botonActualizar = botonActualizar;
    }
}
