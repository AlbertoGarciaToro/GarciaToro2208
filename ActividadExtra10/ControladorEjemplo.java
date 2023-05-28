package org.SQLiteDemo.ActividadExtra10;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;

public class ControladorEjemplo extends MouseAdapter {
    private Ventana view;

    public ControladorEjemplo(Ventana view) {
        this.view = view;
        this.view.getBtnEntrada().addMouseListener(this);
        this.view.getBtnMensaje().addMouseListener(this);
        this.view.getBtnOpcion().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       if (e.getSource()== view.getBtnMensaje()){
          // System.out.println("Mensaje");
           ImageIcon icon=new ImageIcon("Icon.png");
           JOptionPane.showMessageDialog(view,
                   "Hola desde el ejemplo",
                   "Titulo Personalizado",
                   JOptionPane.ERROR_MESSAGE,icon);
       }
        if (e.getSource()== view.getBtnEntrada()){
            //System.out.println("Entrada");
            String datos=JOptionPane.showInputDialog(view,"ejemplo de entrada","Titulo personalizado",JOptionPane.QUESTION_MESSAGE
            );
            this.view.getLblResultado().setText(datos);
        }
        if (e.getSource()== view.getBtnOpcion()){
            //System.out.println("Opcion");
            int respuesta =JOptionPane.showConfirmDialog(view,"Estas seguro de borrar el registro",
                    "Confirmacion,",
                    JOptionPane.YES_NO_OPTION);
            if (respuesta== JOptionPane.YES_NO_OPTION){
                view.getLblResultado().setText(" elejiste opcion SI");

            }else {
                view.getLblResultado().setText(" elejiste opcion NO");

            }
        }
    }
}
