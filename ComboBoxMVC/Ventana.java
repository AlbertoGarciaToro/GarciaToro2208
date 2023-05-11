package ComboBoxMVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana extends JFrame{
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton boton;
    private JComboBox combo;
    private NombreModeloCombo modelo;

    //  GARCIA TORO ALBERTO  2208

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(400,400);
        setLayout(new FlowLayout());
        lblNombre=new JLabel("ingresaa un nombre:");
        this.getContentPane().add(lblNombre);
        txtNombre=new JTextField(30);
        getContentPane().add(txtNombre);
        boton=new JButton("Agregar");
        getContentPane().add(boton);
        //Configurar el modelo

        modelo= new NombreModeloCombo();
        modelo.agregarNombre("diana");
        modelo.agregarNombre("diego");
        modelo.agregarNombre("Susana");
        combo=new JComboBox(modelo);
        this.getContentPane().add(combo);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String nuevo=txtNombre.getText();
                modelo.agregarNombre(nuevo);
                txtNombre.setText(" ");
            }
        });
        combo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(combo.getSelectedIndex());
                System.out.println(combo.getSelectedItem());
                JOptionPane.showMessageDialog(null,"hola"+combo.getSelectedItem());
            }
        });
    }
}
