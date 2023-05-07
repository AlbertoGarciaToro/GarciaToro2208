package LayoutsSwing;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class Ventana extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JLabel etiquetaPanel2;
    private JPanel panel3;
    private JPanel panel4;
    private GridLayout layout;
    private Button botonPanel1;
    private JLabel etiquetaPanel;
    private JComboBox<String> comboBox;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout=new GridLayout(2,2);
        this.getContentPane().setLayout(layout);
        //panel 1
        panel1=new JPanel();
        panel1.setBackground(new Color(248, 98, 196));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        botonPanel1=new Button("presioname");
        this.getContentPane().add(panel1,0);
        panel1.add(botonPanel1);
        etiquetaPanel=new JLabel("......");
        panel1.add(etiquetaPanel);
        botonPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiquetaPanel.setText("Hola presionaste el boton del panel 1");
            }
        });

        //panel 2
        String urlImagen="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3PPypYFojUWqKiXrLbs6r8rNA9aNIbBsyyw&usqp=CAU";

        panel2=new JPanel();
        panel2.setLayout(new FlowLayout());
        //Cargar imagen de internet
        try {
            URL url=new URL(urlImagen);
            Image imagen= ImageIO.read(url);
            ImageIcon imageIcon=new ImageIcon(imagen);
            etiquetaPanel2=new JLabel(imageIcon);
            panel2.setBackground(Color.BLUE);
            panel2.add(etiquetaPanel2);
            this.getContentPane().add(panel2,1);
        }catch (MalformedURLException me){
            System.out.println("url no valido");
        }catch (Exception e){
            System.out.println("error al cargar la imagen");
        }


        //panel 3
        panel3=new JPanel();
        panel3.setBackground(Color.RED);
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
        String[] elementos={"opcion 1","opcion 2","opcion 3","opcion 4"};
        comboBox=new JComboBox<>(elementos);
        comboBox.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().toString());
                System.out.println(comboBox.getSelectedIndex());
            }
        });
        panel3.add(comboBox);
        this.getContentPane().add(panel3,2);


        //panel 4
        panel4=new JPanel();
        panel4.setBackground(Color.GREEN);
        this.getContentPane().add(panel4,3);

        this.setVisible(true);

    }
}
